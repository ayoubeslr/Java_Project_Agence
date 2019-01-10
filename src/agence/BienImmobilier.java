package agence;

public class BienImmobilier {
	private int id;
	private String adresse;
	private String orientation;
	private String prixDemande;
	private String dateVenteSouhaiter;
	private int nInterne;
	protected static Personne acheteur;
	private Personne vendeur;
	private Rdv rdvMandat;
	private Rdv vente;
	private Rdv visite;
	
	public BienImmobilier(int id, String adresse, String orientation, String prixDemande,
			String dateVenteSouhaiter, int nInterne, Personne vendeur) {
		this.id = id;
		this.adresse = adresse;
		this.orientation = orientation;
		this.prixDemande = prixDemande;
		this.dateVenteSouhaiter = dateVenteSouhaiter;
		this.nInterne = nInterne;
		this.acheteur = null;
		this.vendeur = vendeur;
		this.rdvMandat = null;
		this.vente = null;
		this.visite = null;
	}
	
	public void Inscrire() {
		
	}
	
	public void ajouterAcheteur(Personne acheteur) {
		this.acheteur = acheteur; 
	}
	
	public void programmerRdvMandat(Rdv mandat) {
		this.rdvMandat = mandat;
	}
	
	public void programmerRdvVente(Rdv vente) {
		this.vente = vente;
	}
	public void programmerRdvVisite(Rdv visite) {
		this.visite = visite;
	}
}
