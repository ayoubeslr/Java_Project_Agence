package agence;

public class Commission {
	
	int commission;
	
	public Commission(String prixVerseVendeur) {
		int prix = Integer.parseInt(prixVerseVendeur);
		this.commission = (7*prix)/100;
	}
	
	@Override

	public String toString() {

		return ""+this.commission+"";

	}

}
