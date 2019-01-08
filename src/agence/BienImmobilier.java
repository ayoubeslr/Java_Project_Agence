package agence;

public class BienImmobilier {
	
	int id;
	String adresse;
	String orientation;
	String prixDemande;
	String dateVenteSouhaite;
	int numInterne;
	
	public BienImmobilier(int id, String adresse, String orientation, String prixDemande, String dateVenteSouhaite, int numInterne) {
		this.id = id;
		this.adresse = adresse;
		this.orientation = orientation;
		this.prixDemande = prixDemande;
		this.dateVenteSouhaite = dateVenteSouhaite;
		this.numInterne = numInterne;
	}
}
