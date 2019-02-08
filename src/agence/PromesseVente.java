package agence;

public class PromesseVente {
	
	int prixVerseVendeur;
	private String adresseNotaire;
	String dateVente;
	String fraisVente;
	Commission commission;
	boolean signe;
	
	public PromesseVente(int prixDemande2, String adresseNotaire, String dateVente, String fraisVente) {
		this.prixVerseVendeur = prixDemande2;
		this.adresseNotaire = adresseNotaire;
		this.dateVente = dateVente;
		this.fraisVente = fraisVente;
		this.commission = new Commission(prixDemande2);
		this.signe = false;
	}
	
	@Override

	public String toString() {

		return "Prix versé au vendeur: "+this.prixVerseVendeur+" euros\nAdresse du notaire: "+this.adresseNotaire+"\nDate de vente: "+this.dateVente+"\nFrais de vente: "+this.fraisVente+" euros\nCommission: "+this.commission+" euros";

	}
}
