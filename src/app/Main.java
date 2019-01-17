package app;

import agence.Personne;
import agence.PromesseVente;
import agence.Rdv;
import agence.BienImmobilier;
import agence.Annonce;
import agence.Annonce.Media;
import agence.Agence;

class Main {

	public static void main(String[] args) {
		Agence agence = new Agence();
		Personne Dupont = new Personne("Dupont", "2rue des lilas", "0687953265", "dupont@mail.com");
		System.out.println(Dupont);
		
		BienImmobilier bien = new BienImmobilier(1, "2 rue des lilas", "sud", "30000", "25/02/2019", 1, Dupont);
		System.out.println(bien);
		
		Annonce annonce = agence.creerAnnonce(bien, "presse spécialisée");
		System.out.println(annonce);
		
		Personne Acheteur = new Personne("Jordan", "8 avenue des champs Elysées", "0695712263", "jordan@mail.com");
		System.out.println(Acheteur);
		
		PromesseVente promesse = bien.creerPromesseVente("30000", "9 rue de la rose", "24/02/2019", "200");
		System.out.println(promesse);
		Rdv rdvPromesse = agence.prendreRdvPromesseVente(Dupont, Acheteur);
		System.out.println(rdvPromesse);
		System.out.println(Acheteur.signerPromesseVente(promesse));
	}

}
