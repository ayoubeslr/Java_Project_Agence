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


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commission other = (Commission) obj;
		if (commission != other.commission)
			return false;
		return true;
	}

}
