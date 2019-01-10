package agence;

public class Annonce {
	private Description description;
	public enum Media {TEXTE, HTML, IMAGE, VIDEO};
	
	Media monMedia;
	
	public Annonce(Media m, Description description) {
		setMonMedia(m);
		this.description = description;
	}
	
	public void setMonMedia(Media monMedia) {
		this.monMedia = monMedia;
	}
}
