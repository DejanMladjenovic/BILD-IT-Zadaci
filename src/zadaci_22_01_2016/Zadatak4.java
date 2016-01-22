package zadaci_22_01_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak4 {

	/*
	 * Napišite program koji uèitava neodreðen broj cijelih brojeva (unos
	 * prekida nula), pronalazi najveæi od unijetih brojeva te ispisuje koliko
	 * se najveæi broj puta ponovio. Na primjer, ukoliko unesemo 3 5 2 5 5 5 0
	 * program ispisuje da je najveæi broj 5 te ispisuje da se isti ponavlja 4
	 * puta.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		//Kreiraj listu
		ArrayList<Integer> brojevi = new ArrayList<>();
		
		int broj = 0;//Inicijalizuj unos
		
		//Izbaci pitanje korisniu da unosi brojeve
		System.out.println("Molimo unosite brojeve( nula prekida niz):");
		while (true) {
			try {
				do {
					broj = unos.nextInt();
					if(broj != 0)
						brojevi.add(broj);//Dodaji brojeve u listu
				} while (broj != 0);
				break;
			} catch (InputMismatchException e) {
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		//Ispisi listu
		System.out.println("Uneseni brojevi su:" + brojevi.toString());
		
		//Sortiraj listu
		Collections.sort(brojevi);
		
		//Izracunaj koliko puta se ponovio najveci broj
		int brojac = 0;
		for(int i = brojevi.size() - 1; i >= 0; i--){
			if(brojevi.get(brojevi.size() - 1).equals(brojevi.get(i))){
				brojac++;
			}
		}
		
		//Ispisi rezultat
		System.out.println("Najveci broj je: " + brojevi.get(brojevi.size() - 1));
		System.out.println("Ponavlja se ukupno " + brojac + " puta.");
	}

}
