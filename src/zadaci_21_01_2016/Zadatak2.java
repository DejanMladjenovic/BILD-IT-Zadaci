package zadaci_21_01_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak2 {
	
	/*
	 * Napisati program koji pita korisnika da unese mjesec i godinu te mu ispiše broj dana u datom mjesecu. 
	 * Na primjer, ukoliko korisnik unese kao godinu 2012 a kao mjesec 2, program treba ispisati da je Februar 2012 imao 29 dana. 
	 * Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3, program treba ispisati da je Mart 2015 imao 31 dan.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		//Inicijalizuj varijable
		int godina = 0;
		int mjesec = 0;
		int brojDana = 0;
		String[] m = {"", "Januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul", 
				"Avgust", "Septembar", "Oktobar", "Novembar", "Decembar"};
		
		// Izbaci pitanje korisniku da unese godinu
		System.out.println("Unesite godinu:");
		while (true) {
			try {
				godina = unos.nextInt();
				break;
			} catch (Exception e) {
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		// Izbaci pitanje korisniku da unese mjesec
		System.out.println("Unesite mjesec:");
		while (true) {
			try {
				mjesec = unos.nextInt();
				if (mjesec < 1 || mjesec > 12) {
					System.err.println("Pogresan mjesec! Pokusajte ponovo!");
					continue;
				} else {
					break;
				}
			} catch (Exception e) {
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		//Odredi broj dana za svaki mjesec
		switch (mjesec) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			brojDana = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			brojDana = 30;
			break;
		case 2:
			if (((godina % 4 == 0) && !(godina % 100 == 0)) || (godina % 400 == 0))
				brojDana = 29;
			else
				brojDana = 28;
			break;
		}
		
		//Ispisi rezultat
		System.out.println(m[mjesec] + " " + godina + ". godine je imao " + brojDana + " dana." );
	}

}
