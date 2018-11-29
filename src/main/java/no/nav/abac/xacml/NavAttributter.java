package no.nav.abac.xacml;

public class NavAttributter {

	/**
	* "Cause" til deny
	* <h3>Lovlige verdier</h3>
	* cause-0001-manglerrolle<br>
	* cause-0002-ikketilgangtilNAVbrukersenhet<br>
	* cause-0003-kunlesetilgang<br>
	* cause-0004-ikkeegneopplysninger<br>
	* cause-0005-feilstatus<br>
	* cause-0006-kanikkefattevedtakiegensak<br>
	* cause-0007-ekstern-kode6-ikke-tilgang<br>
	* cause-0008-navbrukerikkeilive<br>
	* cause-0009-navbrukerikkemyndig<br>
	* cause_0010_kontorsperre<br>
	* cause_0011_eksternbruker_kun_se_opplysninger_om_seg_selv<br>
	* cause_0012_eksternbruker_krever_innloggingsnivaa_4
	* <h3>Kilde</h3>
	* PDP
	*/
	public static final String ADVICEOROBLIGATION_CAUSE = "no.nav.abac.attributter.adviceorobligation.cause";

	/**
	* Policy som gir resultat
	* <h3>Eksempelverdier</h3>
	* fp1_behandle_kode6
	* <h3>Kilde</h3>
	* PDP
	*/
	public static final String ADVICEOROBLIGATION_DENY_POLICY = "no.nav.abac.attributter.adviceorobligation.deny_policy";

	/**
	* Regel som gir resultat
	* <h3>Eksempelverdier</h3>
	* intern_behandle_kode6_manglergruppetilgang
	* <h3>Kilde</h3>
	* PDP
	*/
	public static final String ADVICEOROBLIGATION_DENY_RULE = "no.nav.abac.attributter.adviceorobligation.deny_rule";

	/**
	* Fritekst i en advice eller obligation
	* <h3>Eksempelverdier</h3>
	* Ingen tilgang grunnet policy: intern_behandle_kode7, regel: deny_all
	* <h3>Kilde</h3>
	* PDP
	*/
	public static final String ADVICEOROBLIGATION_FRITEKST = "no.nav.abac.attributter.adviceorobligation.fritekst";

	/**
	* Innholdet i consumer OpenID tokenet
	* Tokenbody er paa JSON format og er Base64 encodet
	* <h3>Eksempelverdier</h3>
	* NA
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String ENVIRONMENT_FELLES_CONSUMER_OIDC_TOKEN_BODY = "no.nav.abac.attributter.environment.felles.consumer_oidc_token_body";

	/**
	* Miljoe hvor policy blir eksekvert
	* <h3>Eksempelverdier</h3>
	* T4
	* <h3>Kilde</h3>
	* PIP
	*/
	public static final String ENVIRONMENT_FELLES_MILJOE = "no.nav.abac.attributter.environment.felles.miljoe";

