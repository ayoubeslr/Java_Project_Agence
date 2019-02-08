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
	 * @param bien bien immobilier à ajouter à l'annonce
	 * @param media forme de l'annonce
	 */
	
	public Annonce creerAnnonce(BienImmobilier bien, String mediaChoisi) {
		this.annonce = new Annonce(bien, mediaChoisi);
		this.tabAnnonce.add(annonce);
		return annonce;
	}
	
	/**
	 * 
	 * @param vendeur Repr�sente le vendeur du bien.
	 * @param acheteur Repr�sente l'acheteur du bien.
	 * @return Retourne un rendez-vous entre deux personne.
	 */
	public Rdv prendreRdvPromesseVente(Personne vendeur, Personne acheteur) {
		this.rdvPromesse = new Rdv(vendeur, acheteur);
		this.tabRdv.add(rdvPromesse);
		return rdvPromesse;
	}
	
	/**
	 * 
	 * @param type Repr�sente le type du terrain.
	 * @param id Repr�sente l'identifiant du terrain.
	 * @param adresse Repr�sente l'adresse du terrain.
	 * @param orientation Repr�sente la localisation du terrain.
	 * @param prixDemande Repr�sente le prix demand� pour ce terrain.
	 * @param dateVenteSouhaiter Repr�sente la date de vente souhait�e pour ce terrain.
	 * @param nInterne Repr�sente le num�ro interne � l'agence du terrain.
	 * @param surfaceAuSole Repr�sente la surface au sol du terrain.
	 * @param longueurDeLaFacade Repr�sente la longueur de la fa�ade du terrain.
	 * @param vendeur Repr�sente le vendeur du terrain.
	 * @return Retourne le terrain ajout�.
	 */
	
	public BienImmobilier ajouterTerrain(String type, int id, String adresse, String orientation, int prixDemande, String dateVenteSouhaiter, int nInterne, int surfaceAuSole, int longueurDeLaFacade, Personne vendeur) {
		this.bien = new Terrain(id, adresse, orientation, prixDemande, dateVenteSouhaiter, nInterne, surfaceAuSole, longueurDeLaFacade, vendeur);
		this.tabBienImmobilier.add(bien);
		return bien;
	}
	
	/**
	 * 
	 * @param id Repr�sente l'identifiant de l'appartement.
	 * @param adresse Repr�sente l'adresse de l'appartement.
	 * @param orientation Repr�sente la localisation de l'appartement.
	 * @param prixDemande Repr�sente le prix demand� pour cet appartement
	 * @param dateVenteSouhaiter Repr�sente la date de vente souhait�e pour cet appartement.
	 * @param nInterne Repr�sente le num�ro interne � l'agence de l'appartement.
	 * @param nombreDePieces Repr�sente le nombre de pi�ces de l'appartement.
	 * @param etage Repr�sente l'�tage o� se situe l'appartement.
	 * @param chargesMensuelles Repr�sente les charges mensuelles de l'appartement.
	 * @param vendeur Repr�sente le vendeur de l'appartement.
	 * @return Retourne l'appartement ajout�.
	 */
	
	public BienImmobilier ajouterAppart(int id, String adresse, String orientation, int prixDemande, String dateVenteSouhaiter, int nInterne, int nombreDePieces, int etage, int chargesMensuelles, Personne vendeur) {
		this.bien = new Appart(id, adresse, orientation, prixDemande, dateVenteSouhaiter, nInterne, nombreDePieces, etage, chargesMensuelles, vendeur);
		this.tabBienImmobilier.add(bien);
		return bien;
	}
	
	/**
	 * 
	  * @param id Repr�sente l'identifiant de la maison.
	 * @param adresse Repr�sente l'adresse de la maison.
	 * @param orientation Repr�sente la localisation de la maison.
	 * @param prixDemande Repr�sente le prix demand� pour cette maison
	 * @param dateVenteSouhaiter Repr�sente la date de vente souhait�e pour cette maison.
	 * @param nInterne Repr�sente le num�ro interne � l'agence de la maison.
	 * @param surfaceHabitable Repr�sente la surface habitable de la maison.
	 * @param nombreDePieces Repr�sente le nombre de pi�ces de la maison.
	 * @param nombreEtages Repr�sente le nombre d'�tages de la maison.
	 * @param moyenDeChauffage Repr�sente le moyen de chauffage de la maison.
	 * @param vendeur Repr�sente le vendeur de la maison.
	 * @return Retourne la maison ajout�e.
	 */
	
	public BienImmobilier ajouterMaison(int id, String adresse, String orientation, int prixDemande, String dateVenteSouhaiter, int nInterne, int surfaceHabitable, int nombreDePieces, int nombreEtages, String moyenDeChauffage, Personne vendeur) {
		this.bien = new Maison(id, adresse, orientation, prixDemande, dateVenteSouhaiter, nInterne, surfaceHabitable, nombreDePieces, nombreEtages, moyenDeChauffage, vendeur);
		this.tabBienImmobilier.add(bien);
		return bien;
	}
	
	/**
	 * 
	 * @param voeux Repr�sente le voeux de l'acheteur.
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
					reponse = ("D�sol� nous n'avons pas de terrain correspondant � votre voeux.");
				}
				}
			else if (x.type == "APPART") {
				Appart i = (Appart) x;
				if ((voeux.localisationRecherche == i.orientation) && (voeux.prixSouhaite  == i.prixDemande) && (voeux.nombreDePieceRecherche == i.nombreDePieces)) {
					reponse = ("Cet appartement pourrait vous convenir: \n" +i);
				}
				else {
					reponse = ("D�sol� nous n'avons pas d'appartement correspondant � votre voeux.");
				}
				}
			else if (x.type == "MAISON") {
				Maison i = (Maison) x;
				if ((voeux.localisationRecherche == i.orientation) && (voeux.prixSouhaite  == i.prixDemande) && (voeux.nombreDePieceRecherche == i.nombreDePieces) && (voeux.surfaceSolrecherche == i.surfaceHabitable)) {
					reponse = ("Cette maison pourrait vous convenir: \n" +i);
				}
				else {
					reponse = ("D�sol� nous n'avons pas de maison correspondant � votre voeux.");
				}
			}
		}
		return reponse;
	}
	
	/**
	 * 
	 * @param bien2 Repr�sente un bien qui a �t� vendu.
	 */

	public void tabBienVendus(BienImmobilier bien2) {
		this.tabBienVendus.add(bien2);		
	}
}