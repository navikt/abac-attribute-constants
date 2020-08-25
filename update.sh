#!/bin/bash
set -e
set -x

parent_version=`mvn help:evaluate -Dexpression=project.version -q -DforceStdout`

modules=(
    "abac-common-attributes-alfa"
    "abac-veilarb-policies-alfa"
)

##############################################################
# TODO remove when release points to a true release candidate
declare -A versionMap
versionMap=(
    ["abac-common-attributes-alfa"]="4.0.4"
    ["abac-veilarb-policies-alfa"]="4.4.0"
)
##############################################################

function downloadModule(){
    module=$1
    echo "downloading ${module}"

    # TODO replace with RELEASE
    version="${versionMap[$module]}"

    # download and unpack latest release
    rm -rf target/
    mvn dependency:unpack \
    -U \
    -DremoteRepositories=https://repo.adeo.no/repository/maven-releases/ \
    -Dartifact=no.nav.abac.policies:${module}:${version}:jar:attributes \

    # resolve version from META-INF
    pom_properties=$(cat target/dependency/META-INF/maven/no.nav.abac.policies/${module}/pom.properties)
    file="target/dependency/META-INF/maven/no.nav.abac.policies/${module}/pom.properties"
    version_regex="version=([\.a-zA-Z0-9]+)"
    if [[ ${pom_properties} =~ $version_regex ]]
    then
        version="${BASH_REMATCH[1]}"
    else
        exit 1
    fi

    # replace src-directory
    src_directory="${module}/src/"
    rm -rf ${module}/src/
    mkdir -p ${module}/src/main/java
    mv target/dependency/no ${module}/src/main/java

    # generate pom.xml
    echo """<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd\">
    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>no.nav.abac.policies</groupId>
        <artifactId>abac-attribute-constants</artifactId>
        <version>${parent_version}</version>
    </parent>
    <artifactId>${module}</artifactId>
    <version>${version}</version>

</project>
""" > ${module}/pom.xml

}

for module in "${modules[@]}"
do
  downloadModule ${module}
done

mvn clean install

# commit and push if changed
git fetch
DIFF=`git diff origin/master`
if [[ "${DIFF}" != "" ]]
then

    # bump version number
    mvn build-helper:parse-version versions:set -DnewVersion=\${parsedVersion.majorVersion}.\${parsedVersion.minorVersion}.\${parsedVersion.nextIncrementalVersion} versions:commit

    git add -A
    git commit -m "updated abac-attribute-constants"
    git push
fi