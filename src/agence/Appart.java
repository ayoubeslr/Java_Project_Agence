package agence;

public class Appart extends BienImmobilier {
	int nombreDePieces;
	int etage;
	int chargesMensuelles;
	
	public Appart(int id, String adresse, String orientation, String prixDemande, String dateVenteSouhaiter,
			int nInterne, int nombreDePieces, int etage, int chargesMensuelles) {
		super(id, adresse, orientation, prixDemande, dateVenteSouhaiter, nInterne);
		this.nombreDePieces = nombreDePieces;
		this.etage = etage;
		this.chargesMensuelles = chargesMensuelles;
	}
	
	
}
