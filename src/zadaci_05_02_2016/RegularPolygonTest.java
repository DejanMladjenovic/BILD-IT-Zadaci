package zadaci_05_02_2016;

/**
 * Naziv klase: RegularPolygonTest
 * 
 * @author Dejan Mladjenovic
 */

public class RegularPolygonTest {
	
	/*
	 * Write a test program that creates three RegularPolygon objects, 
	 * created using the no-arg constructor, using RegularPolygon(6, 4), 
	 * and using RegularPolygon(10, 4, 5.6, 7.8)
	 * For each object, display its perimeter and area.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj prvi objekat
		RegularPolygon polygon1 = new RegularPolygon();
		System.out.println("Polygon 1\n" + polygon1.toString());
		
		//Kreiraj drugi objekat
		RegularPolygon polygon2 = new RegularPolygon(6, 4);
		System.out.println("\nPolygon2\n" + polygon2.toString());
		
		//Kreiraj treci objekat
		RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("\nPolygon2\n" + polygon3.toString());
	}

}
