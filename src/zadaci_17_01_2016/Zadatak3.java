package zadaci_17_01_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak3 {
	
	/*
	 * Napisati metodu koja vraæa true ukoliko su nizovi niz1 i niz2 striktno identièni. 
	 * Koristiti sljedeæi header: public static boolean equals(int[ ] niz1, int[ ] niz2)
	 * Napisati testni program koji pita korisnika da unese dva niza cijelih brojeva 
	 * te provjerava da li su striktno identièni.
	 */

	/** Glavna metoda */
	public static void main(String[] args) {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		// Odredi velicinu nizova
		System.out.println("Izaberite velicinu nizova:");
		int broj = unosBrojeva(unos);

		// Deklarisi prvi niz
		int[] niz1 = new int[broj];
		System.out.println("Unesite clanove prvog niza(" + broj + " clanova):");
		for (int i = 0; i < niz1.length; i++) {
			niz1[i] = unosBrojeva(unos);
		}

		// Deklarisi drugi niz
		int[] niz2 = new int[broj];
		System.out
				.println("Unesite clanove drugog niza(" + broj + " clanova):");
		for (int i = 0; i < niz2.length; i++) {
			niz2[i] = unosBrojeva(unos);
		}
		// Ispisi prvi niz
		System.out.println("Prvi niz: ");
		for (int i = 0; i < niz1.length; i++) {
			System.out.print(niz1[i] + " ");
		}

		// Ispisi drugi niz
		System.out.println("\nDrugi niz: ");
		for (int i = 0; i < niz2.length; i++) {
			System.out.print(niz2[i] + " ");
		}

		// Ispisi rezultat
		if (equals(niz1, niz2)) {
			System.out.println("\n\nNizovi su identicni.");
		} else {
			System.out.println("\n\nNizovi nisu identicni.");
		}

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

	/** Vraca true ukoliko su dva niza identicna */
	public static boolean equals(int[] niz1, int[] niz2) {

		boolean b = false;
		for (int i = 0; i < niz1.length; i++) {
			if (niz1[i] == niz2[i]) {
				b = true;
			} else {
				b = false;
				break;
			}
		}
		return b;
	}
}
