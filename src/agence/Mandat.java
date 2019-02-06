package agence;

import java.sql.Date;

public class Mandat {
	
	private Personne vendeur;
	private int Prix;
	private Date dateVente;
	private Date dureePartie;
	
	/**
	 * Constructeur de la classe Mandat
	 * @param vendeur
	 * @param prix
	 * @param dateVente
	 * @param dureePartie
	 */
	public Mandat(Personne vendeur, int prix, Date dateVente, Date dureePartie) {
		super();
		this.vendeur = vendeur;
		this.Prix = prix;
		this.dateVente = dateVente;
		this.dureePartie = dureePartie;
	}
	
	/**
	 * Cette methode permet de recuperer un Vendeur
	 * @return
	 */
	public Personne getVendeur() {
		return this.vendeur;
	}
	
	/**
	 * Cette methode permet de recuperer les prix
	 * @return
	 */
	public int getPrix() {
		return this.Prix;
	}
	
	/**
	 *
	 * @return la date d'une partie
	 */
	public Date getDureePartie() {
		return dureePartie;
	}
	
	/**
	 * Cette methode permet de recuperer la date d'une vente
	 * @return la date d'une Vente
	 */
	public Date getDateVente() {
		return this.dateVente;
	}


}
