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
