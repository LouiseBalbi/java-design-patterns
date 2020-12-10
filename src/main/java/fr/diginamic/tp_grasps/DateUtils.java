package fr.diginamic.tp_grasps;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
	
	/** formatter */
	public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	/** Transforme une date au format String en {@link LocalDateTime}
	 * @param dateStr date au format String
	 * @return LocalDateTime
	 */
	public static LocalDateTime toDate(String dateStr) {
		
		return LocalDateTime.parse(dateStr, DateUtils.formatter);
	}
}
