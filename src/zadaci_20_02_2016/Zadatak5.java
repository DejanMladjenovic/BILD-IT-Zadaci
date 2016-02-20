package zadaci_20_02_2016;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak5 {
	
	/*
	 * Write a program that prompts the user to enter a decimal number 
	 * and displays the number in a fraction. Hint: read the decimal number as a string, 
	 * extract the integer part and fractional part from the string, 
	 * and use the BigInteger implementation of the Rational class in Programming 
	 * Exercise 13.15 to obtain a rational number for the decimal number
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Pitaj korisnika da unes decimalni broj
		System.out.println("Unesite decimalni broj:");
		double broj;
		while(true){
			try{
				broj = unos.nextDouble();
				break;
			}catch(InputMismatchException e){
				System.out.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		//Pretvori broj u string
		String dec = String.valueOf(broj);
		//Rasclani string
		String[] brojevi = dec.split("[.]");
		//Broj cifara iza zareza
		int cifre = brojevi[1].length();
		
		//Kreiraj objekte
		BigRational br1 = new BigRational(new BigInteger(brojevi[0]), BigInteger.ONE);
		BigRational br2 = new BigRational(new BigInteger(brojevi[1]), BigInteger.TEN.pow(cifre));
		
		//Ispisi rezultat
		BigRational br3 = br1.add(br2);
		System.out.println(br3.toString());
		
		
	}

}
