package agence;

import java.sql.Date;

public class Mandat {
	
	private Personne vendeur;
	private int Prix;
	private Date dateVente;
	private Date dureePartie;
	
	public Mandat(Personne vendeur, int prix, Date dateVente, Date dureePartie) {
		super();
		this.vendeur = vendeur;
		this.Prix = prix;
		this.dateVente = dateVente;
		this.dureePartie = dureePartie;
	}
	
	
	public Personne getVendeur() {
		return this.vendeur;
	}
	
	public int getPrix() {
		return this.Prix;
	}
	
	public Date getDureePartie() {
		return dureePartie;
	}
	
	public Date getDateVente() {
		return this.dateVente;
	}


}
