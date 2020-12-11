package fr.diginamic.composite;

public class Employe implements IElement {
	
	private double salaire;
	private String nom;
	private String prenom;


	/**
	 * @param salaire
	 * @param nom
	 * @param prenom
	 */
	public Employe(String nom, String prenom, double salaire) {
		super();
		this.salaire = salaire;
		this.nom = nom;
		this.prenom = prenom;
	}

	@Override
	public double calculerSalaire() {
		return salaire;
	}

	/**
	 * @return the salaire
	 */
	public double getSalaire() {
		return salaire;
	}

	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
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

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	

	@Override
	public String toString() {
		return "Employe [salaire=" + salaire + ", nom=" + nom + ", prenom=" + prenom + ", service=" + "]";
	}


}
