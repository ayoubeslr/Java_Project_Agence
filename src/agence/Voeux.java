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

		return "Voilà la description de votre voeux: \nType de bien recherché: "+this.typeBienrecherche+"\nPrix souhaité: "+this.prixSouhaite+" euros\nLocalisation recherchée: "+this.localisationRecherche+"\nSurface au sol recherchée: "+this.surfaceSolrecherche+" mètres carrés\nNombre de pièces recherchées: "+this.nombreDePieceRecherche+" pièces";

	}
}
