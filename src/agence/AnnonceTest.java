package agence;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import agence.Annonce.Media;

class AnnonceTest {
	
	BienImmobilier bien;
	Annonce annonceWeb;
	Annonce annoncePress;
	Annonce annonceMedia;
	Personne vendeur;
	Description description;
	@BeforeEach
	void setUp() throws Exception {
		vendeur =  new Personne("soler", "adr", "0000", "mail", "type");
		bien = new BienImmobilier(5, "adr", "nord", 500, "01/01/2000", 1, vendeur);
		annonceWeb = new Annonce(bien, "web");
		annoncePress = new Annonce(bien, "presse spécialisée" );
		annonceMedia = new Annonce(bien, "media");
		description = new Description(bien, Media.WEB);
		
	}
	
	@Test
	void testEqualsObject() {
		assertTrue(annonceWeb.equals(new Annonce(bien, "web")));
		assertTrue(annoncePress.equals(new Annonce(bien, "presse spécialisée")));
		assertTrue(annonceMedia.equals(new Annonce(bien, "media")));
	}

	@Test
	void testToString() {
		annonceWeb.toString();
		annoncePress.toString();
		annonceMedia.toString();
		assertEquals("Annonce dans WEB... description du bien: "+description+ "", annonceWeb.toString());
		assertEquals("Annonce dans PRESSE_SPE... description du bien: "+description+ "", annoncePress.toString());
		assertEquals("Annonce dans JOURNAL_LOC... description du bien: "+description+ "", annonceMedia.toString());

	}

}
