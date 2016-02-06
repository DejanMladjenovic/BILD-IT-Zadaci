package zadaci_06_02_2016;

/**
 * Naziv klase: MyPointTest
 * 
 * @author Dejan Mladjenovic
 */

public class MyPointTest {
	
	/*
	 * Write a test program that creates the two points (0, 0) and (10, 30.5) 
	 * and displays the distance between them.
	 */
	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj objekat bez argumenata
		MyPoint point1 = new MyPoint();
		
		//Kreiraj objekat sa argumentima
		MyPoint point2 = new MyPoint(10, 30.5);
		
		//Prikazi rezultat
		System.out.printf("The distance between two points is %.3f", point1.distance(point2));
	}

}
