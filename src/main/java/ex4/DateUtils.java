package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe qui permet de gréer le format des Dates
 */
public class DateUtils {

	private static SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	/**
	 * Méthode qui retourne la date au format souhaité
	 * @param pattern
	 * @param date
	 * @return String
	 */
	public static String format(String pattern, Date date) {
		if(!pattern.equals("dd/MM/yyyy HH:mm:ss"))
		{
			formateur = new SimpleDateFormat(pattern);
		}
		return formateur.format(date);
	}

}
