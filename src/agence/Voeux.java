package agence;

public class Voeux {
	public String typeBienrecherche;
	public int prixSouhaite;
	public String localisationRecherche;
	public int surfaceSolrecherche;
	public int nombreDePieceRecherche;
	
	/**
	 * constructeur de la classe Voeux
	 * @param typeBienrecherche
	 * @param prixSouhaite
	 * @param localisationRecherche
	 * @param surfaceSolrecherche
	 * @param nombreDePieceRecherche
	 */
	public Voeux(String typeBienrecherche, int prixSouhaite, String localisationRecherche, int surfaceSolrecherche,
			int nombreDePieceRecherche) {
		this.typeBienrecherche = typeBienrecherche;
		this.prixSouhaite = prixSouhaite;
		this.localisationRecherche = localisationRecherche;
		this.surfaceSolrecherche = surfaceSolrecherche;
		this.nombreDePieceRecherche = nombreDePieceRecherche;
	}
	
	/**
	 * constructeur de la classe Voeux
	 * @param typeBienrecherche
	 * @param prixSouhaite
	 * @param localisationRecherche
	 * @param surfaceSolrecherche
	 */
	public Voeux(String typeBienrecherche, int prixSouhaite, String localisationRecherche, int surfaceSolrecherche) {
		this.typeBienrecherche = typeBienrecherche;
		this.prixSouhaite = prixSouhaite;
		this.localisationRecherche = localisationRecherche;
		this.surfaceSolrecherche = surfaceSolrecherche;
	}
	
	/**
	 * mthode getterTypeBBienRechercher
	 * @return le type de bien qui est recherche
	 */
	public String getterTypeBienRecherhe() { return this.typeBienrecherche; }
	
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
		Voeux other = (Voeux) obj;
		if (localisationRecherche == null) {
			if (other.localisationRecherche != null)
				return false;
		} else if (!localisationRecherche.equals(other.localisationRecherche))
			return false;
		if (nombreDePieceRecherche != other.nombreDePieceRecherche)
			return false;
		if (prixSouhaite != other.prixSouhaite)
			return false;
		if (surfaceSolrecherche != other.surfaceSolrecherche)
			return false;
		if (typeBienrecherche == null) {
			if (other.typeBienrecherche != null)
				return false;
		} else if (!typeBienrecherche.equals(other.typeBienrecherche))
			return false;
		return true;
	}

	@Override

	public String toString() {
		if (this.typeBienrecherche.equals("MAISON")) {
			return "Voilà la description de votre voeux: \nType de bien recherché: "+this.typeBienrecherche+"\nPrix souhaité: "+this.prixSouhaite+" euros\nLocalisation recherchée: "+this.localisationRecherche+"\nSurface au sol recherchée: "+this.surfaceSolrecherche+" mètres carrés\nNombre de pièces recherchées: "+this.nombreDePieceRecherche+" pièces";
		}
		else if (this.typeBienrecherche.equals("TERRAIN")) {
			return "Voilà la description de votre voeux: \nType de bien recherché: "+this.typeBienrecherche+"\nPrix souhaité: "+this.prixSouhaite+" euros\nLocalisation recherchée: "+this.localisationRecherche+"\nSurface au sol recherchée: "+this.surfaceSolrecherche+" mètres carrés";
		}
		else {
			return "Voilà la description de votre voeux: \nType de bien recherché: "+this.typeBienrecherche+"\nPrix souhaité: "+this.prixSouhaite+" euros\nLocalisation recherchée: "+this.localisationRecherche+"\nNombre de pièces recherchées: "+this.nombreDePieceRecherche+" pièces";
		}
	}
	
}
