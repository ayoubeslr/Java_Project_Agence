package agence;

import java.util.ArrayList;
import java.util.List;

public class BienImmobilier {
	int id;
	String adresse;
	String orientation;
	String prixDemande;
	String dateVenteSouhaiter;
	int nInterne;
	Commission commission;
	PromesseVente promesse;
	List<Annonce> tabAnnonce;
	List<Rdv> tabRdv;
	List<BienImmobilier> tabBienImmobilier;
	Mandat mandat;
	
	public BienImmobilier(int id, String adresse, String orientation, String prixDemande, String dateVenteSouhaiter, int nInterne) {
		this.id = id;
		this.adresse = adresse;
		this.orientation = orientation;
		this.prixDemande = prixDemande;
		this.dateVenteSouhaiter = dateVenteSouhaiter;
		this.nInterne = nInterne;
		tabAnnonce = new ArrayList<Annonce>();
		tabRdv = new ArrayList<Rdv>();
		tabBienImmobilier = new ArrayList<BienImmobilier>();
	}
	
	public void Inscrire() {
		
	}
	
	public Commission creerCommission() {
		return this.commission = new Commission();
	}
	
	public PromesseVente creerPromesseVente(String prixVerseVendeur, String adresseNotaire, String dateVente, String fraisVente) {
		return this.promesse = new PromesseVente(prixVerseVendeur, adresseNotaire, dateVente, fraisVente);
	}
	
	public Mandat creerMandat(String dureeMandat) {
		return this.mandat = new Mandat(dureeMandat);
	}
}
