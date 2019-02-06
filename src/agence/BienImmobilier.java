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
	
	/**
	 * Constructeur de la classe Bien immobilier
	 * @param id
	 * @param adresse
	 * @param orientation
	 * @param prixDemande
	 * @param dateVenteSouhaiter
	 * @param nInterne
	 * @param vendeur
	 */
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
	/**
	 * Cette methode retourne le mandat
	 * @return mandat
	 */
	
	public Mandat getMandat() {
		return this.mandat;
	}
	
	/**
	 * Cette methode retourne une promesse de vente
	 * @return promesse
	 */
	public PromesseVente getPromesseVente() {
		return this.promesse;
	}
	
	/**
	 * Cette methode retourne une liste de mandats
	 * @return mandats
	 */
	public List<Rdv> getMandats(){
		return this.mandats;
	}
	
	/**
	 * Cette methode retourne la liste de rendez vous pour les ventes
	 * methode geteur
	 * @return
	 */
	public List<Rdv> getVentes(){
		return this.ventes;
	}
	
	/**
	 * Cette methode retourne la liste de rendez-vous pour les visites d'un bien
	 * @return
	 */
	public List<Rdv> getVisite(){
		return this.visites;
	}
	
	/**
	 * Cette methode permet de s'inscrir a un Bien immobilier
	 * @param p
	 * @return une personne
	 */
	public Personne Inscrire(Personne p ) {
		
		return p;
	}
	
	/**
	 * Cette methode permet d'enregistrer un Acheteur
	 * @param acheteur
	 */
	public void enregistrerAcheteur(Personne acheteur) {
		if(this.acheteur == null) {
			this.acheteur = acheteur;
		}
	}
	
	/**
	 * Cette methode permet d'enregistrer un Mandat
	 * @param vendeur
	 * @param prix
	 * @param dateVente
	 * @param dureePartie
	 */
	public void enregistrerMandat(Personne vendeur, int prix, Date dateVente, Date dureePartie) {
		this.mandat = new Mandat(this.vendeur,prix,dateVente,dureePartie);
		this.vendeur.getMandats().add(this.mandat);
		
	}
	
	/**
	 * Cette methode permet d'enregistrer une Commission
	 * @return
	 */
	public Commission enregistrerCommission() {
		return this.commission = new Commission();
	}
	 
}

