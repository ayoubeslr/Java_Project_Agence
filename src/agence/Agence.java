package agence;

import java.util.ArrayList;
import java.util.List;

import agence.Annonce.Media;

public class Agence {
	
	private List<Annonce> tabAnnonce;
	private List<Rdv> tabRdv;
	private List<BienImmobilier> tabBienImmobilier;
	private Annonce annonce;
	private Rdv rdvPromesse;
	private BienImmobilier bien;
	
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
	
	public BienImmobilier ajouterBien(int id, String adresse, String orientation, String prixDemande, String dateVenteSouhaiter, int nInterne, Personne vendeur) {
		this.bien = new BienImmobilier(id, adresse, orientation, prixDemande, dateVenteSouhaiter, nInterne, vendeur);
		this.tabBienImmobilier.add(bien);
		return bien;
	}
	
	public String checkVoeux(Voeux voeux) {
		for(BienImmobilier i : this.tabBienImmobilier) {
			if (voeux.typeBienrecherche == "TERRAIN") {
				if ((voeux.localisationRecherche == i.orientation) && (voeux.nombreDePieceRecherche == i.) && (voeux.prixSouhaite  ==) && (voeux.surfaceSolrecherche ==) && (voeux.typeBienrecherche ==))
				return ("Ce terrain pourrait vous convenir: ");
			}
		}
	}
}
