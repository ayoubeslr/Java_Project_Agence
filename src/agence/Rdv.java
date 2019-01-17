package agence;

public class Rdv {

	protected Personne personne1;
	protected Personne personne2;
	
	public Rdv(Personne personne) {
		this.personne1 = personne;
	}
	
	public Rdv(Personne personne1, Personne personne2) {
		this.personne1 = personne1;
		this.personne2 = personne2;
	}
	
	@Override

	public String toString() {

		return "Un rendez-vous est prévu entre "+this.personne1+" et "+this.personne2;

	}

}
