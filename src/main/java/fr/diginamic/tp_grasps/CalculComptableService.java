package fr.diginamic.tp_grasps;

import fr.diginamic.tp_grasps.beans.TypeReservation;

public interface CalculComptableService {
	
	public double calculMontantReservation(TypeReservation type, boolean premium, int nbPlaces);

}
