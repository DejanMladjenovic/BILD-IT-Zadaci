package zadaci_17_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak2 {
	
	/*
	 * Napisati metodu koja nalazi najmanji element u nizu decimalnih vrijednosti koristeæi se sljedeæim headerom:
	 * public static double min(double[ ] array)
	 * Napišite potom test program koji pita korisnika da unese deset brojeva 
	 * te poziva ovu metodu da vrati najmanji element u nizu.
	 */

	/** Glavna metoda */
	public static void main(String[] args) {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		// Izbaci pitanje korisniku da unese 10 brojeva
		System.out.println("Unesite 10 brojeva:");
		double[] niz = new double[10];
		boolean pravilanUnos = true;
		for (int i = 0; i < 10; i++) {
			pravilanUnos = true;
			while (pravilanUnos) {
				System.out.println("Unesite " + (i + 1) + ". broj:");
				try {
					niz[i] = unos.nextDouble();
					pravilanUnos = false;
				} catch (InputMismatchException e) {
					System.err.println("Pogresan unos!");
					unos.nextLine();
				}
			}
		}
		
		// Ispisi rezultat
		System.out.println("Clanovi niza: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println("\nNajmanji clan: " + min(niz));
		unos.close();
	}

	/** Vraca najmanji clan datog niza */
	public static double min(double[] array) {
		double min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

}
