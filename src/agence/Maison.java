package agence;

public class Maison extends BienImmobilier {
	String surfaceHabitable;
	int nombreDePieces;
	int nombreEtages;
	String moyenDeChauffage;

	public Maison(int id, String adresse, String orientation, String prixDemande, String dateVenteSouhaiter,
			int nInterne, String surfaceHabitable, int nombreDePieces, int nombreEtages, String moyenDeChauffage) {
		super(id, adresse, orientation, prixDemande, dateVenteSouhaiter, nInterne);
		
		this.surfaceHabitable = surfaceHabitable;
		this.nombreDePieces = nombreDePieces;
		this.nombreEtages = nombreEtages;
		this.moyenDeChauffage = moyenDeChauffage;
	}

}
