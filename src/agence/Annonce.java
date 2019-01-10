package agence;

public class Annonce {
	
	public enum Media {TEXTE, HTML, IMAGE, VIDEO};
	
	Media monMedia;
	
	public Annonce(Media m) {
		setMonMedia(m);
	}
	
	public void setMonMedia(Media monMedia) {
		this.monMedia = monMedia;
	}
}
