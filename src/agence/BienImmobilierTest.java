package agence;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * test de la classe BienImmobilier
 *
 */
public class BienImmobilierTest {
	
	Personne vendeur;
	Personne acheteur;
	Personne personne;
	BienImmobilier bien;
	Rdv rdvMandat;
	Rdv rdvVente;
	Rdv rdvVisite;
	PromesseVente promesse;
	Mandat mandat;
	
	@Before
	public void setup(){
		vendeur =  new Personne("soler", "adr", "0000", "mail", "type");
		acheteur = new Personne("soler", "adr", "0000", "mail", "type");
		bien = new BienImmobilier(5, "adr", "nord", 500, "01/01/2000", 1, vendeur);
		rdvMandat = new Rdv(personne);
		rdvVente = new Rdv(personne);
		rdvVisite = new Rdv(personne);
		promesse = new PromesseVente(300, "adr", "01/01/2019", "frais");
		mandat = new Mandat("01/01/2019");
	}

	/**
	 * test de la methode ajouterAcheteur
	 * test si les acheteur correspondent
	 */
	@Test
	public void testAjouterAcheteur() {
		bien.ajouterAcheteur(acheteur);
		assertEquals(bien.getterAcheteur(), acheteur);
	}
	
	/**
	 * test de la methode ProgrammerRdvMandat
	 * test si les rdvMandats corresondent
	 */
	@Test
	public void testProgrammerRdvMandat() {
		bien.programmerRdvMandat(rdvMandat);
		assertEquals(bien.getterRdvMandat(), rdvMandat);
	}
	
	/**
	 * test de la methode ProgrammerRdvVente
	 * test si les rdvVente correspondent
	 */
	@Test
	public void testProgrammerRdvVente() {
		bien.programmerRdvVente(rdvVente);
		assertEquals(bien.getterVente(), rdvVente);
	}
	
	/**
	 * test de la methode RdvVisite
	 * test si les rdvVisite correspondent
	 */
	@Test
	public void testProgrammerRdvVisite() {
		bien.programmerRdvVisite(rdvVisite);
		assertEquals(bien.getterVisite(), rdvVisite);
	}
	
	/**
	 * test la methode creerPromesseVente
	 * test si les promesses correspondent
	 */
	@Test
	public void testCreerPromesseVente() {
		bien.creerPromesseVente(300, "adr", "01/01/2019", "frais");
		assertEquals(bien.getterPromesse(), promesse);
	}
	
	/**
	 * test de la methode CreerMandat
	 * test si les mandats corresondent 
	 */
	@Test
	public void testCreerMandat() {
		bien.creerMandat("01/01/2019");
		assertEquals(bien.getterMandat(), mandat);
	}
	
	/**
	 * test du toString
	 */
	@Test
	public void testToString() {
		bien.toString();
		assertEquals("[5 / adr / nord / 500 / 01/01/2000 / 1 / soler]", bien.toString());
	}

}
