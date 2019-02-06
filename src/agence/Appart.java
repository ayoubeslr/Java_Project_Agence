package agence;

public class Appart extends BienImmobilier {

	protected int nombreDePieces;
	protected int etage;
	protected int chargesMensuelles;
	
	public Appart(int id, String adresse, String orientation, int prixDemande, String dateVenteSouhaiter,
			int nInterne, int nombreDePieces, int etage, int chargesMensuelles, Personne vendeur) {
		super(id, adresse, orientation, prixDemande, dateVenteSouhaiter, nInterne, vendeur);

		this.nombreDePieces = nombreDePieces;
		this.etage = etage;
		this.chargesMensuelles = chargesMensuelles;
		this.type = "APPART";
	}
	
	@Override

	public String toString() {

		return "Adresse: "+this.adresse+" \n Orientation: "+this.orientation+" \n Prix demandé: "+this.prixDemande+" \n Date de vente souhaitée: "+this.dateVenteSouhaiter+" \n Nom du vendeur: "+this.vendeur+" \n Nombre de pièces: "+this.nombreDePieces+" \n Etage: "+this.etage+" \n Charges mensuelles: "+ this.chargesMensuelles;

	}
	
	
}
