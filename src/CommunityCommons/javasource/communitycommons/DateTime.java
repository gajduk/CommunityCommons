package communitycommons;

import java.util.Calendar;
import java.util.Date;

import communitycommons.proxies.DatePartSelector;

public class DateTime
{
	/**
	 * @author mwe
	 * Berekent aantal jaar sinds een bepaalde datum. Als einddatum == null, het huidige tijdstip wordt gebruikt
	 * Code is gebaseerd op http://stackoverflow.com/questions/1116123/how-do-i-calculate-someones-age-in-java 
	 */
	public static long yearsBetween(Date birthdate, Date comparedate) {
		return org.community_commons.main.DateTime.yearsBetween(birthdate, comparedate);	
	}

	public static long dateTimeToLong(Date date)
	{
		return org.community_commons.main.DateTime.dateTimeToLong(date);
	}

	public static Date longToDateTime(Long value)
	{
		return org.community_commons.main.DateTime.longToDateTime(value);
	}
	
	public static long dateTimeToInteger(Date date, DatePartSelector selectorObj)
	{
		switch (selectorObj) {
			case year : return org.community_commons.main.DateTime.dateTimeToInteger(date, Calendar.YEAR);
			case month : return org.community_commons.main.DateTime.dateTimeToInteger(date, Calendar.MONTH)+1;  // Return starts at 0
			case day : return org.community_commons.main.DateTime.dateTimeToInteger(date, Calendar.DAY_OF_MONTH);
			default : return -1L;
		}
	}
		
}
