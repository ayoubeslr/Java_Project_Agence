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
