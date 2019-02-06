package app;


import java.util.Scanner;

import agence.Agence;
import agence.BienImmobilier;
import agence.Mandat;
import agence.Personne;

public class Test {

	public static void main(String[] args) {
		Agence agence = new Agence(); 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bonjour! Etes-vous un nouveau vendeur ou un futur acheteur?");
		String str = sc.nextLine();

		if (str.equals("vendeur")) {
			System.out.println("Quel est votre nom?");
			String nom = sc.nextLine();
			System.out.println("Quel est votre adresse?");
			String adresse = sc.nextLine();
			System.out.println("Quel est votre num�ro de t�l�phone?");
			String telephone = sc.nextLine();
			System.out.println("Quel est votre mail?");
			String mail = sc.nextLine();
			Personne vendeur = new Personne(nom, adresse, telephone, mail, "vendeur");
			System.out.println("Quelle dur�e souhaitez-vous pour le mandat?");
			String duree = sc.nextLine();
			Mandat mandat = new Mandat(duree);
			System.out.println(mandat);
			
			System.out.println("Vendez-vous un terrain, un appartement ou une maison?");
			String type = sc.nextLine();
			if (type.equals("terrain")) {
				System.out.println("Quel est l'adresse du bien?");
				String adresseB = sc.nextLine();
				System.out.println("Quel est l'orientation du bien?");
				String orientation = sc.nextLine();
				System.out.println("Quel est le prix de ce bien?");
				int prix = sc.nextInt();
				System.out.println("Quelle serait pour vous la date de vente souhait�e?");
				String date = sc.nextLine();
				System.out.println("Quel est la surface au sol de ce bien?");
				int surface = sc.nextInt();
				System.out.println("Quel est la longueur de la fa�ade de ce bien?");
				int facade = sc.nextInt();
				BienImmobilier terrain = agence.ajouterTerrain("TERRAIN", 1, adresseB, orientation, prix, date, 1, surface, facade, vendeur);
			}
			else if (type.equals("appartement")) {
				System.out.println("Quel est l'adresse du bien?");
				String adresseB = sc.nextLine();
				System.out.println("Quel est l'orientation du bien?");
				String orientation = sc.nextLine();
				System.out.println("Quel est le prix de ce bien?");
				int prix = Integer.parseInt(sc.nextLine());
				System.out.println("Quelle serait pour vous la date de vente souhait�e?");
				String date = sc.nextLine();
				System.out.println("Quel est le nombre de pi�ces de ce bien?");
				int pieces = sc.nextInt();
				System.out.println("A quel �tage ce situe ce bien?");
				int etage = sc.nextInt();
				System.out.println("Quelles sont les charges mensuelles pour ce bien?");
				int charges = sc.nextInt();
				BienImmobilier appartement = agence.ajouterAppart(2, adresseB, orientation, prix, date, 2, pieces, etage, charges, vendeur);
				System.out.println(appartement);
			}
			else if (type.equals("maison")) {
				System.out.println("Quel est l'adresse du bien?");
				String adresseB = sc.nextLine();
				System.out.println("Quel est l'orientation du bien?");
				String orientation = sc.nextLine();
				System.out.println("Quel est le prix de ce bien?");
				int prix = sc.nextInt();
				System.out.println("Quelle serait pour vous la date de vente souhait�e?");
				String date = sc.nextLine();
				System.out.println("Quel est la surface de ce bien?");
				int surface = sc.nextInt();
				System.out.println("Quel est le nombre de pi�ces de ce bien?");
				int pieces = sc.nextInt();
				System.out.println("Combien d'�tages contient ce bien?");
				int etage = sc.nextInt();
				System.out.println("Quel est le moyen de chauffage de ce bien?");
				String chauffage = sc.nextLine();
				BienImmobilier maison = agence.ajouterMaison(3, adresseB, orientation, prix, date, 3, surface, pieces, etage, chauffage, vendeur);
			}
		}
	}

}
