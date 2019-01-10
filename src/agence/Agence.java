package agence;

import java.util.ArrayList;
import java.util.List;

public class Agence {
	
	private List<Annonce> tabAnnonce;
	private List<Rdv> tabRdv;
	private List<BienImmobilier> tabBienImmobilier;
	
	public Agence() {
		tabAnnonce = new ArrayList<Annonce>();
		tabRdv = new ArrayList<Rdv>();
		tabBienImmobilier = new ArrayList<BienImmobilier>();
	}

	
	public void checkVoeux() {}


}
