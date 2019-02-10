package agence;

public class Voeux {
	public String typeBienrecherche;
	public int prixSouhaite;
	public String localisationRecherche;
	public int surfaceSolrecherche;
	public int nombreDePieceRecherche;
	
	public Voeux(String typeBienrecherche, int prixSouhaite, String localisationRecherche, int surfaceSolrecherche,
			int nombreDePieceRecherche) {
		this.typeBienrecherche = typeBienrecherche;
		this.prixSouhaite = prixSouhaite;
		this.localisationRecherche = localisationRecherche;
		this.surfaceSolrecherche = surfaceSolrecherche;
		this.nombreDePieceRecherche = nombreDePieceRecherche;
	}
	
	public Voeux(String typeBienrecherche, int prixSouhaite, String localisationRecherche, int surfaceSolrecherche) {
		this.typeBienrecherche = typeBienrecherche;
		this.prixSouhaite = prixSouhaite;
		this.localisationRecherche = localisationRecherche;
		this.surfaceSolrecherche = surfaceSolrecherche;
	}
	
	public String getterTypeBienRecherhe() { return this.typeBienrecherche; }
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
			return "Voil� la description de votre voeux: \nType de bien recherch�: "+this.typeBienrecherche+"\nPrix souhait�: "+this.prixSouhaite+" euros\nLocalisation recherch�e: "+this.localisationRecherche+"\nSurface au sol recherch�e: "+this.surfaceSolrecherche+" m�tres carr�s\nNombre de pi�ces recherch�es: "+this.nombreDePieceRecherche+" pi�ces";
		}
		else if (this.typeBienrecherche.equals("TERRAIN")) {
			return "Voil� la description de votre voeux: \nType de bien recherch�: "+this.typeBienrecherche+"\nPrix souhait�: "+this.prixSouhaite+" euros\nLocalisation recherch�e: "+this.localisationRecherche+"\nSurface au sol recherch�e: "+this.surfaceSolrecherche+" m�tres carr�s";
		}
		else {
			return "Voil� la description de votre voeux: \nType de bien recherch�: "+this.typeBienrecherche+"\nPrix souhait�: "+this.prixSouhaite+" euros\nLocalisation recherch�e: "+this.localisationRecherche+"\nNombre de pi�ces recherch�es: "+this.nombreDePieceRecherche+" pi�ces";
		}
	}
	
}
