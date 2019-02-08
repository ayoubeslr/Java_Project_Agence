 package agence;

import java.util.ArrayList;
import java.util.List;

import agence.Annonce.Media;

public class Agence{
	
	private List<Annonce> tabAnnonce;
	private List<Rdv> tabRdv;
	private List<BienImmobilier> tabBienImmobilier;
	private Annonce annonce;
	private Rdv rdvPromesse;
	private BienImmobilier bien;
	public List<BienImmobilier> tabBienVendus;
	
	public Agence() {
		this.tabAnnonce = new ArrayList<Annonce>();
		this.tabRdv = new ArrayList<Rdv>();
		this.tabBienImmobilier = new ArrayList<BienImmobilier>();

	}
	
	/**
	 * 
	 * @param bien bien immobilier Ã  ajouter Ã  l'annonce
	 * @param media forme de l'annonce
	 */
	
	public Annonce creerAnnonce(BienImmobilier bien, String mediaChoisi) {
		this.annonce = new Annonce(bien, mediaChoisi);
		this.tabAnnonce.add(annonce);
		return annonce;
	}
	
	/**
	 * 
	 * @param vendeur Représente le vendeur du bien.
	 * @param acheteur Représente l'acheteur du bien.
	 * @return Retourne un rendez-vous entre deux personne.
	 */
	public Rdv prendreRdvPromesseVente(Personne vendeur, Personne acheteur) {
		this.rdvPromesse = new Rdv(vendeur, acheteur);
		this.tabRdv.add(rdvPromesse);
		return rdvPromesse;
	}
	
	/**
	 * 
	 * @param type Représente le type du terrain.
	 * @param id Représente l'identifiant du terrain.
	 * @param adresse Représente l'adresse du terrain.
	 * @param orientation Représente la localisation du terrain.
	 * @param prixDemande Représente le prix demandé pour ce terrain.
	 * @param dateVenteSouhaiter Représente la date de vente souhaitée pour ce terrain.
	 * @param nInterne Représente le numéro interne à l'agence du terrain.
	 * @param surfaceAuSole Représente la surface au sol du terrain.
	 * @param longueurDeLaFacade Représente la longueur de la façade du terrain.
	 * @param vendeur Représente le vendeur du terrain.
	 * @return Retourne le terrain ajouté.
	 */
	
	public BienImmobilier ajouterTerrain(String type, int id, String adresse, String orientation, int prixDemande, String dateVenteSouhaiter, int nInterne, int surfaceAuSole, int longueurDeLaFacade, Personne vendeur) {
		this.bien = new Terrain(id, adresse, orientation, prixDemande, dateVenteSouhaiter, nInterne, surfaceAuSole, longueurDeLaFacade, vendeur);
		this.tabBienImmobilier.add(bien);
		return bien;
	}
	
	/**
	 * 
	 * @param id Représente l'identifiant de l'appartement.
	 * @param adresse Représente l'adresse de l'appartement.
	 * @param orientation Représente la localisation de l'appartement.
	 * @param prixDemande Représente le prix demandé pour cet appartement
	 * @param dateVenteSouhaiter Représente la date de vente souhaitée pour cet appartement.
	 * @param nInterne Représente le numéro interne à l'agence de l'appartement.
	 * @param nombreDePieces Représente le nombre de pièces de l'appartement.
	 * @param etage Représente l'étage où se situe l'appartement.
	 * @param chargesMensuelles Représente les charges mensuelles de l'appartement.
	 * @param vendeur Représente le vendeur de l'appartement.
	 * @return Retourne l'appartement ajouté.
	 */
	
	public BienImmobilier ajouterAppart(int id, String adresse, String orientation, int prixDemande, String dateVenteSouhaiter, int nInterne, int nombreDePieces, int etage, int chargesMensuelles, Personne vendeur) {
		this.bien = new Appart(id, adresse, orientation, prixDemande, dateVenteSouhaiter, nInterne, nombreDePieces, etage, chargesMensuelles, vendeur);
		this.tabBienImmobilier.add(bien);
		return bien;
	}
	
	/**
	 * 
	  * @param id Représente l'identifiant de la maison.
	 * @param adresse Représente l'adresse de la maison.
	 * @param orientation Représente la localisation de la maison.
	 * @param prixDemande Représente le prix demandé pour cette maison
	 * @param dateVenteSouhaiter Représente la date de vente souhaitée pour cette maison.
	 * @param nInterne Représente le numéro interne à l'agence de la maison.
	 * @param surfaceHabitable Représente la surface habitable de la maison.
	 * @param nombreDePieces Représente le nombre de pièces de la maison.
	 * @param nombreEtages Représente le nombre d'étages de la maison.
	 * @param moyenDeChauffage Représente le moyen de chauffage de la maison.
	 * @param vendeur Représente le vendeur de la maison.
	 * @return Retourne la maison ajoutée.
	 */
	
	public BienImmobilier ajouterMaison(int id, String adresse, String orientation, int prixDemande, String dateVenteSouhaiter, int nInterne, int surfaceHabitable, int nombreDePieces, int nombreEtages, String moyenDeChauffage, Personne vendeur) {
		this.bien = new Maison(id, adresse, orientation, prixDemande, dateVenteSouhaiter, nInterne, surfaceHabitable, nombreDePieces, nombreEtages, moyenDeChauffage, vendeur);
		this.tabBienImmobilier.add(bien);
		return bien;
	}
	
	/**
	 * 
	 * @param voeux Représente le voeux de l'acheteur.
	 * @return Retourne une description d'un voeux correspondant.
	 */
	
	public String checkVoeux(Voeux voeux) {
		String reponse = null;
		for(BienImmobilier x : this.tabBienImmobilier) {
			if (x.type == "TERRAIN") {
				Terrain i = (Terrain) x;
				if ((voeux.localisationRecherche == i.orientation) && (voeux.prixSouhaite  == i.prixDemande) && (voeux.surfaceSolrecherche == i.surfaceAuSol)) {
					reponse = ("Ce terrain pourrait vous convenir: \n" +i);
				}
				else {
					reponse = ("Désolé nous n'avons pas de terrain correspondant à votre voeux.");
				}
				}
			else if (x.type == "APPART") {
				Appart i = (Appart) x;
				if ((voeux.localisationRecherche == i.orientation) && (voeux.prixSouhaite  == i.prixDemande) && (voeux.nombreDePieceRecherche == i.nombreDePieces)) {
					reponse = ("Cet appartement pourrait vous convenir: \n" +i);
				}
				else {
					reponse = ("Désolé nous n'avons pas d'appartement correspondant à votre voeux.");
				}
				}
			else if (x.type == "MAISON") {
				Maison i = (Maison) x;
				if ((voeux.localisationRecherche == i.orientation) && (voeux.prixSouhaite  == i.prixDemande) && (voeux.nombreDePieceRecherche == i.nombreDePieces) && (voeux.surfaceSolrecherche == i.surfaceHabitable)) {
					reponse = ("Cette maison pourrait vous convenir: \n" +i);
				}
				else {
					reponse = ("Désolé nous n'avons pas de maison correspondant à votre voeux.");
				}
			}
		}
		return reponse;
	}
	
	/**
	 * 
	 * @param bien2 Représente un bien qui a été vendu.
	 */

	public void tabBienVendus(BienImmobilier bien2) {
		this.tabBienVendus.add(bien2);		
	}
}