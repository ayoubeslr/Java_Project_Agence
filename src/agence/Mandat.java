package agence;

public class Mandat {
	
	private String dureeMandat;
	
	public Mandat(String dureeMandat) {
		this.dureeMandat = dureeMandat;
	}
	
	@Override

	public String toString() {

		return "Vos informations ont été enregistrées, voilà la durée du mandat: "+this.dureeMandat;
	}

}
