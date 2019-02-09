package agence;

import java.util.ArrayList;
import java.util.List;

import agence.Annonce.Media;

public class Description {
	private List<Docs> tabDocs;
	private Media media;
	private Texte texte;
	private Image image;
	private Html html;
	private Video video;
	BienImmobilier bien;
	 
	 public Description(BienImmobilier bien, Media media) {
		tabDocs = new ArrayList<Docs>(); 
		this.bien = bien;
		this.media = media;
	 }
	
	public Media getterMedia(){ return this.media; }
	public List<Docs> getterTabDocs() {return this.tabDocs;}
	
	@Override
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Description other = (Description) obj;
		if (bien == null) {
			if (other.bien != null)
				return false;
		} else if (!bien.equals(other.bien))
			return false;
		if (html == null) {
			if (other.html != null)
				return false;
		} else if (!html.equals(other.html))
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (media != other.media)
			return false;
		if (tabDocs == null) {
			if (other.tabDocs != null)
				return false;
		} else if (!tabDocs.equals(other.tabDocs))
			return false;
		if (texte == null) {
			if (other.texte != null)
				return false;
		} else if (!texte.equals(other.texte))
			return false;
		if (video == null) {
			if (other.video != null)
				return false;
		} else if (!video.equals(other.video))
			return false;
		return true;
	}


	/**
	 * Ajoute des documents pour l'annonce.
	 */
	 
	 public void ajouterDocuments() {
			if (this.media == Media.WEB) {
				this.tabDocs.add(texte);
				this.tabDocs.add(image);
				this.tabDocs.add(html);
				this.tabDocs.add(video);
			}
			else{
				this.tabDocs.add(texte);
				this.tabDocs.add(image);
			}
		}
	 
	 @Override
	 public String toString() {
			return ""+this.bien+"";
		}
}
