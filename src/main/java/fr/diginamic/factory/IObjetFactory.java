package fr.diginamic.factory;

public interface IObjetFactory {

	ObjetConnecte getObjet(TypeObjet type, int limiteVolts);

}