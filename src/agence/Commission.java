package agence;

public class Commission {
	
	int commission;
	
	/**
	 * constructeur de la classe Commission
	 * @param prixDemande2
	 */
	public Commission(int prixDemande2) {
		int prix = prixDemande2;
		this.commission = (7*prix)/100;
	}
	
	/**
	 * redefinition du equals
	 */
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
	
	/**
	 * methode toString
	 */
	@Override
	public String toString() {
		return ""+this.commission+"";
	}
	
}
