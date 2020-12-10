package fr.diginamic.factory;

import java.io.IOException;

public class ObjetFactory {

	public static ObjetConnecte getObjet(TypeObjet type, int limiteVolts) {
		if (type == TypeObjet.TELEPHONE) {
			return new TelephonePortable(limiteVolts);
		} else if (type == TypeObjet.TABLETTE) {
			return new Tablette(limiteVolts);
		} else if (type == TypeObjet.ENCEINTE) {
			return new EnceinteConnectee(limiteVolts);
		} else {
			return null;
		}
	}

}
