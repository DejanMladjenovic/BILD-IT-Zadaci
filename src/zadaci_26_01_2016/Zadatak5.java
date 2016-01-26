package zadaci_26_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak5 {
	
	/*
	 * Napisati program koji uèitava cijele brojeve u rasponu od 1 do 100 te broji 
	 * i ispisuje koliko je koji broj puta unijet. Pretpostavimo da nula prekida unos brojeva. 
	 * Ukoliko unesemo sljedeæi niz brojeva 2 5 6 23 42 58 2 6 0 program nam ispisuje 
	 * da se broj 2 ponavlja 2 puta, broj 5 jednom, broj 6 2 puta, broj 23 jednom, itd.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Kreiraj brojac za svaki uneseni broj
		int[] niz = new int [100];

		//Izbaci pitanje korisniku da unosi brojeve
		System.out.println("Molimo unosite brojeve od 1 do 100( nula prekida niz):");
		int broj;//Unos sa tastature
		while (true) {
			try {
				do {
					broj = unos.nextInt();
					niz[broj]++;
				} while (broj != 0);
				break;
			} catch (Exception e) {
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		//Ispisi koliko puta se ponovio odredjeni broj
		for(int i = 1; i < niz.length; i++){
			if(niz[i] != 0){
				System.out.println("Broj " + i + " se ponavlja " + niz[i] + " puta.");
			}
		}
		
		unos.close();
	}

}
