package agence;

import java.sql.Date;
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
	private ArrayList<Annonce> annonces;
	
	private ArrayList<Rdv> ventes;
	private ArrayList<Rdv> visites;
	private ArrayList<Rdv> mandats;
	
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
	
	public Mandat getMandat() {
		return this.mandat;
	}
	
	public PromesseVente getPromesseVente() {
		return this.promesse;
	}
	
	public List<Rdv> getMandats(){
		return this.mandats;
	}
	
	public List<Rdv> getVentes(){
		return this.ventes;
	}
	
	public List<Rdv> getVisite(){
		return this.visites;
	}
	
	public void Inscrire() {
		
	}
	
	public void enregistrerAcheteur(Personne acheteur) {
		if(this.acheteur == null) {
			this.acheteur = acheteur;
		}
	}
	
	public void enregistrerMandat(Personne vendeur, int prix, Date dateVente, Date dureePartie) {
		this.mandat = new Mandat(this.vendeur,prix,dateVente,dureePartie);
		this.vendeur.getMandats().add(this.mandat);
		
	}
	
	public Commission enregistrerCommission() {
		return this.commission = new Commission();
	}
	
}

