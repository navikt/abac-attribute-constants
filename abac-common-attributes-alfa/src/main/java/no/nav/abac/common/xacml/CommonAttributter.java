package no.nav.abac.common.xacml;

public class CommonAttributter {

	public static final String ADVICES_ACTION_SPORBARHETSLOGG = "no.nav.abac.advices.action.sporbarhetslogg";

	public static final String ADVICES_PING_RESPONSE = "no.nav.abac.advices.ping.response";

	public static final String ADVICES_REASON_DENY_INFO = "no.nav.abac.advices.reason.deny_info";

	public static final String ADVICES_REASON_DENY_REASON = "no.nav.abac.advices.reason.deny_reason";

	/**
	* "Cause" til deny
	* <h5>Lovlige verdier</h5>
	* cause-0001-manglerrolle<br></br>
	* cause-0002-ikketilgangtilNAVbrukersenhet<br></br>
	* cause-0003-kunlesetilgang<br></br>
	* cause-0004-ikkeegneopplysninger<br></br>
	* cause-0005-feilstatus<br></br>
	* cause-0006-kanikkefattevedtakiegensak<br></br>
	* cause-0007-ekstern-kode6-ikke-tilgang<br></br>
	* cause-0008-navbrukerikkeilive<br></br>
	* cause-0009-navbrukerikkemyndig<br></br>
	* cause_0010_kontorsperre<br></br>
	* cause_0011_eksternbruker_kun_se_opplysninger_om_seg_selv<br></br>
	* cause_0012_eksternbruker_krever_innloggingsnivaa_4
	* cause_0013_ikketilgangtiltema
	* <h5>Kilde</h5>
	* PDP
	*/
	public static final String ADVICEOROBLIGATION_CAUSE = "no.nav.abac.attributter.adviceorobligation.cause";

	/**
	* Policy som gir resultat
	* <h5>Eksempelverdier</h5>
	* fp1_behandle_kode6
	* <h5>Kilde</h5>
	* PDP
	*/
	public static final String ADVICEOROBLIGATION_DENY_POLICY = "no.nav.abac.attributter.adviceorobligation.deny_policy";

	/**
	* Regel som gir resultat
	* <h5>Eksempelverdier</h5>
	* intern_behandle_kode6_manglergruppetilgang
	* <h5>Kilde</h5>
	* PDP
	*/
	public static final String ADVICEOROBLIGATION_DENY_RULE = "no.nav.abac.attributter.adviceorobligation.deny_rule";

	/**
	* Fritekst i en advice eller obligation
	* <h5>Eksempelverdier</h5>
	* Ingen tilgang grunnet policy: intern_behandle_kode7, regel: deny_all
	* <h5>Kilde</h5>
	* PDP
	*/
	public static final String ADVICEOROBLIGATION_FRITEKST = "no.nav.abac.attributter.adviceorobligation.fritekst";

	/**
	* Innholdet i consumer OpenID tokenet
	* Tokenbody er paa JSON format og er Base64 encodet
	* <h5>Eksempelverdier</h5>
	* NA
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String ENVIRONMENT_FELLES_CONSUMER_OIDC_TOKEN_BODY = "no.nav.abac.attributter.environment.felles.consumer_oidc_token_body";

	/**
	* Miljoe hvor policy blir eksekvert
	* <h5>Eksempelverdier</h5>
	* T4
	* <h5>Kilde</h5>
	* PIP
	*/
	public static final String ENVIRONMENT_FELLES_MILJOE = "no.nav.abac.attributter.environment.felles.miljoe";

