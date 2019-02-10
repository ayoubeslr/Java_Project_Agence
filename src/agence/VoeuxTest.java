package agence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VoeuxTest {
	
	
	Voeux voeux;
	Voeux voeux1;
	
	@BeforeEach
	void setUp() throws Exception {
		voeux = new Voeux("MAISON", 3000, "orientation", 25, 50);
		voeux1 = new Voeux("TERRAIN", 3000, "sud", 21);
	}

	@Test
	void testEqualsObject() {
		assertTrue(voeux.equals(new Voeux("MAISON", 3000, "orientation", 25, 50)));
		assertTrue(voeux1.equals(new Voeux("TERRAIN", 3000, "sud", 21)));
	}

}
