package fr.diginamic.builder;

public abstract class Animal {
	
	private String nom;

	/**
	 * @param nom
	 */
	public Animal(String nom) {
		super();
		this.nom = nom;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
