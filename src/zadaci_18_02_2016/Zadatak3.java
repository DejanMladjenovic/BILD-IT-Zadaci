package zadaci_18_02_2016;


/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak3 {

	/*
	 * Draw the UML diagram and implement the compareTo method to compare the circles on the basis of area.
	 * Write a test class to find the larger of two instances of ComparableCircle objects.
	 */
	
	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj objekte
		ComparableCircle circle1 = new ComparableCircle(5);
		ComparableCircle circle2 = new ComparableCircle(7);
		
		//Uporedi objekte
		int compare = circle1.compareTo(circle2);
		
		//Ispisi rezultat
		System.out.println(circle1);
		System.out.println(circle2);
		if(compare > 0)
			System.out.println("Veci je prvi objekat.");
		else if(compare < 0)
			System.out.println("Veci je drugi objekat.");
		else
			System.out.println("Objekti su jednaki.");
	}
}