package zadaci_21_01_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak5 {
	
	/*
	 *  Neke web stranice forsiraju odreðena pravila za passworde. 
	 *  Napisati metodu koja provjerava da li je unijeti string validan password. 
	 *  Pravila da bi password bio validan su sljedeæa: 
	 *  1. Password mora biti saèinjen od najmanje 8 karaktera. 
	 *  2. Password smije da se sastoji samo od slova i brojeva. 
	 *  3. Password mora sadržati najmanje 2 broja. 
	 *  Napisati program koji pita korisnika da unese password te mu ispisuje "password je validan"
	 *   ukoliko su sva pravila ispoštovana ili "password nije validan" ukoliko pravila nisu ispoštovana.
	 */
	
	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		while (true) {
			// Izbaci pitanje korisniku da unese lozinku
			System.out.println("Molimo unesite vasu lozinku(najmanje 8 karaktera, najmanje 2 cifre:");
			String lozinka = unos.nextLine();

			//Ispisi rezultat
			if (jeValidna(lozinka)) {
				System.out.println("Lozinka je validna!");
				break;
			} else {
				System.out.println("Lozinka nije validna!\n");
				continue;
			}
		}

	}
	
	/**Metoda vraca true ukoliko je lozinka ispravna*/
	public static boolean jeValidna(String lozinka){
		
		int brojac = 0;
		
		//Provjerava da li lozinka ima 8 karaktera
		if (lozinka.length() < 8) {
			return false;
		} else {
			//Provjerava da li lozinka sadrzi slova ili brojeve
			for (int i = 0; i < lozinka.length(); i++) {
				char k = lozinka.charAt(i);
				if (!Character.isLetterOrDigit(k)) {
					return false;
				}
				if (Character.isDigit(k)) {
					brojac++;
				}
			}
			if (brojac < 2) {
				return false;
			}
		}
		return true;
	}

}
