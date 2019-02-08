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
