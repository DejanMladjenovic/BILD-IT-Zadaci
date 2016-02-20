package zadaci_20_02_2016;

/**
 * Naziv klase: zadatak1
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak1 {
	
	/*
	 * Write a test program for Rational class
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj objekte
		Rational r1 = new Rational(4, 10);
		Rational r2 = new Rational(5, 8);
		
		//Ispisi rezultat
		System.out.println("Prvi broj: " + r1.toString() + " ili " + r1.doubleValue());
		System.out.println("Drugi broj: " + r2.toString() + " ili " + r2.doubleValue());
		System.out.println("\nZbir brojeva: " + r1.add(r2));
		System.out.println("Razlika brojeva: " + r1.subtract(r2));
		System.out.println("Proizvod brojeva: " + r1.multiply(r2));
		System.out.println("Kolicnik brojeva: " + r1.divide(r2));
	}

}
