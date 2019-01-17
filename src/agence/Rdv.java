package agence;

import java.sql.Date;

public class Rdv {
	private Date date;
	private BienImmobilier bien;
	private Personne personne;
	
	/**
	 * Constructeur de la classe bien
	 * @param bien
	 * @param bien
	 * @param personne
	 */
	public Rdv(Date date, BienImmobilier bien, Personne personne) {
		this.date = date;
		this.bien = bien;
		this.personne = personne;
	}

}
