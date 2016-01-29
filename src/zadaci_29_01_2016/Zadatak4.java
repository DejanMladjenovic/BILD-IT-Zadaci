package zadaci_29_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak4
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak4 {
	
	/*
	 * Napisati metodu koja izraèunava zbir svih brojeva u cijelom broju. 
	 * Koristite sljedeæi header: public static int sumDigits(long n). 
	 * Na primjer, ako pozovemo metodu i proslijedimo joj broj 234 
	 * (sumDigits(234)) metoda treba da vrati 9. (2 + 3 + 4 = 9)
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		//Izbaci pitanje korisniku da unese cijeli broj
		System.out.println("Molimo unesite neki cijeli broj:");
		long broj;
		while (true) {
			try {
				broj = unos.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		//Ispisi rezultat
		System.out.println("Vas broj: " + broj);
		System.out.println("Zbir cifara je: " + sumDigits(broj));
	}
	
	/**Metoda vraca zbir svih cifara proslijedjenog broja*/
	public static int sumDigits(long n){
		
		int zbir = 0;
		
		while(n != 0){
			zbir += n % 10;
			n /= 10;
		}
		return Math.abs(zbir);
	}

}
