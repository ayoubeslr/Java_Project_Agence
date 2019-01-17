package agence;
import java.util.ArrayList;
import java.util.List;


public class BienImmobilier {
	private int id;
	private String adresse;
	private String orientation;
	private String prixDemande;
	private String dateVenteSouhaiter;
	private int nInterne;
	
	private Personne acheteur;
	private Personne vendeur;
	private List<Annonce> annonces;
	
	private List<Rdv> ventes;
	private List<Rdv> visites;
	private List<Rdv> mandats;
	
	Commission commission;
	PromesseVente promesse;
	Mandat mandat;
	
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
		
		this.mandat = null;
		this.promesse = null;
		this.visites = null;
		
		this.ventes = new ArrayList<Rdv>();
		this.mandats = new ArrayList<Rdv>();
		this.visites = new ArrayList<Rdv>();

	}
	
	public void Inscrire() {
		
	}
	
	
	public void enregistrerMandat(Mandat manda) {
		
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
	public Commission creerCommission() {
		return this.commission = new Commission();
	}
	
	public PromesseVente creerPromesseVente(String prixVerseVendeur, String adresseNotaire, String dateVente, String fraisVente) {
		return this.promesse = new PromesseVente(prixVerseVendeur, adresseNotaire, dateVente, fraisVente);
	}
	
	public Mandat creerMandat(String dureeMandat) {
		return this.mandat = new Mandat(dureeMandat);
	}
}
