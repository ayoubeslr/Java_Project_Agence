package agence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 * test de la classe PromesseVente 
 *
 */
class PromesseVenteTest {
	
	PromesseVente promesse;
	Commission commission;
	
	@BeforeEach
	void setUp() throws Exception {
		promesse = new PromesseVente(1000, "adrN", "01/01/2000", "20");
		commission = new Commission(1000);
	}
	
	/**
	 * test de la methode equals
	 */
	@Test
	void testEqualsObject() {
		assertTrue(promesse.equals(new PromesseVente(1000, "adrN", "01/01/2000", "20")));
	}

	@Test
	void testToString() {
		assertEquals("Prix versé au vendeur: 1000 euros\nAdresse du notaire: adrN\nDate de vente: 01/01/2000\nFrais de vente: 20 euros\nCommission: "+commission+" euros", promesse.toString());
	}

}
