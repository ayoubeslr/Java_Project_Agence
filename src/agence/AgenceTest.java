package agence;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.Before;

/**
 * 
 * Classe de test
 * teste de ma classe Agence
 *
 */
class AgenceTest {
	
	Agence agence;
	BienImmobilier bien;
	Personne vendeur;
	Personne acheteur;
	Personne personne;
	Annonce annonce;
	Rdv rdv;
	Terrain terrain;
	Appart appart;
	Maison maison;
	Voeux voeux;
	Voeux voeuxAppart;
	Voeux voeuxMaison;
	Voeux voeuxTerrain;
	
	@BeforeEach
	public void setup() {
		agence = new Agence();
		bien = new BienImmobilier(5, "adr", "nord", 500, "01/01/2000", 1, vendeur);
		annonce = new Annonce(bien, "web");
		vendeur =  new Personne("vendeur", "adr", "0000", "mail", "type");
		acheteur = new Personne("acheteur", "adr", "0000", "mail", "type");
		rdv = new Rdv(vendeur, acheteur);
		terrain = new Terrain(5, "terrain", "orientation", 3000, "01/01/2019", 21, 25, 50, vendeur);
		appart = new Appart(5, "adr", "orientation", 3000, "01/01/2019", 21, 25, 50, 0, 0, vendeur);
		maison = new Maison(5, "adr", "orientation", 3000, "01/01/2019", 21, 25, 50, 0, "electrique", vendeur);
		voeux = new Voeux("bienRecherche", 3000, "sud", 21);
		voeuxMaison = new Voeux("MAISON", 3000, "orientation", 25, 50);
		voeuxAppart = new Voeux("APPART", 3000, "orientation", 25, 50);
		voeuxTerrain = new Voeux("TERRAIN", 3000, "orientation", 25, 50);
	}
	
	/**
	 * test la methode creeAnnonce
	 * test si les annonces correspondent
	 */
	@Test
	void testCreerAnnonce() {
		agence.creerAnnonce(bien, "web");
		assertEquals(agence.getterAnnonce(), annonce);
	}
	/**
	 * test la methode prendreRdvPromesseVente
	 * test si il y a un rendez vous 
	 */
	@Test
	void testPrendreRdvPromesseVente() {
		agence.prendreRdvPromesseVente(vendeur, acheteur);
		assertEquals(agence.getterPromesse(), rdv);
	}
	
	/**
	 * test la methode ajouterTerrain
	 * test les terrains correspondent
	 */
	@Test
	void testAjouterTerrain() {
		agence.ajouterTerrain(5, "terrain", "orientation", 3000, "01/01/2019", 21, 25, 50, vendeur);
		assertEquals(agence.getterBien(), terrain);
	}
	
	/**
	 * test de la methode ajouterAppart
	 * test si les apparts correspondent
	 */
	@Test
	void testAjouterAppart() {
		agence.ajouterAppart(5, "adr", "orientation", 3000, "01/01/2019", 21, 25, 50, 0, 0, vendeur);
		assertEquals(agence.getterBien(), appart);
	}
	
	/**
	 * test la methode ajouterMaison
	 * test si les maisons correspondent
	 */
	@Test
	void testAjouterMaison() {
		agence.ajouterMaison(5, "adr", "orientation", 3000, "01/01/2019", 21, 25, 50, 0, "electrique", vendeur);
		assertEquals(agence.getterBien(), maison);
	}
	
	/**
	 * test la methode CheckVoeux
	 * test si un voeux correspont a une maison, appart ou terrain
	 */
	@Test
	void testCheckVoeux() {
		agence.ajouterMaison(5, "adr", "orientation", 3000, "01/01/2019", 21, 25, 50, 0, "electrique", vendeur);
		agence.ajouterAppart(5, "adr", "orientation", 3000, "01/01/2019", 21, 25, 50, 0, 0, vendeur);
		agence.ajouterTerrain(5, "terrain", "orientation", 3000, "01/01/2019", 21, 25, 50, vendeur);
		assertEquals(maison, agence.checkVoeux(voeuxMaison));
		assertEquals(appart, agence.checkVoeux(voeuxAppart));
		assertEquals(terrain, agence.checkVoeux(voeuxTerrain));
	}
	
	/**
	 * test la methode bienVendu
	 * test si un bien a était rajouter a la liste de tabBienVendu
	 */
	@Test
	void testTabBienVendus() {
		assertFalse(agence.gettertabBienVendus().contains(bien));
		agence.tabBienVendus(bien);
		assertTrue(agence.gettertabBienVendus().contains(bien));
	}

}

