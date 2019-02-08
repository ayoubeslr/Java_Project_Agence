package agence;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppartTest {
	
	Appart appart;
	Personne vendeur;
	@BeforeEach
	void setUp() throws Exception {
		vendeur =  new Personne("soler", "adr", "0000", "mail", "type");
		appart = new Appart(1, "adr", "orientation", 2000, "01/01/2000", 2, 20, 4, 3, 50, vendeur);
	}

	@Test
	void testToString() {
		assertEquals("Adresse: adr \n Orientation: orientation \n Prix demandé: 2000 \n Date de vente souhaitée: 01/01/2000 \n Nom du vendeur: "+vendeur+" \n Nombre de pièces: 4 \n Etage: 3 \n Charges mensuelles: 50", appart.toString());
	}

}
