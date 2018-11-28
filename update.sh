#!/bin/bash
set -e
set -x

# download and unpack latest release
mvn dependency:unpack \
-DremoteRepositories=https://repo.adeo.no/repository/maven-releases/ \
-Dartifact=no.nav.abac.policies:abac-attribute-constants:RELEASE:jar:sources \

# replace src-directory
rm -rf src/
mkdir -p src/main/java
mv target/dependency/no src/main/java
mvn clean install

# commit and push if changed
git fetch
DIFF=`git diff origin/master`
if [ "${DIFF}" != "" ]
then
    git add -A
    git commit -m "updated abac-attribute-constants"
    git push
fi