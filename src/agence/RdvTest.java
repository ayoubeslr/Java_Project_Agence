package agence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 * test de la classe methode Rdv
 *
 */
class RdvTest {

	Rdv rdv;
	Rdv rdv1;
	Personne personne1;
	Personne personne2;
	
	@BeforeEach
	void setUp() throws Exception {
		rdv = new Rdv(personne1, personne2);
		rdv1 = new Rdv(personne1);
	}
	
	/**
	 * test la methode equals
	 */
	@Test
	void testEqualsObject() {
		assertTrue(rdv.equals(new Rdv(personne1, personne2)));
		assertTrue(rdv1.equals(new Rdv(personne1)));
	}

	@Test
	void testToString() {
		assertEquals("Un rendez-vous est prévu entre "+personne1+" et "+personne2+" pour signer la promesse de vente", rdv.toString());
	}

}
