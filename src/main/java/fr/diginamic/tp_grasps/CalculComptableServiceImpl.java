package fr.diginamic.tp_grasps;

import fr.diginamic.tp_grasps.beans.TypeReservation;

public class CalculComptableServiceImpl implements CalculComptableService {

	@Override
	public double calculMontantReservation(TypeReservation type, boolean premium, int nbPlaces) {
		double total = type.getMontant() * nbPlaces;
		if (premium) {
			return total*(1-type.getReductionPourcent()/100.0);
		}
		else {
			return total;
		}
	
	}

}
