package agence;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


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
		promesse = new PromesseVente("300", "adr", "01/01/2019", "frais");
		mandat = new Mandat("01/01/2019");
	}

	
	@Test
	public void testAjouterAcheteur() {
		bien.ajouterAcheteur(acheteur);
		assertEquals(bien.getterAcheteur(), acheteur);
	}

	@Test
	public void testProgrammerRdvMandat() {
		bien.programmerRdvMandat(rdvMandat);
		assertEquals(bien.getterRdvMandat(), rdvMandat);
	}

	@Test
	public void testProgrammerRdvVente() {
		bien.programmerRdvVente(rdvVente);
		assertEquals(bien.getterVente(), rdvVente);
	}

	@Test
	public void testProgrammerRdvVisite() {
		bien.programmerRdvVisite(rdvVisite);
		assertEquals(bien.getterVisite(), rdvVisite);
	}

	@Test
	public void testCreerPromesseVente() {
		bien.creerPromesseVente("300", "adr", "01/01/2019", "frais");
		assertEquals(bien.getterPromesse(), promesse);
	}

	@Test
	public void testCreerMandat() {
		bien.creerMandat("01/01/2019");
		assertEquals(bien.getterMandat(), mandat);
	}

	@Test
	public void testToString() {
		bien.toString();
		assertEquals("[5 / adr / nord / 500 / 01/01/2000 / 1 / soler]", bien.toString());
	}

}
