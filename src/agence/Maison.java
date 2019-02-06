package agence;

public class Maison extends BienImmobilier {

	protected int surfaceHabitable;
	protected int nombreDePieces;
	protected int nombreEtages;
	protected String moyenDeChauffage;

	public Maison(int id, String adresse, String orientation, int prixDemande, String dateVenteSouhaiter,
			int nInterne, int surfaceHabitable, int nombreDePieces, int nombreEtages, String moyenDeChauffage, Personne vendeur) {
		super(id, adresse, orientation, prixDemande, dateVenteSouhaiter, nInterne, vendeur);
		
		this.surfaceHabitable = surfaceHabitable;
		this.nombreDePieces = nombreDePieces;
		this.nombreEtages = nombreEtages;
		this.moyenDeChauffage = moyenDeChauffage;
		this.type = "MAISON";
	}

	@Override

	public String toString() {

		return "Adresse: "+this.adresse+" \n Orientation: "+this.orientation+" \n Prix demandé: "+this.prixDemande+" \n Date de vente souhaitée: "+this.dateVenteSouhaiter+" \n Nom du vendeur: "+this.vendeur+" \n Surface au sol: "+this.surfaceHabitable+" \n Nombre de pièces: "+this.nombreDePieces+" \n Nombre d'étages: "+ this.nombreEtages+"\n Moyen de chauffage: "+this.moyenDeChauffage;

	}
}
