package agence;

public class PromesseVente {
	
	private String prixVerseVendeur;
	private String adresseNotaire;
	private String dateVente;
	private String fraisVente;
	private boolean signe;
	
	public PromesseVente(String prixVerseVendeur, String adresseNotaire, String dateVente, String fraisVente) {
		this.prixVerseVendeur = prixVerseVendeur;
		this.adresseNotaire = adresseNotaire;
		this.dateVente = dateVente;
		this.fraisVente = fraisVente;
		this.signe = false;
	}
	
	public String signerPromesseVente(PromesseVente promesse) {
		this.signe = true;
		return("La promesse de vente est signée. L'acheteur versera : "+this.prixVerseVendeur+ " euros + "+this.fraisVente+ " euros de frais de vente");
	}

}
