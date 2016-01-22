package zadaci_22_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak5 {
	
	/*
	 * Napisati metodu koja pretavara milisekunde u sate, minute i sekunde. 
	 * Metoda treba da koristi sljedeæi header: public static String convertMillis(long millis). 
	 * Metoda treba da vraæa vrijeme kao string u formatu sati:minute:sekunde.  
	 * Na primjer convertMillis(100000) treba da vrati 0:1:40.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		// Izbaci pitanje korisniku a unese broj milisekundi
		System.out.println("Molimo unesite broj milisekundi:");
		long millis = 0;
		while (true) {
			try {
				millis = unos.nextLong();
				break;
			} catch (InputMismatchException e) {
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}

		// Ispisi rezultat
		System.out.println("Vase vrijeme je:");
		System.out.println(convertMillis(millis));
	}
	
	/** Metoda pretvara milisekunde u sate, minute i sekunde */
	public static String convertMillis(long millis) {

		// Dobiti ukupan broj sekundi
		long ukupnoSekundi = millis / 1000;

		// Izraèunati trenutnu sekundu
		long trenutnaSekunda = ukupnoSekundi % 60;

		// Dobiti ukupan broj minuta
		long ukupnoMinuta = ukupnoSekundi / 60;

		// Izraèunati trenutnu minutu
		long trenutnaMinuta = ukupnoMinuta % 60;

		// Dobiti ukupan broj sati
		long ukupnoSati = ukupnoMinuta / 60;

		return ukupnoSati + ":" + trenutnaMinuta + ":" + trenutnaSekunda;

	}

}
