package fr.diginamic.factory;


public class ObjetFactory implements IObjetFactory {

	@Override
	public ObjetConnecte getObjet(TypeObjet type, int limiteVolts) {
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
