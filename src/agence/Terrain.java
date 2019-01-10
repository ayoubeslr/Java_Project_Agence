package agence;

public class Terrain extends BienImmobilier {
	int surfaceAuSole;
	int longueurDeLaFacade;
	
	public Terrain(int id, String adresse, String orientation, String prixDemande, String dateVenteSouhaiter,
			int nInterne, int surfaceAuSole, int longueurDeLaFacade ) {
		//Appel  au constructor de bien immobilier
		super(id, adresse, orientation, prixDemande, dateVenteSouhaiter, nInterne);
		this.surfaceAuSole = surfaceAuSole;
		this.longueurDeLaFacade = longueurDeLaFacade;
		
	}

}
