package zadaci_17_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Nazv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak1 {
	
	/*
	 * Napisati metodu koja prima 2 argumenta: poèetni broj i krajnji broj 
	 * te printa sve proste brojeve u zadanom rangu.
	 * Metoda može primati i treæi argument, broj brojeva za isprintati po liniji.
	 */

	/** Glavna metoda */
	public static void main(String[] args) {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		// Izaberite pocetni broj
		System.out.println("Unesite pocetni broj:");
		int d = unosBrojeva(unos);

		// Izaberite krajnji broj
		System.out.println("Unesite krajnji broj:");
		int e = unosBrojeva(unos);

		// Izaberite broj clanova po jednoj liniji
		System.out.println("Koliko brojeva zelite po jednoj liniji:");
		int f = unosBrojeva(unos);

		prosti(d, e, f);// Poziva metodu

		unos.close();
	}

	/** Metoda obradjuje izuzetke */
	private static int unosBrojeva(Scanner unos) {

		while (true) {
			try {
				return unos.nextInt();
			} catch (Exception e) {
				System.err.println("Greska!Pokusajte ponovo.");
				unos.nextLine();
			}
		}
	}

	/** Metoda ispisuje proste brojeve u zadatom intervalu */
	public static void prosti(int min, int max, int broj) {

		int brojac = 0;

		// Ako je prvi clan veci od drugog zamijeni im mjesta
		if (min > max) {
			int temp = min;
			min = max;
			max = temp;
		}

		// Racuna i ispisuje proste brojeve u zadatom intervalu
		for (int i = min; i < max; i++) {
			boolean jeProst = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					jeProst = false;
					break;
				}
			}
			if (jeProst) {
				brojac++;
				if (brojac % broj == 0) {
					System.out.println(i + " ");
				} else {
					System.out.print(i + " ");
				}
			}
		}
	}

}
