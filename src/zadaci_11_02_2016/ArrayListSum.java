package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayListSum {
	
	/*
	 * Write the following method that returns the sum of all numbers in an ArrayList:
	 * -public static double sum(ArrayList<Double> list)
	 * Write a test program that prompts the user to enter 5 numbers, stores them in an
	 * array list, and displays their sum.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		// Kreiraj listu
		ArrayList<Double> brojevi = new ArrayList<>();

		// Pitaj korisnika da unese 5 brojeva
		System.out.println("Unesite 5 brojeva:");
		for (int i = 0; i < 5; i++) {
			while (true) {
				try {
					brojevi.add(unos.nextDouble());
					break;
				} catch (InputMismatchException e) {
					System.out.println("Pogresan unos! Pokusajte ponovo!");
					unos.nextLine();
				}
			}
		}
		
		// Ispisi rezultat 
		System.out.println("Lista:");
		System.out.println(brojevi);
		System.out.println("Suma svih clanova liste: " + sum(brojevi));


	}

	/**Vraca sumu clanova liste*/
	public static double sum(ArrayList<Double> list) {

		double suma = 0;
	
		for(double i: list)
			suma += i;
		return suma;
	}
}
