package agence;

public class PersonneMorale extends Personne{
	String formeJuridique;
	int nSiren;
	
	public PersonneMorale(String nom, String adresse, int numeroTel, String mail, String formeJuridique, int nSiren) {
		super(nom, adresse, numeroTel, mail);
		this.formeJuridique = formeJuridique;
		this.nSiren = nSiren;
		
	}

}