	/**
	* Innholdet i OpenID tokenet
	* Tokenbody er paa JSON format og er Base64 encodet
	* <h5>Eksempelverdier</h5>
	* NA
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String ENVIRONMENT_FELLES_OIDC_TOKEN_BODY = "no.nav.abac.attributter.environment.felles.oidc_token_body";

	/**
	* Identitet paa PEP, maa vaere unik, bruk applikasjonsnavn fra fasit eventuelt servicebruker
	* <h5>Eksempelverdier</h5>
	* srvtpsws<br></br>
	* presys
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String ENVIRONMENT_FELLES_PEP_ID = "no.nav.abac.attributter.environment.felles.pep_id";

	/**
	* SAML token, base64 encodet
	* <h5>Eksempelverdier</h5>
	* NA
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String ENVIRONMENT_FELLES_SAML_TOKEN = "no.nav.abac.attributter.environment.felles.saml_token";

	/**
	* Navn paa tjenesten/operasjon som gjoer tilgangskontroll
	* <h5>Eksempelverdier</h5>
	* ersonV3
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String ENVIRONMENT_FELLES_TJENESTENAVN = "no.nav.abac.attributter.environment.felles.tjenestenavn";

	/**
	* Domene for policy og PEP
	* <h5>Eksempelverdier</h5>
	* foreldrepenger<br></br>
	* veilarb<br></br>
	* pensjon
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String RESOURCE_FELLES_DOMENE = "no.nav.abac.attributter.resource.felles.domene";

	/**
	* NAV enhet
	* <h5>Eksempelverdier</h5>
	* 0124
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String RESOURCE_FELLES_ENHET = "no.nav.abac.attributter.resource.felles.enhet";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String RESOURCE_FELLES_PERSON = "no.nav.abac.attributter.resource.felles.person";

	/**
	* aktoerId
	* <h5>Eksempelverdier</h5>
	* 1000006276787
	* <h5>Kilde</h5>
	* PEP eller PIP
	*/
	public static final String RESOURCE_FELLES_PERSON_AKTOERID_RESOURCE = "no.nav.abac.attributter.resource.felles.person.aktoerId_resource";

	/**
	* Bekriver om en person er ansatt i NAV
	* <h5>Lovlige verdier</h5>
	* true<br></br>
	* false
	* <h5>Kilde</h5>
	* TPS via PIP tjeneste
	*/
	public static final String RESOURCE_FELLES_PERSON_EGEN_ANSATT = "no.nav.abac.attributter.resource.felles.person.egen_ansatt";

	/**
	* Foedselsnummer - 11 siffer, kan ogsaa vaere dnr
	* <h5>Eksempelverdier</h5>
	* 01029012345
	* <h5>Kilde</h5>
	* PEP eller PIP
	*/
	public static final String RESOURCE_FELLES_PERSON_FNR = "no.nav.abac.attributter.resource.felles.person.fnr";

	/**
	* Hvilken geografisk tilknytning som er registrert p� en person.
	* <h5>Eksempelverdier</h5>
	* 030102 (bydel)
	* 0219 (kommune)
	* SWE (land)
	* <h5>Kilde</h5>
	* TPS via PIP tjeneste
	*/
	public static final String RESOURCE_FELLES_PERSON_GEOGRAFISK_TILKNYTNING = "no.nav.abac.attributter.resource.felles.person.geografisk_tilknytning";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String RESOURCE_FELLES_PERSON_KONTAKTINFORMASJON = "no.nav.abac.attributter.resource.felles.person.kontaktinformasjon";

	/**
	* Hvilket NAV-enhet brukeren er tilknyttet
	* <h5>Eksempelverdier</h5>
	* 0219
	* <h5>Kilde</h5>
	* NORG via PIP tjeneste
	*/
	public static final String RESOURCE_FELLES_PERSON_NAV_ENHET_ID = "no.nav.abac.attributter.resource.felles.person.nav_enhet_id";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String RESOURCE_FELLES_PERSON_NAVN = "no.nav.abac.attributter.resource.felles.person.navn";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String RESOURCE_FELLES_PERSON_RELASJON = "no.nav.abac.attributter.resource.felles.person.relasjon";

	/**
	* Liste med fnr - 11 siffer, kan ogsaa vaere dnr separert med ','
	* <h5>Eksempelverdier</h5>
	* 01029012345,11029012345,21029012345
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String RESOURCE_FELLES_PERSON_RELASJONER = "no.nav.abac.attributter.resource.felles.person.relasjoner";

	/**
	* Spesifisert registreringstype, brukes for aa sjekke person har sperret adresses
	* <h5>Eksempelverdier</h5>
	* 6<br></br>
	* 7
	* <h5>Kilde</h5>
	* TPS via PIP tjeneste
	*/
	public static final String RESOURCE_FELLES_PERSON_SPESREG = "no.nav.abac.attributter.resource.felles.person.spesreg";

	/**
	* Bekriver om en person er ansatt i NAV
	* <h5>Lovlige verdier</h5>
	* true<br></br>
	* false
	* <h5>Kilde</h5>
	* TPS via PIP tjeneste
	*/
	public static final String RESOURCE_FELLES_PERSON_TILKNYTTET_EGEN_ANSATT = "no.nav.abac.attributter.resource.felles.person.tilknyttet_egen_ansatt";

