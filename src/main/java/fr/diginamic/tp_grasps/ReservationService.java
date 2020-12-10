package fr.diginamic.tp_grasps;


import fr.diginamic.tp_grasps.beans.Reservation;


public interface ReservationService {
	
	Reservation creerReservation(String identifiantClient, String dateReservation, String typeReservation, int nbPlaces);

}
