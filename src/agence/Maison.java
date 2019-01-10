package agence;

public class Maison extends BienImmobilier {
	String surfaceHabitable;
	int nombreDePi�ces;
	int nombreEtages;
	String moyenDeChauffage;

	public Maison(int id, String adresse, String orientation, String prixDemande, String dateVenteSouhaiter,
			int nInterne, String surfaceHabitable, int nombreDePi�ces, int nombreEtages, String moyenDeChauffage) {
		super(id, adresse, orientation, prixDemande, dateVenteSouhaiter, nInterne);
		this.surfaceHabitable = surfaceHabitable;
		this.nombreDePi�ces = nombreDePi�ces;
		this.nombreEtages = nombreEtages;
		this.moyenDeChauffage = moyenDeChauffage;
	}

}
