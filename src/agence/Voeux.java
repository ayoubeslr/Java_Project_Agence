package agence;

public class Voeux {
	protected String typeBienrecherche;
	protected int prixSouhaite;
	protected String localisationRecherche;
	protected int surfaceSolrecherche;
	protected int nombreDePieceRecherche;
	
	public Voeux(String typeBienrecherche, int prixSouhaite, String localisationRecherche, int surfaceSolrecherche,
			int nombreDePieceRecherche) {
		this.typeBienrecherche = typeBienrecherche;
		this.prixSouhaite = prixSouhaite;
		this.localisationRecherche = localisationRecherche;
		this.surfaceSolrecherche = surfaceSolrecherche;
		this.nombreDePieceRecherche = nombreDePieceRecherche;
	}
	
	@Override

	public String toString() {

		return "Voil� la description de votre voeux: \nType de bien recherch�: "+this.typeBienrecherche+"\nPrix souhait�: "+this.prixSouhaite+" euros\nLocalisation recherch�e: "+this.localisationRecherche+"\nSurface au sol recherch�e: "+this.surfaceSolrecherche+" m�tres carr�s\nNombre de pi�ces recherch�es: "+this.nombreDePieceRecherche+" pi�ces";

	}
}
