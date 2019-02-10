package agence;
import java.util.ArrayList;
import java.util.List;


public class BienImmobilier {
	protected int id;
	public String adresse;
	protected String orientation;
	public int prixDemande;
	public String dateVenteSouhaiter;
	protected int nInterne;
	protected static Personne acheteur;
	public Personne vendeur;
	protected Rdv rdvMandat;
	protected Rdv vente;
	protected Rdv visite;
	PromesseVente promesse;
	protected List<PromesseVente> tabPromesse;
	String type;
	
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
	public BienImmobilier(int id, String adresse, String orientation, int prixDemande,
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
		this.tabPromesse = new ArrayList<PromesseVente>();
		this.type = null;
		
		
	}
	
	/**
	 * methode getterAchteur
	 * @return une personne ajouteur
	 */
	public Personne getterAcheteur() { return this.acheteur; }
	
	/**
	 * methode getterRdvMandat
	 * @return rdv Mandat
	 */
	public Rdv getterRdvMandat() { return this.rdvMandat; }
	
	/**
	 * methode getterVenter
	 * @return vente
	 */
	public Rdv getterVente() { return this.vente; }
	
	/**
	 * mehtode getterVisiter
	 * @return un rdv pour la vente
	 */
	public Rdv getterVisite() { return this.visite; }
	
	/**
	 * methode getterPromme
	 * @return une promesse de vente
	 */
	public PromesseVente getterPromesse() { return this.promesse; }
	
	/**
	 * methode getterMandat
	 * @return un mandat
	 */
	public Mandat getterMandat() { return this.mandat; }
	
	/**
	 * cette methode redefinie equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BienImmobilier other = (BienImmobilier) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (dateVenteSouhaiter == null) {
			if (other.dateVenteSouhaiter != null)
				return false;
		} else if (!dateVenteSouhaiter.equals(other.dateVenteSouhaiter))
			return false;
		if (id != other.id)
			return false;
		if (mandat == null) {
			if (other.mandat != null)
				return false;
		} else if (!mandat.equals(other.mandat))
			return false;
		if (nInterne != other.nInterne)
			return false;
		if (orientation == null) {
			if (other.orientation != null)
				return false;
		} else if (!orientation.equals(other.orientation))
			return false;
		if (prixDemande != other.prixDemande)
			return false;
		if (promesse == null) {
			if (other.promesse != null)
				return false;
		} else if (!promesse.equals(other.promesse))
			return false;
		if (rdvMandat == null) {
			if (other.rdvMandat != null)
				return false;
		} else if (!rdvMandat.equals(other.rdvMandat))
			return false;
		if (tabPromesse == null) {
			if (other.tabPromesse != null)
				return false;
		} else if (!tabPromesse.equals(other.tabPromesse))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (vendeur == null) {
			if (other.vendeur != null)
				return false;
		} else if (!vendeur.equals(other.vendeur))
			return false;
		if (vente == null) {
			if (other.vente != null)
				return false;
		} else if (!vente.equals(other.vente))
			return false;
		if (visite == null) {
			if (other.visite != null)
				return false;
		} else if (!visite.equals(other.visite))
			return false;
		return true;
	}

	/**
	 * Cette methode permet d'enregistrer un Acheteur
	 * @param acheteur
	 */
	public void ajouterAcheteur(Personne acheteur) {
		this.acheteur = acheteur; 
	}
	/**
	 * cette methode permet de programmer un rendez-vous pour mandat
	 * @param mandat
	 */
	public void programmerRdvMandat(Rdv mandat) {
		this.rdvMandat = mandat;
	}
	
	/**
	 * cette methode permet programmer un rendez-vous pour une vente
	 * @param vente
	 */
	public void programmerRdvVente(Rdv vente) {
		this.vente = vente;
	}
	/**
	 * cette methode permet de programmer un rendez-vous pour une visite
	 * @param visite
	 */
	public void programmerRdvVisite(Rdv visite) {
		this.visite = visite;}
	
	/**
	 * cette methode permet de creer une promesse de vente
	 * @param prixDemande2
	 * @param adresseNotaire
	 * @param dateVente
	 * @param fraisVente
	 * @return
	 */
	public PromesseVente creerPromesseVente(int prixDemande2, String adresseNotaire, String dateVente, String fraisVente) {
		this.promesse = new PromesseVente(prixDemande2, adresseNotaire, dateVente, fraisVente);
		this.tabPromesse.add(this.promesse);
		return this.promesse;
	}
	
	/**
	 * Cette methode ceer un Mandat
	 * @param dureeMandat
	 * @return mandat
	 */
	public Mandat creerMandat(String dureeMandat) {
		return this.mandat = new Mandat(dureeMandat);

	}
	
	/**
	 * methode tpString
	 */
	@Override
	public String toString() {
		return "["+this.id+" / "+this.adresse+" / "+this.orientation+" / "+this.prixDemande+" / "+this.dateVenteSouhaiter+" / "+this.nInterne+" / "+this.vendeur+"]";

	}
	
	
}
