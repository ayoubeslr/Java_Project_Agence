package agence;

public class Mandat {

	private String dureeMandat;
	
	/**
	 * constructeur de la classe Mandat
	 * @param dureeMandat
	 */
	public Mandat(String dureeMandat) {
		this.dureeMandat = dureeMandat;
	}
	
	@Override
	public String toString() {
		return "Vos informations ont été enregistrées, voilà la durée du mandat: "+this.dureeMandat;
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
		Mandat other = (Mandat) obj;
		if (dureeMandat == null) {
			if (other.dureeMandat != null)
				return false;
		} else if (!dureeMandat.equals(other.dureeMandat))
			return false;
		return true;
	}
}
