package agence;

public class PersonneMorale extends Personne{
	private String formeJuridique;
	private int nSiren;
	
	public PersonneMorale(String nom, String adresse, int numeroTel, String mail, String formeJuridique, int nSiren) {
		super(nom, adresse, numeroTel, mail);
		this.formeJuridique = formeJuridique;
		this.nSiren = nSiren;
		
	}

}
