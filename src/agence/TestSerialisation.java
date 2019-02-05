package agence;
import java.io.*;

public class TestSerialisation {

	public static void main(String[] args) {
		try ( ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("StatistiquesVentes.dat")) ) {
			Agence obj1 = new Agence();
			for(BienImmobilier x : obj1.tabBienVendus) {
				System.out.println("Bien vendus = " + x);
				os.writeObject(x);
			}
			} catch (IOException e) {
			System.err.println("Erreur pendant la sérialisation : " + e);
			System.exit(1);
			}
	}

}
