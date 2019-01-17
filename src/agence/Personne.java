package agence;

public class Personne {
	private String nom;
	private String adresse;
	private String numeroTel;
	private String mail;
	private String type;
	
	public Personne(String nom, String adresse, String numeroTel, String mail, String type) {
		this.nom = nom;
		this.adresse = adresse;
		this.numeroTel = numeroTel;
		this.mail = mail;
		this.type = type;
	}
	
	@Override

	public String toString() {

		return "["+this.nom+"]";

	}
	
	/**
	 * 
	 * @param promesse Passes en paramètre une promesse de vente qui sera signer par l'acheteur et le vendeur.
	 * @return Retourne la validation de la signature de la prommesse. Le prix que versera l'acheteur et les frais de vente.
	 */
	public String signerPromesseVente(PromesseVente promesse) {
		promesse.signe = true;
		int prix = Integer.parseInt(promesse.prixVerseVendeur);
		int premierVersement = (10*prix)/100;
		int newPrixVerseVendeur = prix - premierVersement;
		return("La promesse de vente est signée. \nL'acheteur a déjà versé : "+premierVersement+ " euros et devra verser: "+newPrixVerseVendeur+" euros le "+promesse.dateVente+" + "+promesse.fraisVente+ " euros de frais de vente.");
	}
	
	public String seDedire(PromesseVente promesse) {
		if ((this.type == "vendeur") && (promesse.signe == false)){
			
		}
	}

	
}
