package zadaci_05_02_2016;

/**
 * Naziv klase: FanTest
 * 
 * @author Dejan Mladjenovic
 */

public class FanTest {
	
	/*
	 * Write a test program that creates two Fan objects. 
	 * Assign maximum speed, radius 10, color yellow, and turn it on to the first object.
	 * Assign medium speed, radius 5, color blue, and turn it off to the second object. 
	 * Display the objects by invoking their toString method.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj Fan objekat
		Fan fan1 = new Fan();
		fan1.setSpeed(3);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		
		//Kreiraj Fan objekat
		Fan fan2 = new Fan();
		fan2.setSpeed(2);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);
		
		//Ispisi podatke za prvi objekat
		System.out.println("fan1\n" + fan1.toString());
		
		//Ispisi podatke za drugi objekat
		System.out.println("\nfan2\n" + fan2.toString());
	}

}
