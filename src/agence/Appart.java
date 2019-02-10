package agence;

public class Appart extends BienImmobilier {

	protected int nombreDePieces;
	protected int etage;
	protected int chargesMensuelles;
	protected int surface;
	/**
	 * Constructeur de la classe Appart
	 * @param id
	 * @param adresse
	 * @param orientation
	 * @param prixDemande
	 * @param dateVenteSouhaiter
	 * @param nInterne
	 * @param surface
	 * @param nombreDePieces
	 * @param etage
	 * @param chargesMensuelles
	 * @param vendeur
	 */
	public Appart(int id, String adresse, String orientation, int prixDemande, String dateVenteSouhaiter,
			int nInterne, int surface, int nombreDePieces, int etage, int chargesMensuelles, Personne vendeur) {
		super(id, adresse, orientation, prixDemande, dateVenteSouhaiter, nInterne, vendeur);
		this.surface = surface;
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
