package app;

import agence.Personne;
import agence.PromesseVente;
import agence.Rdv;
import agence.Terrain;
import agence.Voeux;
import agence.BienImmobilier;
import agence.Annonce;
import agence.Annonce.Media;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import agence.Agence;

class Main {

	public static void main(String[] args) {
		Agence agence = new Agence();
		Personne Dupont = new Personne("Dupont", "2rue des lilas", "0687953265", "dupont@mail.com", "vendeur");
		System.out.println(Dupont);
		Personne Martin = new Personne("Martin", "6 rue lascrosses", "0687951579", "martin@mail.com", "vendeur");
		System.out.println(Martin);
		Personne Bernard = new Personne("Bernard", "22 rue du roc", "0687167599", "bernard@mail.com", "vendeur");
		System.out.println(Bernard);
		
		
		BienImmobilier bien = agence.ajouterTerrain(1, "2 rue des lilas", "sud", 30000, "25/02/2019", 1, 600, 25, Dupont);
		
		BienImmobilier appart = agence.ajouterAppart(2, "36 route des champs", "ouest", 5000, "12/05/2019", 2, 200, 3, 2, 30, Martin);
		
		BienImmobilier maison = agence.ajouterMaison(3, "3 rue des tuillières", "nord", 60000, "02/09/2019", 3, 300, 7, 0, "gaz", Bernard);
		
		Annonce annonce = agence.creerAnnonce(bien, "presse spécialisée");
		System.out.println(annonce);
		
		Personne Acheteur = new Personne("Jordan", "8 avenue des champs Elysées", "0695712263", "jordan@mail.com", "acheteur");
		System.out.println(Acheteur);
		
		System.out.println();
		Voeux voeux = Acheteur.decrireVoeuxMaison("MAISON", 60000, "nord", 300, 7);
		System.out.println(voeux);
		
		System.out.println();
		BienImmobilier check = agence.checkVoeux(voeux);
		System.out.println(check);
		System.out.println();
		
		
		PromesseVente promesse = bien.creerPromesseVente(30000, "9 rue de la rose", "24/02/2019", "200");
		System.out.println(promesse);
		System.out.println();
		Rdv rdvPromesse = agence.prendreRdvPromesseVente(Dupont, Acheteur);
		System.out.println(rdvPromesse);
		System.out.println(Acheteur.signerPromesseVente(promesse));
		
		System.out.println(Acheteur.seDedire(promesse));
		
		agence.tabBienVendus(bien);
		
		/*try ( ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("StatistiquesVentes.dat")) ) {
			for(BienImmobilier x : agence.tabBienVendus) {
				System.out.println("Bien vendus = " + x);
				os.writeObject(x);
			}
		} catch (IOException e) {
			System.err.println("Erreur pendant la sérialisation : " + e);
			System.exit(1);
			}*/
	

}}
