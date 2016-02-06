package zadaci_06_02_2016;

/**
 * Naziv klase: TimeTest
 * 
 * @author Dejan Mladjenovic
 */

public class TimeTest {
	
	/*
	 * Write a test program that creates two Time objects (using new Time() and newTime(555550000)) 
	 * and displays their hour, minute, and second in the format hour:minute:second.
	 */
	
	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj objekat za trenutno vrijeme
		Time time1=new Time();
		System.out.println("Trenutno vrijeme");
		System.out.println(time1.getHour() + 1 + ":"+time1.getMinute()+":"+time1.getSecond());

		//Kreiraj objekat koji racuna proteklo vrijeme
		Time t2=new Time(555550000);
		System.out.println("Proteklo vrijeme");
		System.out.println(t2.hour+":"+t2.minute+":"+t2.second);
	}

}