	/**
	* Innholdet i OpenID tokenet
	* Tokenbody er paa JSON format og er Base64 encodet
	* <h3>Eksempelverdier</h3>
	* NA
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String ENVIRONMENT_FELLES_OIDC_TOKEN_BODY = "no.nav.abac.attributter.environment.felles.oidc_token_body";

	/**
	* Identitet paa PEP, maa vaere unik, bruk applikasjonsnavn fra fasit eventuelt servicebruker
	* <h3>Eksempelverdier</h3>
	* srvtpsws<br>
	* presys
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String ENVIRONMENT_FELLES_PEP_ID = "no.nav.abac.attributter.environment.felles.pep_id";

	/**
	* SAML token, base64 encodet
	* <h3>Eksempelverdier</h3>
	* NA
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String ENVIRONMENT_FELLES_SAML_TOKEN = "no.nav.abac.attributter.environment.felles.saml_token";

	/**
	* Navn paa tjenesten/operasjon som gjoer tilgangskontroll
	* <h3>Eksempelverdier</h3>
	* ersonV3
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String ENVIRONMENT_FELLES_TJENESTENAVN = "no.nav.abac.attributter.environment.felles.tjenestenavn";

	/**
	* sakliste Hjelpeattributt som brukes som value i resource_type
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String FORELDREPENGER_SAKLISTE = "no.nav.abac.attributter.foreldrepenger.sakliste";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_ARENA_ARBEIDSSOEKER = "no.nav.abac.attributter.resource.arena.arbeidssoeker";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_ARENA_DAGPENGEOPPGAVE = "no.nav.abac.attributter.resource.arena.dagpengeoppgave";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_ARENA_DAGPENGEVEDTAK = "no.nav.abac.attributter.resource.arena.dagpengevedtak";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_ARENA_OPPFOELGINGSKONTRAKTLISTE = "no.nav.abac.attributter.resource.arena.oppfoelgingskontraktListe";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_ARENA_OPPFOELGINGSSTATUS = "no.nav.abac.attributter.resource.arena.oppfoelgingsstatus";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_ARENA_STILLING = "no.nav.abac.attributter.resource.arena.stilling";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_ARENA_TILTAKSGJENNOMFOERING = "no.nav.abac.attributter.resource.arena.tiltaksgjennomfoering";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_ARENA_VEDTAK = "no.nav.abac.attributter.resource.arena.vedtak";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_ARENA_VEDTAKLISTE = "no.nav.abac.attributter.resource.arena.vedtakliste";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_ARENA_YTELSEVEDTAK = "no.nav.abac.attributter.resource.arena.ytelsevedtak";

	/**
	* dokument Hjelpeattributt som brukes som value i resource_type <br>
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_ARKIV_DOKUMENT = "no.nav.abac.attributter.resource.arkiv.dokument";

	/**
	* Saksid gsak
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_ARKIV_GSAK_SAKSID = "no.nav.abac.attributter.resource.arkiv.gsak_saksid";

	/**
	* journalpost Hjelpeattributt som brukes som value i resource_type <br>
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_ARKIV_JOURNALPOST = "no.nav.abac.attributter.resource.arkiv.journalpost";

	/**
	* Saksid pensjon
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_ARKIV_PENSJON_SAKSID = "no.nav.abac.attributter.resource.arkiv.pensjon_saksid";

	/**
	* sak Hjelpeattributt som brukes som value i resource_type <br>
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_ARKIV_SAK = "no.nav.abac.attributter.resource.arkiv.sak";

	/**
	* Varsel til NAV Bruker (borger) - hjelpeattributt for resource_type
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_DISTRIBUSJON_VARSEL_OM_OPPGAVE_TIL_BORGER = "no.nav.abac.attributter.resource.distribusjon.varsel_om_oppgave_til_borger";

	/**
	* dokument Hjelpeattributt som brukes som value i resource_type <br>
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_DOKUMENTPRODUKSJON_DOKUMENT = "no.nav.abac.attributter.resource.dokumentproduksjon.dokument";

	/**
	* Domene for policy og PEP
	* <h3>Eksempelverdier</h3>
	* foreldrepenger<br>
	* veilarb<br>
	* pensjon
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_FELLES_DOMENE = "no.nav.abac.attributter.resource.felles.domene";

	/**
	* NAV enhet
	* <h3>Eksempelverdier</h3>
	* 0124
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_FELLES_ENHET = "no.nav.abac.attributter.resource.felles.enhet";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_FELLES_PERSON = "no.nav.abac.attributter.resource.felles.person";

	/**
	* aktoerId
	* <h3>Eksempelverdier</h3>
	* 1000006276787
	* <h3>Kilde</h3>
	* PEP eller PIP
	*/
	public static final String RESOURCE_FELLES_PERSON_AKTOERID_RESOURCE = "no.nav.abac.attributter.resource.felles.person.aktoerId_resource";

	/**
	* Bekriver om en person er ansatt i NAV
	* <h3>Lovlige verdier</h3>
	* true<br>
	* false
	* <h3>Kilde</h3>
	* TPS via PIP tjeneste
	*/
	public static final String RESOURCE_FELLES_PERSON_EGEN_ANSATT = "no.nav.abac.attributter.resource.felles.person.egen_ansatt";

	/**
	* Foedselsnummer - 11 siffer, kan ogsaa vaere dnr
	* <h3>Eksempelverdier</h3>
	* 01029012345
	* <h3>Kilde</h3>
	* PEP eller PIP
	*/
	public static final String RESOURCE_FELLES_PERSON_FNR = "no.nav.abac.attributter.resource.felles.person.fnr";

