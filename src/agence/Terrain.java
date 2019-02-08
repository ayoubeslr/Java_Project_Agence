package agence;

public class Terrain extends BienImmobilier {

	protected int surfaceAuSol;
	protected int longueurDeLaFacade;
	
	public Terrain(int id, String adresse, String orientation, int prixDemande, String dateVenteSouhaiter,
			int nInterne, int surfaceAuSole, int longueurDeLaFacade, Personne vendeur ) {
		super(id, adresse, orientation, prixDemande, dateVenteSouhaiter, nInterne, vendeur);
		this.surfaceAuSol = surfaceAuSole;
		this.longueurDeLaFacade = longueurDeLaFacade;
		this.type = "TERRAIN";
		
	}


	@Override
	public String toString() {

		return "Adresse: "+this.adresse+" \n Orientation: "+this.orientation+" \n Prix demandé: "+this.prixDemande+" \n Date de vente souhaitée: "+this.dateVenteSouhaiter+" \n Nom du vendeur: "+this.vendeur+" \n Surface au sol: "+this.surfaceAuSol+" \n Taille de la façade: "+this.longueurDeLaFacade;

	}
}
