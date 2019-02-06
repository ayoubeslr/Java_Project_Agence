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
	/**
	 * Consutructeur de la classe Personne
	 * @param nom
	 * @param adresse
	 * @param numeroTel
	 * @param mail
	 */
	public Personne(String nom, String adresse, String numeroTel, String mail) {
		this.nom = nom;
		this.adresse = adresse;
		this.numeroTel = numeroTel;
		this.mail = mail;
		this.mandat = new ArrayList<Mandat>();
		this.promesseDeVentes =  new ArrayList<PromesseVente>();
	}
	
	/**
	 * Cette methode permet d'ajouter un Voeux
	 * @param voeux
	 * 
	 */
	public void ajouterVoeux(Voeux voeux) {
		this.voeux = voeux;
	}
	
	/**
	 * methode getteur
	 * permet de recuperer une liste de Mandat
	 * @return mandat
	 */
	public ArrayList<Mandat> getMandats(){
		return this.mandat;
	}
	
	/**
	 * methode getteur
	 * permet de recuperer une liste de PrommesseVente
	 * @param promVente
	 * @return une prommese de ventes
	 */
	public ArrayList<PromesseVente> getPromesseDeVente(PromesseVente promVente) {
		return this.promesseDeVentes;
	}
	
	
	
	
}
