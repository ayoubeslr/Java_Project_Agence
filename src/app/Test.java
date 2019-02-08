package app;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import agence.Agence;
import agence.Annonce;
import agence.BienImmobilier;
import agence.Mandat;
import agence.Personne;
import agence.PromesseVente;
import agence.Rdv;
import agence.Voeux;

public class Test {

	public static void main(String[] args) {
		Agence agence = new Agence(); 
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("Bonjour! Etes-vous un nouveau vendeur ou un futur acheteur?('quitter' pour quitter)");
			String str = sc.nextLine();
			if (str.equals("quitter")) {
				break;
			}
	
			if (str.equals("vendeur")) {
				System.out.println("Quel est votre nom?");
				String nom = sc.nextLine();
				System.out.println("Quel est votre adresse?");
				String adresse = sc.nextLine();
				System.out.println("Quel est votre numéro de téléphone?");
				String telephone = sc.nextLine();
				System.out.println("Quel est votre mail?");
				String mail = sc.nextLine();
				Personne vendeur = new Personne(nom, adresse, telephone, mail, "vendeur");
				System.out.println("Quelle durée souhaitez-vous pour le mandat?");
				String duree = sc.nextLine();
				Mandat mandat = new Mandat(duree);
				System.out.println(mandat);
				System.out.println();
				
				System.out.println("Vendez-vous un terrain, un appartement ou une maison?");
				String type = sc.nextLine();
				if (type.equals("terrain")) {
					System.out.println("Quel est l'adresse du bien?");
					String adresseB = sc.nextLine();
					System.out.println("Quel est l'orientation du bien?");
					String orientation = sc.nextLine();
					System.out.println("Quel est le prix de ce bien?");
					int prix = Integer.parseInt(sc.nextLine());
					System.out.println("Quelle serait pour vous la date de vente souhaitée?");
					String date = sc.nextLine();
					System.out.println("Quel est la surface au sol de ce bien?");
					int surface = Integer.parseInt(sc.nextLine());
					System.out.println("Quel est la longueur de la façade de ce bien?");
					int facade = Integer.parseInt(sc.nextLine());
					BienImmobilier terrain = agence.ajouterTerrain(1, adresseB, orientation, prix, date, 1, surface, facade, vendeur);
					System.out.println(agence.tabBienImmobilier);
					
					System.out.println("Voulez-vous poster une annonce?");
					String annonce = sc.nextLine();
					if (annonce.equals("oui")) {
						System.out.println("Quelle genre d'annonce? Tapez 'web', 'presse spécialisée' ou 'journal local'.");
						String media = sc.nextLine();
						Annonce publicite = agence.creerAnnonce(terrain, media);
						System.out.println(publicite);
					}
				}
				else if (type.equals("appartement")) {
					System.out.println("Quel est l'adresse du bien?");
					String adresseB = sc.nextLine();
					System.out.println("Quel est l'orientation du bien?");
					String orientation = sc.nextLine();
					System.out.println("Quel est le prix de ce bien?");
					int prix = Integer.parseInt(sc.nextLine());
					System.out.println("Quelle serait pour vous la date de vente souhaitée?");
					String date = sc.nextLine();
					System.out.println("Quel est la surface de ce bien?");
					int surface = Integer.parseInt(sc.nextLine());
					System.out.println("Quel est le nombre de pièces de ce bien?");
					int pieces = Integer.parseInt(sc.nextLine());
					System.out.println("A quel étage ce situe ce bien?");
					int etage = Integer.parseInt(sc.nextLine());
					System.out.println("Quelles sont les charges mensuelles pour ce bien?");
					int charges = Integer.parseInt(sc.nextLine());
					BienImmobilier appartement = agence.ajouterAppart(2, adresseB, orientation, prix, date, 2, surface, pieces, etage, charges, vendeur);
					
					System.out.println("Voulez-vous poster une annonce?");
					String annonce = sc.nextLine();
					if (annonce.equals("oui")) {
						System.out.println("Quelle genre d'annonce? Tapez 'web', 'presse spécialisée' ou 'journal local'.");
						String media = sc.nextLine();
						Annonce publicite = agence.creerAnnonce(appartement, media);
						System.out.println(publicite);
					}
				}
				else if (type.equals("maison")) {
					System.out.println("Quel est l'adresse du bien?");
					String adresseB = sc.nextLine();
					System.out.println("Quel est l'orientation du bien?");
					String orientation = sc.nextLine();
					System.out.println("Quel est le prix de ce bien?");
					int prix = Integer.parseInt(sc.nextLine());
					System.out.println("Quelle serait pour vous la date de vente souhaitée?");
					String date = sc.nextLine();
					System.out.println("Quel est la surface de ce bien?");
					int surface = Integer.parseInt(sc.nextLine());
					System.out.println("Quel est le nombre de pièces de ce bien?");
					int pieces = Integer.parseInt(sc.nextLine());
					System.out.println("Combien d'étages contient ce bien?");
					int etage = Integer.parseInt(sc.nextLine());
					System.out.println("Quel est le moyen de chauffage de ce bien?");
					String chauffage = sc.nextLine();
					BienImmobilier maison = agence.ajouterMaison(3, adresseB, orientation, prix, date, 3, surface, pieces, etage, chauffage, vendeur);
					
					System.out.println("Voulez-vous poster une annonce?");
					String annonce = sc.nextLine();
					if (annonce.equals("oui")) {
						System.out.println("Quelle genre d'annonce? Tapez 'web', 'presse spécialisée' ou 'journal local'.");
						String media = sc.nextLine();
						Annonce publicite = agence.creerAnnonce(maison, media);
						System.out.println(publicite);
					}
				}
			}
			else if (str.equals("acheteur")) {
				System.out.println("Quel est votre nom?");
				String nom = sc.nextLine();
				System.out.println("Quel est votre adresse?");
				String adresse = sc.nextLine();
				System.out.println("Quel est votre numéro de téléphone?");
				String telephone = sc.nextLine();
				System.out.println("Quel est votre mail?");
				String mail = sc.nextLine();
				Personne acheteur = new Personne(nom, adresse, telephone, mail, "acheteur");
				System.out.println("Tapez 'MAISON' si vous souhaitez acheter une maison, 'APPART' pour un appartement et 'TERRAIN' sinon.");
				String type = sc.nextLine();
				System.out.println("Quel est votre prix maximum?");
				int prix = Integer.parseInt(sc.nextLine());
				System.out.println("Quelle orientation recherchez-vous?");
				String orientation = sc.nextLine();
				System.out.println("Quelle surface recherchez-vous?");
				int surface = Integer.parseInt(sc.nextLine());
				if (type.equals("TERRAIN")) {
					Voeux voeux = acheteur.decrireVoeuxTerrain(type, prix, orientation, surface);
					System.out.println(voeux);
					
					System.out.println(voeux.typeBienrecherche);
					BienImmobilier check = agence.checkVoeux(voeux);
					System.out.println();
					System.out.println(agence.tabBienImmobilier);
					if (check == null) {
						System.out.println("Désolé nous n'avons pas de bien vous correspondant");
						System.exit(0);
					}
					else {
						System.out.println("Ce bien pourrait vous satifaire: "+check);
						System.out.println();
					}
					
					System.out.println("Ce bien vous satisfait-il? Voulez-vous signer une promesse de vente?");
					String reponse = sc.nextLine();
					if (reponse.equals("oui")) {
						PromesseVente promesse = check.creerPromesseVente(check.prixDemande, check.adresse, check.dateVenteSouhaiter, "200");
						Rdv rdvPromesse = agence.prendreRdvPromesseVente(check.vendeur, acheteur);
						System.out.println(rdvPromesse);
						System.out.println();
						System.out.println("Voulez-vous signer la promesse?");
						String choix = sc.nextLine();
						if (choix.equals("oui")) {
							System.out.println(acheteur.signerPromesseVente(promesse));
							System.out.println();
							System.out.println("Voulez pouvez encore vous dédire, le voulez-vous?");
							String rep = sc.nextLine();
							if (rep.equals("oui")) {
								System.out.println(acheteur.seDedire(promesse));
							}
							else {
								System.out.println("Bravo la vente est effectuée.");
								//agence.tabBienVendus(check);
							}
						}
					}
					else {
						System.out.println("Désolé nous n'avons pass d'autre bien correspondant.");
					}
				}
				else if (type.equals("APPART")){
					System.out.println("Quel est le nombre de pièces souhaité?");
					int pieces = Integer.parseInt(sc.nextLine());
					Voeux voeux = acheteur.decrireVoeuxAppart(type, prix, orientation, surface, pieces);
					System.out.println(voeux);
					System.out.println();
					
					BienImmobilier check = agence.checkVoeux(voeux);
					if (check == null) {
						System.out.println("Désolé nous n'avons pas de bien vous correspondant");
						System.exit(0);
					}
					else {
						System.out.println("Ce bien pourrait vous satifaire: "+check);
						System.out.println();
					}
					
					System.out.println("Ce bien vous satisfait-il? Voulez-vous signer une promesse de vente?");
					String reponse = sc.nextLine();
					if (reponse.equals("oui")) {
						PromesseVente promesse = check.creerPromesseVente(check.prixDemande, check.adresse, check.dateVenteSouhaiter, "200");
						Rdv rdvPromesse = agence.prendreRdvPromesseVente(check.vendeur, acheteur);
						System.out.println(rdvPromesse);
						System.out.println();
						System.out.println("Voulez-vous signer la promesse?");
						String choix = sc.nextLine();
						if (choix.equals("oui")) {
							System.out.println(acheteur.signerPromesseVente(promesse));
							System.out.println();
							System.out.println("Voulez pouvez encore vous dédire, le voulez-vous?");
							String rep = sc.nextLine();
							if (rep.equals("oui")) {
								System.out.println(acheteur.seDedire(promesse));
							}
							else {
								System.out.println("Bravo la vente est effectuée.");
								//agence.tabBienVendus(check);
							}
						}
					}
					else {
						System.out.println("Désolé nous n'avons pass d'autre bien correspondant.");
					}
				}
				else {
					System.out.println("Quel est le nombre de pièces souhaité?");
					int pieces = Integer.parseInt(sc.nextLine());
					Voeux voeux = acheteur.decrireVoeuxMaison(type, prix, orientation, surface, pieces);
					System.out.println(voeux);
					System.out.println();
					
					BienImmobilier check = agence.checkVoeux(voeux);
					if (check == null) {
						System.out.println("Désolé nous n'avons pas de bien vous correspondant");
						System.exit(0);
					}
					else {
						System.out.println("Ce bien pourrait vous satifaire: "+check);
						System.out.println();
					}
					
					System.out.println("Ce bien vous satisfait-il? Voulez-vous signer une promesse de vente?");
					String reponse = sc.nextLine();
					if (reponse.equals("oui")) {
						PromesseVente promesse = check.creerPromesseVente(check.prixDemande, check.adresse, check.dateVenteSouhaiter, "200");
						Rdv rdvPromesse = agence.prendreRdvPromesseVente(check.vendeur, acheteur);
						System.out.println(rdvPromesse);
						System.out.println();
						System.out.println("Voulez-vous signer la promesse?");
						String choix = sc.nextLine();
						if (choix.equals("oui")) {
							System.out.println();
							System.out.println(acheteur.signerPromesseVente(promesse));
							System.out.println();
							System.out.println("Voulez pouvez encore vous dédire, le voulez-vous?");
							String rep = sc.nextLine();
							if (rep.equals("oui")) {
								System.out.println(acheteur.seDedire(promesse));
							}
							else {
								System.out.println("Bravo la vente est effectuée.");
								//agence.tabBienVendus(check);
							}
						}
					}
					else {
						System.out.println("Désolé nous n'avons pass d'autre bien correspondant.");
					}
				}
				
				
				
			}
			
			/*try ( ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("StatistiquesVentes.dat")) ) {
				for(BienImmobilier x : agence.tabBienVendus) {
					System.out.println("Bien vendus = " + x);
					os.writeObject(x);
				}
			} catch (IOException e) {
				System.err.println("Erreur pendant la sérialisation : " + e);
				System.exit(1);
				}*/
		}
	}

}