	/**
	* Hvilken geografisk tilknytning som er registrert pï¿½ en person.
	* <h3>Eksempelverdier</h3>
	* 030102 (bydel)
	* 0219 (kommune)
	* SWE (land)
	* <h3>Kilde</h3>
	* TPS via PIP tjeneste
	*/
	public static final String RESOURCE_FELLES_PERSON_GEOGRAFISK_TILKNYTNING = "no.nav.abac.attributter.resource.felles.person.geografisk_tilknytning";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_FELLES_PERSON_KONTAKTINFORMASJON = "no.nav.abac.attributter.resource.felles.person.kontaktinformasjon";

	/**
	* Hvilket NAV-enhet brukeren er tilknyttet
	* <h3>Eksempelverdier</h3>
	* 0219
	* <h3>Kilde</h3>
	* NORG via PIP tjeneste
	*/
	public static final String RESOURCE_FELLES_PERSON_NAV_ENHET_ID = "no.nav.abac.attributter.resource.felles.person.nav_enhet_id";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_FELLES_PERSON_NAVN = "no.nav.abac.attributter.resource.felles.person.navn";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_FELLES_PERSON_RELASJON = "no.nav.abac.attributter.resource.felles.person.relasjon";

	/**
	* Liste med fnr - 11 siffer, kan ogsaa vaere dnr separert med ','
	* <h3>Eksempelverdier</h3>
	* 01029012345,11029012345,21029012345
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_FELLES_PERSON_RELASJONER = "no.nav.abac.attributter.resource.felles.person.relasjoner";

	/**
	* Spesifisert registreringstype, brukes for aa sjekke person har sperret adresses
	* <h3>Eksempelverdier</h3>
	* 6<br>
	* 7
	* <h3>Kilde</h3>
	* TPS via PIP tjeneste
	*/
	public static final String RESOURCE_FELLES_PERSON_SPESREG = "no.nav.abac.attributter.resource.felles.person.spesreg";

	/**
	* Bekriver om en person er ansatt i NAV
	* <h3>Lovlige verdier</h3>
	* true<br>
	* false
	* <h3>Kilde</h3>
	* TPS via PIP tjeneste
	*/
	public static final String RESOURCE_FELLES_PERSON_TILKNYTTET_EGEN_ANSATT = "no.nav.abac.attributter.resource.felles.person.tilknyttet_egen_ansatt";

	/**
	* Sekundoer Foedselsnummer - 11 siffer, kan ogsaa vaere dnr
	* <h3>Eksempelverdier</h3>
	* 01029012345
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_FELLES_PERSON_TILKNYTTET_FNR = "no.nav.abac.attributter.resource.felles.person.tilknyttet_fnr";

	/**
	* Spesifisert registreringstype, brukes for aa sjekke person har sperret adresses
	* <h3>Eksempelverdier</h3>
	* 6<br>
	* 7
	* <h3>Kilde</h3>
	* TPS via PIP tjeneste
	*/
	public static final String RESOURCE_FELLES_PERSON_TILKNYTTET_SPESREG = "no.nav.abac.attributter.resource.felles.person.tilknyttet_spesreg";

	/**
	* Ressurs type beskriver ressurs bruker oensker aa faa tilgang til
	* <h3>Eksempelverdier</h3>
	* no.nav.abac.attributter.resource.felles.person
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_FELLES_RESOURCE_TYPE = "no.nav.abac.attributter.resource.felles.resource_type";

	/**
	* Tema ihht kodeverk for Tema
	* <h3>Eksempelverdier</h3>
	* FOR
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_FELLES_TEMA = "no.nav.abac.attributter.resource.felles.tema";

	/**
	* aksjonspunkt_type
	* <h3>Kilde</h3>
	* PEP
	* <h3>Lovlige verdier</h3>
	* Overstyring<br>
	* ??
	*/
	public static final String RESOURCE_FORELDREPENGER_SAK_AKSJONSPUNKT_TYPE = "no.nav.abac.attributter.resource.foreldrepenger.sak.aksjonspunkt_type";

