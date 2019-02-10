package agence;

public class Rdv {

	protected Personne personne1;
	protected Personne personne2;
	
	/**
	 * constructeur de la classe Rdv
	 * @param personne
	 */
	public Rdv(Personne personne) {
		this.personne1 = personne;
	}
	
	/**
	 * constructeur de la classe rdv
	 * @param personne1
	 * @param personne2
	 */
	public Rdv(Personne personne1, Personne personne2) {
		this.personne1 = personne1;
		this.personne2 = personne2;
	}
	
	/**
	 * redefinition de la methode equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rdv other = (Rdv) obj;
		if (personne1 == null) {
			if (other.personne1 != null)
				return false;
		} else if (!personne1.equals(other.personne1))
			return false;
		if (personne2 == null) {
			if (other.personne2 != null)
				return false;
		} else if (!personne2.equals(other.personne2))
			return false;
		return true;
	}

	@Override

	public String toString() {
		return "Un rendez-vous est prévu entre "+this.personne1+" et "+this.personne2+" pour signer la promesse de vente";

	}

}
