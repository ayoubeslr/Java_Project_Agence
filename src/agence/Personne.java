package agence;

import java.util.List;

public class Personne {
	private String nom;
	private String adresse;
	private int numeroTel;
	private String mail;
	private List<Mandat> mandat;
	private List<PromesseVente> promessedeVente;
	
	public Personne(String nom, String adresse, int numeroTel, String mail) {
		this.nom = nom;
		this.adresse = adresse;
		this.numeroTel = numeroTel;
		this.mail = mail;
	}

	
	public void prendreRDV() {
	
		
	}
	
}
