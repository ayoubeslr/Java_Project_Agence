package agence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 * test la classe Personne
 *
 */
class PersonneTest {
	
	Personne vendeur;
	Personne acheteur;
	Voeux voeux;
	PromesseVente promesse;
	Voeux voeuxMaison;
	Voeux voeuxAppart;
	Voeux voeuxTerrain;
	
	@BeforeEach
	void setUp() throws Exception {
		vendeur = new Personne("nom", "adr", "0000", "mail", "vendeur");
		acheteur = new Personne("nom", "adr", "0000", "mail", "acheteur");
		promesse = new PromesseVente(1000, "adrN", "01/01/2000", "20");
		voeuxMaison = new Voeux("MAISON", 3000, "orientation", 25, 50);
		voeuxAppart = new Voeux("APPART", 3000, "orientation", 25, 50);
		voeuxTerrain = new Voeux("TERRAIN", 3000, "orientation", 25);
	}

	@Test
	void testToString() {
		assertEquals("nom", vendeur.toString()); 
	}
	
	/**
	 * test de la methode SignerPromesseVente
	 */
	@Test
	void testSignerPromesseVente() {
		vendeur.signerPromesseVente(promesse);
	}
	
	/**
	 * test de la methode seDedire
	 */
	@Test
	void testSeDedire() {
		assertEquals("vendeur", vendeur.getterType());
		assertEquals("acheteur", acheteur.getterType());
	}

	/**
	 * test de la methode decrireVoeuxMaison
	 * test si les veeuxMaison correspondent
	 */
	@Test
	void testDecrireVoeuxMaison() {
		vendeur.decrireVoeuxMaison("MAISON", 3000, "orientation", 25, 50);
		assertEquals( vendeur.getterVoeux(), voeuxMaison);
	}
	
	/**
	 * test de la methode decrireVoeuxTerrain
	 * test si le voeuxTerrain correspondent 
	 */
	@Test
	void testDecrireVoeuxTerrain() {
		vendeur.decrireVoeuxTerrain("TERRAIN", 3000, "orientation", 25);
		assertEquals( vendeur.getterVoeux(), voeuxTerrain);
	}
	
	/**
	 * test de la methode decrireVoeuxAppart
	 * test si le voeuxAppart correspondent
	 */
	@Test
	void testDecrireVoeuxAppart() {
		vendeur.decrireVoeuxAppart("APPART", 3000, "orientation", 25, 50);
		assertEquals( vendeur.getterVoeux(), voeuxAppart);
	}

}
