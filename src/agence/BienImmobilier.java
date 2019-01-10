package agence;

public class BienImmobilier {
	int id;
	String adresse;
	String orientation;
	String prixDemande;
	String dateVenteSouhaiter;
	int nInterne;
	
	public BienImmobilier(int id, String adresse, String orientation, String prixDemande, String dateVenteSouhaiter, int nInterne) {
		this.id = id;
		this.adresse = adresse;
		this.orientation = orientation;
		this.prixDemande = prixDemande;
		this.dateVenteSouhaiter = dateVenteSouhaiter;
		this.nInterne = nInterne;
	}
	
	public void Inscrire() {
		
	}
}
