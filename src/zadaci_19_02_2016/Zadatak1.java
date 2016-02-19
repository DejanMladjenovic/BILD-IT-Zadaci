package zadaci_19_02_2016;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak1 {
	
	/*
	 * Write a test program for Circle class
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj objekte
		Circle circle1 = new Circle(7);
		Circle circle2 = new Circle(6);
		
		//Ispisi rezultat
		System.out.println("Krugovi jednaki: " + circle1.equals(circle2));
	}

}
