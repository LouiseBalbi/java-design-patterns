package fr.diginamic.factory;

public abstract class ObjetConnecte {
	
	protected int limiteVolts;
	
	
	/**
	 * @param limiteVolts
	 */
	public ObjetConnecte(int limiteVolts) {
		super();
		this.limiteVolts = limiteVolts;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + limiteVolts;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjetConnecte other = (ObjetConnecte) obj;
		if (limiteVolts != other.limiteVolts)
			return false;
		return true;
	}

	

}
