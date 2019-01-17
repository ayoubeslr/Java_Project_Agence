package agence;

public class PromesseVente {
	
	String prixVerseVendeur;
	private String adresseNotaire;
	String dateVente;
	String fraisVente;
	Commission commission;
	boolean signe;
	
	public PromesseVente(String prixVerseVendeur, String adresseNotaire, String dateVente, String fraisVente) {
		this.prixVerseVendeur = prixVerseVendeur;
		this.adresseNotaire = adresseNotaire;
		this.dateVente = dateVente;
		this.fraisVente = fraisVente;
		this.commission = new Commission(prixVerseVendeur);
		this.signe = false;
	}
	
	@Override

	public String toString() {

		return "Prix versé au vendeur: "+this.prixVerseVendeur+" euros\nAdresse du notaire: "+this.adresseNotaire+"\nDate de vente: "+this.dateVente+"\nFrais de vente: "+this.fraisVente+" euros\nCommission: "+this.commission+" euros";

	}
}
