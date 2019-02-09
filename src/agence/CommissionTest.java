package agence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CommissionTest {
	
	Commission commision;
	@BeforeEach
	void setUp() throws Exception {
		commision = new Commission(300);
	}

	@Test
	void testEqualsObject() {
		assertTrue(commision.equals(new Commission(300)));
	}

	@Test
	void testToString() {
		assertEquals("21", commision.toString());
	}

}
