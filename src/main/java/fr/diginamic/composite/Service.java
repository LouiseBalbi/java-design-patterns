package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement {
	
	private String nom;

	private List<IElement> list = new ArrayList<>();
	

	/**
	 * @param nom
	 * @param list
	 */
	public Service(String nom) {
		super();
		this.nom = nom;
	}


	@Override
	public double calculerSalaire() {
		double total = 0;
		for(IElement elt: list) {
			total += elt.calculerSalaire();
		}
		return total;
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
	 * @return the list
	 */
	public List<IElement> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<IElement> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Service [list=" + list + "]";
	}
	
	

	
}
