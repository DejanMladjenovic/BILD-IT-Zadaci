package zadaci_20_02_2016;

import java.math.BigInteger;

/**
 * Naziv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak2 {
	
	/*
	 * Vrite a test program for BigRational class
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj objekte
		BigRational br1 = new BigRational(new BigInteger("2"), new BigInteger("5"));
		BigRational br2 = new BigRational(new BigInteger("3"), new BigInteger("5"));
		
		//Ispisi rezultat
		System.out.println("Prvi broj: " + br1.toString() + " ili " + br1.doubleValue());
		System.out.println("Drugi broj: " + br2.toString() + " ili " + br2.doubleValue());
		System.out.println("\nZbir brojeva: " + br1.add(br2));
		System.out.println("Razlika brojeva: " + br1.subtract(br2));
		System.out.println("Proizvod brojeva: " + br1.multiply(br2));
		System.out.println("Kolicnik brojeva: " + br1.divide(br2));	
		}
}
