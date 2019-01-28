package agence;

public class Terrain extends BienImmobilier {

	protected int surfaceAuSole;
	protected int longueurDeLaFacade;
	
	public Terrain(int id, String adresse, String orientation, String prixDemande, String dateVenteSouhaiter,
			int nInterne, int surfaceAuSole, int longueurDeLaFacade ) {
		super(id, adresse, orientation, prixDemande, dateVenteSouhaiter, nInterne, acheteur);
		this.surfaceAuSole = surfaceAuSole;
		this.longueurDeLaFacade = longueurDeLaFacade;
		this.type = "TERRAIN";
		
	}
	
	public void getType() {
		
	}
}
