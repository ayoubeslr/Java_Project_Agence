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
		Prix = prix;
		this.dateVente = dateVente;
		this.dureePartie = dureePartie;
	}
	
	
	public Personne Vendeur() {
		return this.vendeur;
	}
	
	public int Prix() {
		return this.Prix;
	}
	
	public Date duree() {
		return dureePartie;
	}
	
	
}
