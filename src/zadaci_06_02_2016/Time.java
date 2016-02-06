package zadaci_06_02_2016;

/**
 * Naziv klase: Time
 * 
 * @author Dejan Mladjenovic
 */

public class Time {
	
	/*
	 * Design a class named Time. The class contains:
	 * The data fields hour, minute, and second that represent a time.
	 * A no-arg constructor that creates a Time object for the current time. 
	 * (The values of the data fields will represent the current time.)
	 * A constructor that constructs a Time object with a specified elapsed time
	 * since midnight, January 1, 1970, in milliseconds. (The values of the data
	 * fields will represent this time.)
	 * A constructor that constructs a Time object with the specified hour, minute,and second.
	 * Three getter methods for the data fields hour, minute, and second, respectively.
	 * A method named setTime(long elapseTime) that sets a new time
	 * for the object using the elapsed time. For example, if the elapsed time is
	 * 555550000 milliseconds, the hour is 10, the minute is 19, and the second is 10.
	 */

	//Osobine
	public int hour;
	public int minute;
	public int second;

	// Konstruktor bez argumenata
	public Time() {
		setTime(System.currentTimeMillis());
	}

	//Konstruktor sa specificnim satima , minutama i sekundama
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	//Konstruktor koji racuna proteklo vrijeme na osnovu milisekundi
	public Time(long elapseTime) {
		setTime(elapseTime);

	}

	// Geteri
	public int getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

	//Metoda vraca proteklo vrijeme
	public void setTime(long elapsedTime) {
		this.hour = (int)((elapsedTime / (1000 * 60 * 60)) % 24);
		this.minute = (int)((elapsedTime / (1000 * 60)) % 60);
		this.second = (int)(elapsedTime / 1000) % 60;

	}

}