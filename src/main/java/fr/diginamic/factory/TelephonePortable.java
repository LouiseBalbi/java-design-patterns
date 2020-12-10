package fr.diginamic.factory;

public class TelephonePortable extends ObjetConnecte {
	
	TypeObjet type = TypeObjet.TELEPHONE;

	public TelephonePortable(int limiteVolts) {
		super(limiteVolts);
	}

}
