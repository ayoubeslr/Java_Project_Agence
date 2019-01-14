package agence;

public class Annonce {


	public enum Media {WEB, PRESSE_SPE, JOURNAL_LOC};
	
	private Description description;
	Media media;
	
	

	public Annonce(BienImmobilier bien, String mediaChoisi) {
		if (mediaChoisi == "web") {
			this.media = Media.WEB;
		}
		else if (mediaChoisi == "presse spécialisée") {
			this.media = Media.PRESSE_SPE;
		}
		else {
			this.media = Media.JOURNAL_LOC;
		}
		this.description = new Description(bien, media);
  }
	
	@Override

	public String toString() {

		return "[Description du bien: "+this.description+"]";

	}
}