	/**
	* Sekundoer Foedselsnummer - 11 siffer, kan ogsaa vaere dnr
	* <h5>Eksempelverdier</h5>
	* 01029012345
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String RESOURCE_FELLES_PERSON_TILKNYTTET_FNR = "no.nav.abac.attributter.resource.felles.person.tilknyttet_fnr";

	/**
	* Spesifisert registreringstype, brukes for aa sjekke person har sperret adresses
	* <h5>Eksempelverdier</h5>
	* 6<br></br>
	* 7
	* <h5>Kilde</h5>
	* TPS via PIP tjeneste
	*/
	public static final String RESOURCE_FELLES_PERSON_TILKNYTTET_SPESREG = "no.nav.abac.attributter.resource.felles.person.tilknyttet_spesreg";

	/**
	* Ressurs type beskriver ressurs bruker oensker aa faa tilgang til
	* <h5>Eksempelverdier</h5>
	* no.nav.abac.attributter.resource.felles.person
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String RESOURCE_FELLES_RESOURCE_TYPE = "no.nav.abac.attributter.resource.felles.resource_type";

	/**
	* Tema ihht kodeverk for Tema
	* <h5>Eksempelverdier</h5>
	* FOR
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String RESOURCE_FELLES_TEMA = "no.nav.abac.attributter.resource.felles.tema";

	/**
	* aktoerId
	* <h5>Eksempelverdier</h5>
	* 1000006276787
	* <h5>Kilde</h5>
	* PEP eller PIP
	*/
	public static final String SUBJECT_FELLES_AKTOERID_SUBJECT = "no.nav.abac.attributter.subject.felles.aktoerId_subject";

	/**
	* En persons alder oppgitt i hele aar
	* <h5>Eksempelverdier</h5>
	* 18
	* <h5>Kilde</h5>
	* TPS via PIP tjeneste
	*/
	public static final String SUBJECT_FELLES_ALDER = "no.nav.abac.attributter.subject.felles.alder";

	/**
	* Autentiseringsnivaa (authenticationLevel) fra token
	* <h5>Lovlige verdier</h5>
	* 0<br></br>1<br></br>2<br></br>3<br></br>4
	* <h5>Kilde</h5>
	* Token
	*/
	public static final String SUBJECT_FELLES_AUTHENTICATIONLEVEL = "no.nav.abac.attributter.subject.felles.authenticationLevel";

	/**
	* Konsument (consumerId) fra token
	* <h5>Eksempelverdier</h5>
	* srvPselv<br></br>
	* <h5>Kilde</h5>
	* Token
	*/
	public static final String SUBJECT_FELLES_CONSUMERID = "no.nav.abac.attributter.subject.felles.consumerId";

	/**
	* Rolle eller gruppe fra AD knyttet til konsument
	* <h5>Kilde</h5>
	* PIP
	*/
	public static final String SUBJECT_FELLES_CONSUMERID_ROLLE = "no.nav.abac.attributter.subject.felles.consumerId_rolle";

	/**
	* Liste med enheter til subject- Ident på NAV-enhet, 4 siffer
	* <h5>Eksempelverdier</h5>
	* 2990
	* <h5>Kilde</h5>
	* PIP - via NORG
	*/
	public static final String SUBJECT_FELLES_ENHETIDLISTE = "no.nav.abac.attributter.subject.felles.enhetidliste";

	/**
	* Bekriver om en person er i live
	* <h5>Lovlige verdier</h5>
	* true<br></br>
	* false
	* <h5>Kilde</h5>
	* TPS via PIP tjeneste
	*/
	public static final String SUBJECT_FELLES_ER_LEVENDE = "no.nav.abac.attributter.subject.felles.er_levende";

	/**
	* Hjelpeattributt som brukes som value i resource_type <br></br>
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String SUBJECT_FELLES_HAR_TILGANG_EGEN_ANSATT = "no.nav.abac.attributter.subject.felles.har_tilgang_egen_ansatt";

	/**
	* Hjelpeattributt som brukes som value i resource_type <br></br>
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String SUBJECT_FELLES_HAR_TILGANG_KODE_6 = "no.nav.abac.attributter.subject.felles.har_tilgang_kode_6";

	/**
	* Hjelpeattributt som brukes som value i resource_type <br></br>
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String SUBJECT_FELLES_HAR_TILGANG_KODE_7 = "no.nav.abac.attributter.subject.felles.har_tilgang_kode_7";

	/**
	* Basert p� gruppemedlemskap for en AD-bruker, hvilke andre grupper foelger med som noestede grupper
	* <h5>Lovlige verdier</h5>
	* CommonNames (eks 0000-GA-INNTK)
	* <h5>Kilde</h5>
	* LDAP
	*/
	public static final String SUBJECT_FELLES_INDIREKTE_GRUPPER = "no.nav.abac.attributter.subject.felles.indirekte_grupper";

