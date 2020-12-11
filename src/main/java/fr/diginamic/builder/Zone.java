package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

public class Zone {
	
	private String nom;
	private int capacite;
	private List<Animal> animaux = new ArrayList<>();
	
	/**
	 * @param nom
	 * @param capacite
	 */
	public Zone(String nom, int capacite) {
		super();
		this.nom = nom;
		this.capacite = capacite;
	}
	/**
	 * @return the animaux
	 */
	public List<Animal> getAnimaux() {
		return animaux;
	}
	/**
	 * @param animaux the animaux to set
	 */
	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
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
	 * @return the capacite
	 */
	public int getCapacite() {
		return capacite;
	}
	/**
	 * @param capacite the capacite to set
	 */
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacite;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
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
		Zone other = (Zone) obj;
		if (capacite != other.capacite)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
	
	
	
	

}
