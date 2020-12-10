package fr.diginamic.tp_grasps;

import java.time.LocalDateTime;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;


public class ReservationFactoryImpl implements ReservationFactory {
	
	private CalculComptableServiceImpl calculComptableService = new CalculComptableServiceImpl();

	@Override
	public Reservation getInstance(Client client, TypeReservation type, String dateReservationStr, int nbPlaces) {
		
		LocalDateTime dateReservation = DateUtils.toDate(dateReservationStr);		
		
		Reservation reservation = new Reservation(dateReservation);
		reservation.setNbPlaces(nbPlaces);
		reservation.setClient(client);
		
		double total = calculComptableService.calculMontantReservation(type, client.isPremium(), nbPlaces);
		reservation.setTotal(total);
		
		return reservation;
	}

}
