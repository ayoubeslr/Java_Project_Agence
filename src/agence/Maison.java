package agence;

public class Maison extends BienImmobilier {

	protected String surfaceHabitable;
	protected int nombreDePieces;
	protected int nombreEtages;
	protected String moyenDeChauffage;

	public Maison(int id, String adresse, String orientation, String prixDemande, String dateVenteSouhaiter,
			int nInterne, String surfaceHabitable, int nombreDePieces, int nombreEtages, String moyenDeChauffage) {
		super(id, adresse, orientation, prixDemande, dateVenteSouhaiter, nInterne, acheteur);
		
		this.surfaceHabitable = surfaceHabitable;
		this.nombreDePieces = nombreDePieces;
		this.nombreEtages = nombreEtages;
		this.moyenDeChauffage = moyenDeChauffage;
		this.type = "MAISON";
	}

}
