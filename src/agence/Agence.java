package agence;

import java.util.ArrayList;
import java.util.List;

import agence.Annonce.Media;

public class Agence {
	
	private List<Annonce> tabAnnonce;
	private List<Rdv> tabRdv;
	private List<BienImmobilier> tabBienImmobilier;
	private Annonce annonce;
	
	public Agence() {
		tabAnnonce = new ArrayList<Annonce>();
		tabRdv = new ArrayList<Rdv>();
		tabBienImmobilier = new ArrayList<BienImmobilier>();

	}
	
	/**
	 * 
	 * @param bien bien immobilier à ajouter à l'annonce
	 * @param media forme de l'annonce
	 */
	
	public Annonce creerAnnonce(BienImmobilier bien, String mediaChoisi) {
		this.annonce = new Annonce(bien, mediaChoisi);
		return annonce;
	}

	public void checkVoeux() {}
}
