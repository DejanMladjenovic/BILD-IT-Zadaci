package zadaci_25_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak4
 * 
 * @author Dejan Mladjenovic
 */


public class Zadatak4 {
	
	/*
	 * Napisati program koji pita korisnika da unese broj minuta (npr. 1 milijardu) te ispiše korisniku 
	 * koliko je to u godinama i danima. Zbog jednostavnosti, pretpostavimo da godina ima 365 dana.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		

		//Izbaci pitanje korisniku da unese broj minuta
		System.out.println("Unesite broj minuta:");
		long minute;
		while (true)
			try {
				minute = unos.nextLong();
				break;
			} catch (InputMismatchException e) {
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		
		//Broj minuta u jednoj godini
		int godina = 365 * 24 * 60;
		
		//Ukupan broj godina
		int godine = (int)(minute / godina);
		
		//Broj minuta u jednom danu
		int dan = 24 * 60;
		
		//Ukupan broj sati
		int dani = (int)(minute % godina) / dan;
		
		//Ispisi rezultat
		System.out.println(minute + " minuta iznosi " + godine + " godina i " + dani + " dana.");
		
		unos.close();
	}

}
