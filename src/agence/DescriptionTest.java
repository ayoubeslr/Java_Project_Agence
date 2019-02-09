package agence;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import agence.Annonce.Media;

class DescriptionTest {
	
	Description descriptionWEB;
	Description descriptionPress;
	Description descriptionMedia;
	BienImmobilier bien;
	Personne vendeur;
	@BeforeEach
	void setUp() throws Exception {
		bien = new BienImmobilier(5, "adr", "nord", 500, "01/01/2000", 1, vendeur);
		descriptionWEB = new Description(bien, Media.WEB);
		descriptionPress = new Description(bien, Media.PRESSE_SPE);
		descriptionMedia = new Description(bien, Media.JOURNAL_LOC);
	}

	@Test
	void testEqualsObject() {
		assertTrue(descriptionWEB.equals(new Description(bien, Media.WEB)));
		assertTrue(descriptionPress.equals(new Description(bien, Media.PRESSE_SPE)));
		assertTrue(descriptionMedia.equals(new Description(bien, Media.JOURNAL_LOC)));
	}

	@Test
	void testAjouterDocuments() {
		descriptionWEB.ajouterDocuments();
		assertEquals(descriptionWEB.getterMedia(), Media.WEB);
	}
	
	@Test
	void testAjouterDocumentsPress() {
		descriptionPress.ajouterDocuments();
		assertEquals(descriptionPress.getterMedia(), Media.PRESSE_SPE);
	}

	@Test
	void testToString() {
		descriptionMedia.toString();
		assertEquals("[5 / adr / nord / 500 / 01/01/2000 / 1 / null]", descriptionMedia.toString());
	}

}
