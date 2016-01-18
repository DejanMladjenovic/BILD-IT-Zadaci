package zadaci_18_01_2016;

import java.util.Scanner;

/**
 * Nazv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak1 {
	
	/*
	 * Napisati program koji pita korisnika da unese neki cijeli broj 
	 * te ispisuje njegove najmanje faktore u rastuæem redosljedu. 
	 * Na primjer, ukoliko korisnik unese 120 program treba da ispiše 
	 * 2, 2, 2, 3, 5. (2 * 2 * 2 * 3 * 5 = 120)
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		// Izbaci pitanje korisniku da unese neki cijeli broj
		System.out.println("Molimo unesite neki cijeli broj:");
		int broj = 0;
		boolean pravilanUnos = true;
		while (pravilanUnos) {
			try {
				broj = unos.nextInt();
				pravilanUnos = false;
			} catch (Exception e) {
				System.err.println("Greska! Pokusajte ponovo!");
				unos.nextLine();
			}
		}

		int i = 2;// Pocetni faktor

		// Izracunaj i ispisi rezultat
		System.out.println("Najmanji faktori broja " + broj + " su:");
		while (i <= broj) {
			if (broj % i == 0) {
				broj = broj / i;
				System.out.print(i + " ");
			} else {
				i++;
			}
		}
		unos.close();
	}

}
