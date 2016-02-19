package zadaci_19_02_2016;

/**
 * Naziv klase: Zadatak2
 *  
 * @author Dejan Mladjenovic
 */

public class Zadatak2 {
	
	/*
	 * Write a test program for Rectangle class
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj objekte
		Rectangle rectangle1 = new Rectangle(3, 7);
		Rectangle rectangle2 = new Rectangle(6, 4);
		
		//Ispisi rezultat
		System.out.println("Pravougaonici su jednaki: " + rectangle1.equals(rectangle2));	
	}
}
