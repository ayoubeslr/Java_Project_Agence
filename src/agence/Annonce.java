package agence;

import java.util.ArrayList;
import java.util.List;

public class Annonce {


	public enum Media {WEB, PRESSE_SPE, JOURNAL_LOC};
	
	private Description description;
	
	

	public Annonce(BienImmobilier bien, Media media) {
		this.description = new Description(bien, media);
  }
}