	/**
	* ansvarlig_saksbehandler
	* <h3>Kilde</h3>
	* PEP
	* <h3>Eksempelverdier</h3>
	* x123456
	*/
	public static final String RESOURCE_FORELDREPENGER_SAK_ANSVARLIG_SAKSBEHANDLER = "no.nav.abac.attributter.resource.foreldrepenger.sak.ansvarlig_saksbehandler";

	/**
	* behandlingsstatus
	* <h3>Kilde</h3>
	* PEP
	* <h3>Lovlige verdier</h3>
	* Opprettet<br>
	* Behandling utredes<br>
	* Kontroller og fatte vedtak<br>
	*/
	public static final String RESOURCE_FORELDREPENGER_SAK_BEHANDLINGSSTATUS = "no.nav.abac.attributter.resource.foreldrepenger.sak.behandlingsstatus";

	/**
	* saksstatus
	* <h3>Kilde</h3>
	* PEP
	* <h3>Lovlige verdier</h3>
	* Opprettet<br>
	* Behandling utredes<br>
	* Under behandling
	*/
	public static final String RESOURCE_FORELDREPENGER_SAK_SAKSSTATUS = "no.nav.abac.attributter.resource.foreldrepenger.sak.saksstatus";

	/**
	* Brukes som verdi i resource_type attributtet for domene modia
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_MODIA = "no.nav.abac.attributter.resource.modia";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_NAVPERSON_ENDRINGSSOEKNAD = "no.nav.abac.attributter.resource.navperson.endringssoeknad";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_NAVPERSON_PERSON_ENDRING = "no.nav.abac.attributter.resource.navperson.person_endring";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_NAVPERSON_PERSON_FEED = "no.nav.abac.attributter.resource.navperson.person_feed";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_NAVPERSON_STATUS = "no.nav.abac.attributter.resource.navperson.status";

	/**
	* oppgave Hjelpeattributt som brukes som value i resource_type <br>
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_OPPGAVE_OPPGAVE = "no.nav.abac.attributter.resource.oppgave.oppgave";

	/**
	* oppgavetype <br>
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_OPPGAVE_OPPGAVETYPE = "no.nav.abac.attributter.resource.oppgave.oppgavetype";

	/**
	* Brukes som verdi i resource_type attributtet, Presys trenger dette for å styre tilgang
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_PENSJON_PERSON_PENSJONSTATUS = "no.nav.abac.attributter.resource.pensjon.person.pensjonstatus";

	/**
	* Brukes som verdi i resource_type attributtet, Presys trenger dette for å styre tilgang
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_PENSJON_PERSON_UFOREHISTORIKK = "no.nav.abac.attributter.resource.pensjon.person.uforehistorikk";

	/**
	* Medlemskap - hjelpeattributt for resource_type
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_REGISTRE_ABONNEMENT = "no.nav.abac.attributter.resource.registre.abonnement";

	/**
	* Brukes av Sigrun og Inntektskomponenten til å spørre om tilgang til bestemte filter
	* Kodeverk A-inntektsfilter
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_REGISTRE_FILTER = "no.nav.abac.attributter.resource.registre.filter";

	/**
	* Brukes av Inntektskomponenten til å spørre om tilgang til basert paa formaal
	* Kodeverk Formaal
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_REGISTRE_FORMAAL = "no.nav.abac.attributter.resource.registre.formaal";

	/**
	* Liste med fullmaktsmottakere - hjelpeattributt for resource_type
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_REGISTRE_FULLMAKTSMOTTAKERELISTE = "no.nav.abac.attributter.resource.registre.fullmaktsmottakereliste";

	/**
	* Medlemskap - hjelpeattributt for resource_type
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_REGISTRE_INNTEKT = "no.nav.abac.attributter.resource.registre.inntekt";

	/**
	* Brukes som resource_type av NORG2
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_REGISTRE_KONTAKTINFORMASJON = "no.nav.abac.attributter.resource.registre.kontaktinformasjon";

	/**
	* Medlemskap - hjelpeattributt for resource_type
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_REGISTRE_MEDLEMSKAP = "no.nav.abac.attributter.resource.registre.medlemskap";

	/**
	* Medlemskap - hjelpeattributt for resource_type
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_REGISTRE_PERSON = "no.nav.abac.attributter.resource.registre.person";

	/**
	* Om person er merket med sikkerhetstiltak - hjelpeattributt for resource_type
	* <h3>Kilde</h3>
	* PEP (tpsws)
	*/
	public static final String RESOURCE_REGISTRE_PERSON_SIKKERHETSTILTAK = "no.nav.abac.attributter.resource.registre.person.sikkerhetstiltak";

