package agence;

import java.util.ArrayList;
import java.util.List;

import agence.Annonce.Media;

public class Agence {
	
	private List<Annonce> tabAnnonce;
	private List<Rdv> tabRdv;
	private List<BienImmobilier> tabBienImmobilier;
	
	public Agence() {
		tabAnnonce = new ArrayList<Annonce>();
		tabRdv = new ArrayList<Rdv>();
		tabBienImmobilier = new ArrayList<BienImmobilier>();

	}
	
	public void creerAnnonce(BienImmobilier bien, Media media) {
		this.tabAnnonce = (List<Annonce>) new Annonce(bien, media);
	}

	public void checkVoeux() {}
}