	/**
	* "subject" type(identType) beskriver hvilken type subjekt
	* <h5>Lovlige verdier</h5>
	* InternBruker<br></br>EksternBruker<br></br>Systemressurs<br></br>Samhandler<br></br>Sikkerhet<br></br>Prosess
	* <h5>Kilde</h5>
	* Token enten direkte fra token eller utledet fra token
	*/
	public static final String SUBJECT_FELLES_SUBJECTTYPE = "no.nav.abac.attributter.subject.felles.subjectType";

	/**
	* Aksjon som oenskes utfoert
	* <h5>Lovlige verdier</h5>
	* create<br></br>
	* read<br></br>
	* update<br></br>
	* delete
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String XACML_1_0_ACTION_ACTION_ID = "urn:oasis:names:tc:xacml:1.0:action:action-id";

	public static final String XACML_1_0_ACTION_IMPLIED_ACTION = "urn:oasis:names:tc:xacml:1.0:action:implied-action";

	public static final String XACML_1_0_ENVIRONMENT_CURRENT_DATE = "urn:oasis:names:tc:xacml:1.0:environment:current-date";

	public static final String XACML_1_0_ENVIRONMENT_CURRENT_DATETIME = "urn:oasis:names:tc:xacml:1.0:environment:current-dateTime";

	public static final String XACML_1_0_ENVIRONMENT_CURRENT_TIME = "urn:oasis:names:tc:xacml:1.0:environment:current-time";

	public static final String XACML_1_0_RESOURCE_RESOURCE_ID = "urn:oasis:names:tc:xacml:1.0:resource:resource-id";

	public static final String XACML_1_0_SUBJECT_AUTHENTICATION_METHOD = "urn:oasis:names:tc:xacml:1.0:subject:authentication-method";

	public static final String XACML_1_0_SUBJECT_AUTHENTICATION_TIME = "urn:oasis:names:tc:xacml:1.0:subject:authentication-time";

	public static final String XACML_1_0_SUBJECT_KEY_INFO = "urn:oasis:names:tc:xacml:1.0:subject:key-info";

	public static final String XACML_1_0_SUBJECT_REQUEST_TIME = "urn:oasis:names:tc:xacml:1.0:subject:request-time";

	public static final String XACML_1_0_SUBJECT_SESSION_START_TIME = "urn:oasis:names:tc:xacml:1.0:subject:session-start-time";

	/**
	* Subjekt identifiserer den som oensker tilgang , kan vaere fnr, dnr, nav-ident
	* <h5>Eksempelverdier</h5>
	* 01018012345<br></br>
	* x123456
	* <h5>Kilde</h5>
	* Token
	*/
	public static final String XACML_1_0_SUBJECT_SUBJECT_ID = "urn:oasis:names:tc:xacml:1.0:subject:subject-id";

	public static final String XACML_1_0_SUBJECT_SUBJECT_ID_QUALIFIER = "urn:oasis:names:tc:xacml:1.0:subject:subject-id-qualifier";

	public static final String XACML_2_0_RESOURCE_TARGET_NAMESPACE = "urn:oasis:names:tc:xacml:2.0:resource:target-namespace";

	/**
	* Rolle som tilordner muligheter for sluttbruker (subjekt)
	* <h5>Eksempelverdier</h5>
	* 0000-GA-GOSYS_KODE7
	* <h5>Kilde</h5>
	* Active Directory (AD) via PIP tjeneste
	*/
	public static final String XACML_2_0_SUBJECT_ROLE = "urn:oasis:names:tc:xacml:2.0:subject:role";

	public static final String XACML_3_0_SUBJECT_AUTHN_LOCALITY_DNS_NAME = "urn:oasis:names:tc:xacml:3.0:subject:authn-locality:dns-name";

	public static final String XACML_3_0_SUBJECT_AUTHN_LOCALITY_IP_ADDRESS = "urn:oasis:names:tc:xacml:3.0:subject:authn-locality:ip-address";

}
