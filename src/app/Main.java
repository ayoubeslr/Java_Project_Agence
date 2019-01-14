package app;

import agence.Personne;
import agence.BienImmobilier;
import agence.Annonce;
import agence.Annonce.Media;
import agence.Agence;

class Main {

	public static void main(String[] args) {
		Personne Dupont = new Personne("Dupont", "2rue des lilas", "0687953265", "dupont@mail.com");
		System.out.println(Dupont);
		
		BienImmobilier bien = new BienImmobilier(1, "2 rue des lilas", "sud", "30000", "25/02/2019", 1, Dupont);
		System.out.println(bien);
		
		Annonce annonce = new Annonce(bien, "presse spécialisée");
		System.out.println(annonce);
		
	}

}
