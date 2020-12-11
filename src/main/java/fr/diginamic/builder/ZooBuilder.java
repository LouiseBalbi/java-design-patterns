package fr.diginamic.builder;

import java.util.Optional;

public class ZooBuilder {

	private Zoo zoo;

	public ZooBuilder(String nom) {
		zoo = new Zoo(nom);
	}

	
	public ZooBuilder appendZone(String nom, int capacite) {
		Zone zone = new Zone(nom, capacite);
		this.zoo.getZones().add(zone);
		return this;
	}

	public ZooBuilder appendAnimal(String nomZone, Animal animal) throws ZoneException {

		Optional<Zone> opt = zoo.getZones().stream().filter(z -> z.getNom().equals(nomZone)).findFirst();
		if (opt.isPresent()) {
			Zone z = opt.get();
			if (z.getCapacite() > z.getAnimaux().size()) {
				z.getAnimaux().add(animal);
			}else {
				throw new ZoneException("Complet");
			}
		} else {
			throw new ZoneException("Zone introuvable");
		}
		return this;
	}
	
	
	public Zoo get() {
		return zoo;
	}

}
