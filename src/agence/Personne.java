 package agence;

import java.awt.List;
import java.util.ArrayList;

public class Personne {
	private String nom;
	private String prenom;
	private String adresse;
	private String numeroTel;
	private String mail;
	Voeux voeux;
	private ArrayList<Mandat> mandat;
	private ArrayList<PromesseVente> promesseDeVentes;
	
	public Personne(String nom, String adresse, String numeroTel, String mail) {
		this.nom = nom;
		this.adresse = adresse;
		this.numeroTel = numeroTel;
		this.mail = mail;
		this.mandat = new ArrayList<Mandat>();
		this.promesseDeVentes =  new ArrayList<PromesseVente>();
	}
	
	public void ajouterVoeux(Voeux voeux) {
		this.voeux = voeux;
	}
	
	public ArrayList<Mandat> getMandats(){
		return this.mandat;
	}
	
	public ArrayList<PromesseVente> getPromesseDeVente(PromesseVente promVente) {
		return this.promesseDeVentes;
	}
	
	
	
	
}
