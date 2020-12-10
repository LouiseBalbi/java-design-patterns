package fr.diginamic.tp_grasps;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;

public interface ReservationFactory {
	
	Reservation getInstance(Client client, TypeReservation type, String dateReservationStr, int nbPlaces);

}
