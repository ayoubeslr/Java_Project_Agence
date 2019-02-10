package agence;

public class PersonneMorale extends Personne{
	private String formeJuridique;
	private int nSiren;
	
	/**
	 * constructeur de la classe PersonneMoral
	 * @param nom
	 * @param adresse
	 * @param numeroTel
	 * @param mail
	 * @param type
	 * @param formeJuridique
	 * @param nSiren
	 */
	public PersonneMorale(String nom, String adresse, String numeroTel, String mail, String type, String formeJuridique, int nSiren) {
		super(nom, adresse, numeroTel, mail, type);
		this.formeJuridique = formeJuridique;
		this.nSiren = nSiren;
		
	}

}
