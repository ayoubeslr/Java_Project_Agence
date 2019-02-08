package agence;

public class Commission {
	
	int commission;
	
	public Commission(int prixDemande2) {
		int prix = prixDemande2;
		this.commission = (7*prix)/100;
	}
	
	@Override

	public String toString() {

		return ""+this.commission+"";

	}

}
