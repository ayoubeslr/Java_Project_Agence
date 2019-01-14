package agence;

public class Personne {
	private String nom;
	private String adresse;
	private String numeroTel;
	private String mail;
	
	public Personne(String nom, String adresse, String numeroTel, String mail) {
		this.nom = nom;
		this.adresse = adresse;
		this.numeroTel = numeroTel;
		this.mail = mail;
	}
	
	@Override

	public String toString() {

		return "[Nom: "+this.nom+" / Adresse = "+this.adresse+" / Numéro de téléphone : "+this.numeroTel+" / Mail : "+this.mail+"]";

	}
	
}
