package fr.diginamic.tp_grasps;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.IClientDao;
import fr.diginamic.tp_grasps.daos.ITypeReservationDao;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;

public class ReserevationServiceImpl implements ReservationService {

	/** DAO permettant d'accéder à la table des clients */
	private IClientDao clientDao = new ClientDao();

	/** DAO permettant d'accéder à la table des types de réservation */
	private ITypeReservationDao typeReservationDao = new TypeReservationDao();

	private ReservationFactory reservationFactory = new ReservationFactoryImpl();
	


	@Override
	public Reservation creerReservation(String identifiantClient, String dateReservation, String typeReservation, int nbPlaces) {

		// 3) Extraction de la base de données des informations client
		Client client = clientDao.extraireClient(identifiantClient);

		// 4) Extraction de la base de données des infos concernant le type de la
		// réservation
		TypeReservation type = typeReservationDao.extraireTypeReservation(typeReservation);

		// 5) Création de la réservation
		Reservation reservation = reservationFactory.getInstance(client, type, dateReservation, nbPlaces);

		// 6) Ajout de la réservation au client
		client.addReservation(reservation);

		return reservation;

	}

}

