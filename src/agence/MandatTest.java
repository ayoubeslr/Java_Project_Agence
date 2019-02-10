package agence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * 
 * test de la classe Mandat
 *
 */
class MandatTest {
	
	Mandat mandat;
	@BeforeEach
	void setUp() throws Exception {
		mandat = new Mandat("01/01/2000");
	}

	@Test
	void testToString() {
		assertEquals("Vos informations ont �t� enregistr�es, voil� la dur�e du mandat: 01/01/2000", mandat.toString());
	}

	@Test
	void testEqualsObject() {
		assertTrue(mandat.equals(new Mandat("01/01/2000")));
	}

}
