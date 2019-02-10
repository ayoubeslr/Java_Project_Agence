package agence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * 
 * test de la classe Maison
 *
 */
class MaisonTest {
	
	Maison maison;
	Personne vendeur;
	@BeforeEach
	void setUp() throws Exception {
		vendeur =  new Personne("soler", "adr", "0000", "mail", "type");
		maison = new Maison(1, "adr", "orientation", 3000, "01/01/2000", 1, 20, 4, 3, "elecrtique", vendeur);
	}
	

	@Test
	void testToString() {
		maison.toString();
		assertEquals("Adresse: adr \n Orientation: orientation \n Prix demandé: 3000 \n Date de vente souhaitée: 01/01/2000 \n Nom du vendeur: soler \n Surface au sol: 20 \n Nombre de pièces: 4 \n Nombre d'étages: 3\n Moyen de chauffage: elecrtique", maison.toString());
	}

}
