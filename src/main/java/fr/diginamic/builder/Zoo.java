package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private String nom;
	private List<Zone> zones = new ArrayList<>();


	/**
	 * @param nom
	 */
	public Zoo(String nom) {
		super();
		this.nom = nom;
	}



	/**
	 * @return the zones
	 */
	public List<Zone> getZones() {
		return zones;
	}

	/**
	 * @param zones the zones to set
	 */
	public void setZones(List<Zone> zones) {
		this.zones = zones;
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
