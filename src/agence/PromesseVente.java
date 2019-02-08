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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PromesseVente other = (PromesseVente) obj;
		if (adresseNotaire == null) {
			if (other.adresseNotaire != null)
				return false;
		} else if (!adresseNotaire.equals(other.adresseNotaire))
			return false;
		if (commission == null) {
			if (other.commission != null)
				return false;
		} else if (!commission.equals(other.commission))
			return false;
		if (dateVente == null) {
			if (other.dateVente != null)
				return false;
		} else if (!dateVente.equals(other.dateVente))
			return false;
		if (fraisVente == null) {
			if (other.fraisVente != null)
				return false;
		} else if (!fraisVente.equals(other.fraisVente))
			return false;
		if (prixVerseVendeur != other.prixVerseVendeur)
			return false;
		if (signe != other.signe)
			return false;
		return true;
	}



	@Override
	public String toString() {

		return "Prix versé au vendeur: "+this.prixVerseVendeur+" euros\nAdresse du notaire: "+this.adresseNotaire+"\nDate de vente: "+this.dateVente+"\nFrais de vente: "+this.fraisVente+" euros\nCommission: "+this.commission+" euros";

	}
	
	
}