	/**
	* Bekriver om en person er ansatt i NAV.
	* Dette attributtet er kun ment for TPS fordi de selv eier dataene og det dermed bør sendes med og ikke hentes i PIP.
	* <h3>Lovlige verdier</h3>
	* true<br>
	* false
	* <h3>Kilde</h3>
	* PEP (tpsws)
	*/
	public static final String RESOURCE_REGISTRE_PERSON_TPS_EGEN_ANSATT = "no.nav.abac.attributter.resource.registre.person.tps_egen_ansatt";

	/**
	* Spesifisert registreringstype, brukes for aa sjekke person har sperret adresses.
	* Dette attributtet er kun ment for TPS fordi de selv eier dataene og det dermed bør sendes med og ikke hentes i PIP.
	* <h3>Eksempelverdier</h3>
	* 6<br>
	* 7
	* <h3>Kilde</h3>
	* PEP (tpsws)
	*/
	public static final String RESOURCE_REGISTRE_PERSON_TPS_SPESREG = "no.nav.abac.attributter.resource.registre.person.tps_spesreg";

	/**
	* Om person er merket med utenlandsk_ident - hjelpeattributt for resource_type
	* <h3>Kilde</h3>
	* PEP (tpsws)
	*/
	public static final String RESOURCE_REGISTRE_PERSON_UTENLANDSK_IDENT = "no.nav.abac.attributter.resource.registre.person.utenlandsk_ident";

	/**
	* Brukes som resource_type av NORG2
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_REGISTRE_PUBLIKUMSMOTTAK = "no.nav.abac.attributter.resource.registre.publikumsmottak";

	/**
	* sak Hjelpeattributt som brukes som value i resource_type <br>
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_SAK_SAK = "no.nav.abac.attributter.resource.sak.sak";

	/**
	* Brukes som verdi i resource_type attributtet
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_SYFO_DIALOGMELDING = "no.nav.abac.attributter.resource.syfo.dialogmelding";

	/**
	* Brukes som verdi i resource_type attributtet, Forenklet Oppfolging bruker dette for generell tilgang til veilarb
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_VEILARB = "no.nav.abac.attributter.resource.veilarb";

	/**
	* Brukes som verdi i resource_type attributtet.
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_VEILARB_ENHET_EIENDEL = "no.nav.abac.attributter.resource.veilarb.enhet.eiendel";

	/**
	* Ressurs er laast til en NAV enhet, dvs kun denne enheten skal ha tilgang (kontorsperre)
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_VEILARB_KONTOR_LAAS = "no.nav.abac.attributter.resource.veilarb.kontor_laas";

	/**
	* Oppfoelgings enhet til resource - Ident pÃ¥ NAV-enhet, 4 siffer
	* <h3>Eksempelverdier</h3>
	* 2990
	* <h3>Kilde</h3>
	* PIP - Arena
	*/
	public static final String RESOURCE_VEILARB_OPPFOELGINGSENHET = "no.nav.abac.attributter.resource.veilarb.oppfoelgingsenhet";

	/**
	* Brukes som verdi i resource_type attributtet, Forenklet Oppfolging trenger sin egen variant av person
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String RESOURCE_VEILARB_PERSON = "no.nav.abac.attributter.resource.veilarb.person";

	/**
	* aktoerId
	* <h3>Eksempelverdier</h3>
	* 1000006276787
	* <h3>Kilde</h3>
	* PEP eller PIP
	*/
	public static final String SUBJECT_FELLES_AKTOERID_SUBJECT = "no.nav.abac.attributter.subject.felles.aktoerId_subject";

