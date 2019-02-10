package agence;

public class Annonce {


	public enum Media {WEB, PRESSE_SPE, JOURNAL_LOC};
	
	private Description description;
	Media media;
	
	
	/**
	 * constructeur de la classe Annonce
	 * @param bien
	 * @param mediaChoisi
	 */
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
	
	/**
	 * redefinition de la methode equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Annonce other = (Annonce) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (media != other.media)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Annonce dans "+this.media+ "... description du bien: "+this.description+"";

	}
}
