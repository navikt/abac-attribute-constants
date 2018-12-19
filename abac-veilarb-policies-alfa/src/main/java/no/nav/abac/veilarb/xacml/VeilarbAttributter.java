package no.nav.abac.veilarb.xacml;

public class VeilarbAttributter {

	/**
	* Brukes som verdi i resource_type attributtet, Forenklet Oppfolging bruker dette for generell tilgang til veilarb
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String RESOURCE_VEILARB = "no.nav.abac.attributter.resource.veilarb";

	/**
	* Brukes som verdi i resource_type attributtet.
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String RESOURCE_VEILARB_ENHET_EIENDEL = "no.nav.abac.attributter.resource.veilarb.enhet.eiendel";

	/**
	* Ressurs er laast til en NAV enhet, dvs kun denne enheten skal ha tilgang (kontorsperre)
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String RESOURCE_VEILARB_KONTOR_LAAS = "no.nav.abac.attributter.resource.veilarb.kontor_laas";

	/**
	* Oppfoelgings enhet til resource - Ident på NAV-enhet, 4 siffer
	* <h5>Eksempelverdier</h5>
	* 2990
	* <h5>Kilde</h5>
	* PIP - Arena
	*/
	public static final String RESOURCE_VEILARB_OPPFOELGINGSENHET = "no.nav.abac.attributter.resource.veilarb.oppfoelgingsenhet";

	/**
	* Brukes som verdi i resource_type attributtet, Forenklet Oppfolging trenger sin egen variant av person
	* <h5>Kilde</h5>
	* PEP
	*/
	public static final String RESOURCE_VEILARB_PERSON = "no.nav.abac.attributter.resource.veilarb.person";

}