	/**
	* En persons alder oppgitt i hele aar
	* <h3>Eksempelverdier</h3>
	* 18
	* <h3>Kilde</h3>
	* TPS via PIP tjeneste
	*/
	public static final String SUBJECT_FELLES_ALDER = "no.nav.abac.attributter.subject.felles.alder";

	/**
	* Autentiseringsnivaa (authenticationLevel) fra token
	* <h3>Lovlige verdier</h3>
	* 0<br>1<br>2<br>3<br>4
	* <h3>Kilde</h3>
	* Token
	*/
	public static final String SUBJECT_FELLES_AUTHENTICATIONLEVEL = "no.nav.abac.attributter.subject.felles.authenticationLevel";

	/**
	* Konsument (consumerId) fra token
	* <h3>Eksempelverdier</h3>
	* srvPselv<br>
	* <h3>Kilde</h3>
	* Token
	*/
	public static final String SUBJECT_FELLES_CONSUMERID = "no.nav.abac.attributter.subject.felles.consumerId";

	/**
	* Rolle eller gruppe fra AD knyttet til konsument
	* <h3>Kilde</h3>
	* PIP
	*/
	public static final String SUBJECT_FELLES_CONSUMERID_ROLLE = "no.nav.abac.attributter.subject.felles.consumerId_rolle";

	/**
	* Liste med enheter til subject- Ident pÃ¥ NAV-enhet, 4 siffer
	* <h3>Eksempelverdier</h3>
	* 2990
	* <h3>Kilde</h3>
	* PIP - via NORG
	*/
	public static final String SUBJECT_FELLES_ENHETIDLISTE = "no.nav.abac.attributter.subject.felles.enhetidliste";

	/**
	* Bekriver om en person er i live
	* <h3>Lovlige verdier</h3>
	* true<br>
	* false
	* <h3>Kilde</h3>
	* TPS via PIP tjeneste
	*/
	public static final String SUBJECT_FELLES_ER_LEVENDE = "no.nav.abac.attributter.subject.felles.er_levende";

	/**
	* Hjelpeattributt som brukes som value i resource_type <br>
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String SUBJECT_FELLES_HAR_TILGANG_EGEN_ANSATT = "no.nav.abac.attributter.subject.felles.har_tilgang_egen_ansatt";

	/**
	* Hjelpeattributt som brukes som value i resource_type <br>
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String SUBJECT_FELLES_HAR_TILGANG_KODE_6 = "no.nav.abac.attributter.subject.felles.har_tilgang_kode_6";

	/**
	* Hjelpeattributt som brukes som value i resource_type <br>
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String SUBJECT_FELLES_HAR_TILGANG_KODE_7 = "no.nav.abac.attributter.subject.felles.har_tilgang_kode_7";

	/**
	* Basert pï¿½ gruppemedlemskap for en AD-bruker, hvilke andre grupper foelger med som noestede grupper
	* <h3>Lovlige verdier</h3>
	* CommonNames (eks 0000-GA-INNTK)
	* <h3>Kilde</h3>
	* LDAP
	*/
	public static final String SUBJECT_FELLES_INDIREKTE_GRUPPER = "no.nav.abac.attributter.subject.felles.indirekte_grupper";

	/**
	* "subject" type(identType) beskriver hvilken type subjekt
	* <h3>Lovlige verdier</h3>
	* InternBruker<br>EksternBruker<br>Systemressurs<br>Samhandler<br>Sikkerhet<br>Prosess
	* <h3>Kilde</h3>
	* Token enten direkte fra token eller utledet fra token
	*/
	public static final String SUBJECT_FELLES_SUBJECTTYPE = "no.nav.abac.attributter.subject.felles.subjectType";

	/**
	* Tpsws egen versjon av en persons alder oppgitt i hele aar
	* <h3>Eksempelverdier</h3>
	* 18
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String SUBJECT_REGISTRE_TPS_ALDER = "no.nav.abac.attributter.subject.registre.tps_alder";

	/**
	* Tpsws attributt som bekriver om en person er i live
	* <h3>Lovlige verdier</h3>
	* true<br>
	* false
	* <h3>Kilde</h3>
	* PEP
	*/
	public static final String SUBJECT_REGISTRE_TPS_ER_LEVENDE = "no.nav.abac.attributter.subject.registre.tps_er_levende";

}
