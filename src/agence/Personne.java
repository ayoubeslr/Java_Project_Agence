package agence;

import java.util.List;

public class Personne {
	private String nom;
	private String adresse;
	private String numeroTel;
	private String mail;
	private String type;
	private Voeux voeux;
	
	public Personne(String nom, String adresse, String numeroTel, String mail, String type) {
		this.nom = nom;
		this.adresse = adresse;
		this.numeroTel = numeroTel;
		this.mail = mail;
		this.type = type;
		this.voeux = null;
	}
	
	@Override

	public String toString() {

		return this.nom;

	}
	
	/**
	 * 
	 * @param promesse Passes en paramètre une promesse de vente qui sera signer par l'acheteur et le vendeur.
	 * @return Retourne la validation de la signature de la prommesse. Le prix que versera l'acheteur et les frais de vente.
	 */
	public String signerPromesseVente(PromesseVente promesse) {
		promesse.signe = true;
		int prix = promesse.prixVerseVendeur;
		int premierVersement = (10*prix)/100;
		int newPrixVerseVendeur = prix - premierVersement;
		return("La promesse de vente est signée. \nL'acheteur a déjà versé : "+premierVersement+ " euros et devra verser: "+newPrixVerseVendeur+" euros le "+promesse.dateVente+" + "+promesse.fraisVente+ " euros de frais de vente.");
	}
	
	/**
	 * 
	 * @param promesse On passe en paramètre une promesse de vente.
	 * @return On retourne une phrase disant s'il est vraiment possible de se déduire.
	 */
	
	public String seDedire(PromesseVente promesse) {
		String reponse = null;
		if ((this.type == "vendeur") || (promesse.signe == false)){
			reponse = "Vous ne pouvez pas vous dédire.";
		}
		else if ((this.type == "acheteur") && (promesse.signe == true)) {
			promesse.signe = false;
			reponse = "Vous venez de vous dédire de ce bien.";
		}
		return reponse;
	}
	
	/**
	 * 
	 * @param typeBienrecherche Quel type de bien l'acheteur souhaite-t-il.
	 * @param prixSouhaite Quel prix souhaite-t-il.
	 * @param localisationRecherche On entre en paramètre la localisation désirée.
	 * @param surfaceSolrecherche Surface désirée par le vendeur.
	 * @param nombreDePieceRecherche Nombre de pièce voulues.
	 * @return Retourne un nouveau voeux.
	 */
	
	public Voeux decrireVoeuxMaison(String typeBienrecherche, int prixSouhaite, String localisationRecherche, int surfaceSolrecherche, int nombreDePieceRecherche) {
		return this.voeux = new Voeux(typeBienrecherche, prixSouhaite, localisationRecherche, surfaceSolrecherche, nombreDePieceRecherche);
	}
	
	public Voeux decrireVoeuxTerrain(String typeBienrecherche, int prixSouhaite, String localisationRecherche, int surfaceSolrecherche) {
		return this.voeux = new Voeux(typeBienrecherche, prixSouhaite, localisationRecherche, surfaceSolrecherche);
	}
	
	public Voeux decrireVoeuxAppart(String typeBienrecherche, int prixSouhaite, String localisationRecherche, int surfaceSolrecherche,int nombreDePieceRecherche) {
		return this.voeux = new Voeux(typeBienrecherche, prixSouhaite, localisationRecherche, surfaceSolrecherche, nombreDePieceRecherche);
	}

	
}
