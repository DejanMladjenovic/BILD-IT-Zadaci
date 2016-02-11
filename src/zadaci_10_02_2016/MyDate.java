package zadaci_10_02_2016;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Naziv klase: MyDate
 * 
 * @author Dejan Mladjenovic
 */

public class MyDate {
	
	/*
	 * Design a class named MyDate. The class contains:
	 * The data fields year, month, and day that represent a date. month is 0-based, i.e., 0 is for January.
	 * A no-arg constructor that creates a MyDate object for the current date.
	 * A constructor that constructs a MyDate object with a specified elapsed time 
	 * since midnight, January 1, 1970, in milliseconds.
	 * A constructor that constructs a MyDate object with the specified year, month, and day.
	 * Three getter methods for the data fields year, month, and day, respectively.
	 * A method named setDate(long elapsedTime) that sets a new date for the object using the elapsed time.
	 */

	// Osobine
	private int year;
	private int month;
	private int day;

	// Konstruktor bez argumenata
	public MyDate() {
		GregorianCalendar calendar = new GregorianCalendar();
		this.year = calendar.get(Calendar.YEAR);
		this.month = calendar.get(Calendar.MONTH);
		this.day = calendar.get(Calendar.DAY_OF_MONTH);
	}

	// Konstruktor koji racuna proteklo vrijeme u lilisekundama
	public MyDate(long elapsedTime) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime);
		this.year = calendar.get(Calendar.YEAR);
		this.month = calendar.get(Calendar.MONTH);
		this.day = calendar.get(Calendar.DAY_OF_MONTH);
	}

	// Konstruktor sa odredjenom godinom, mjesecom i danom
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	/**Vraca godinu*/
	public int getYear() {
		return year;
	}

	/**Vraca mjesec*/
	public int getMonth() {
		return month;
	}

	/**Vraca dan*/
	public int getDay() {
		return day;
	}

	/** Postavlja novi datum */
	public void setDate(long elapsedTime) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime);
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH);
		day = calendar.get(Calendar.DAY_OF_MONTH);
	}

	/** Vraca ispisan datum */
	public String toString() {
		return year + "." + month + "." + day + ".";
	}

}
