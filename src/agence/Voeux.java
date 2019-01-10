package agence;

public class Voeux {
	private String typeBienrecherche;
	private int prixSouhaite;
	private String localisationRecherche;
	private int surfaceSolrecherche;
	private int nombreDePieceRecherche;
	
	public Voeux(String typeBienrecherche, int prixSouhaite, String localisationRecherche, int surfaceSolrecherche,
			int nombreDePieceRecherche) {
		this.typeBienrecherche = typeBienrecherche;
		this.prixSouhaite = prixSouhaite;
		this.localisationRecherche = localisationRecherche;
		this.surfaceSolrecherche = surfaceSolrecherche;
		this.nombreDePieceRecherche = nombreDePieceRecherche;
	}
	
	
}
