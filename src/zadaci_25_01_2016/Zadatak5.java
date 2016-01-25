package zadaci_25_01_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 */


public class Zadatak5 {
	
	/*
	 * Napisati program koji uèitava neodreðen broj cijelih brojeva, odreðuje koliko je pozitivnih brojeva 
	 * korisnik unijeo, koliko negativnih te izraèunava ukupnu sumu i prosjek svih unesenih brojeva. 
	 * (Korisnik prekida unos tako što unese nulu). Na primjer, ukoliko korisnik unese 1 2 -1 3 0 
	 * program treba da ispiše da je broj pozitivnih brojeva 3, negativnih brojeva 1, 
	 * suma ili zbir su 5.0 a prosjek svih brojeva je 1.25.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		int pozitivni = 0;//Brojac pozitivnih brojeva
		int negativni = 0;//Brojac negativnih brojeva
		int suma = 0;//Zbir unesenih brojeva
		int broj;//Unos sa tastature

		//Kreiraj listu brojeva
		ArrayList<Integer> lista = new ArrayList<>();
		while (true) {
			try {
				do {
					//Izbaci pitanje korisniku da unese broj
					System.out.println("Unesite broj( nula prekida niz):");
					broj = unos.nextInt();
					if (broj != 0){
						lista.add(broj);
						suma += broj;
						if (broj < 0)
							negativni++;
						else
							pozitivni++;
					}
				} while (broj != 0);
				break;
			} catch (InputMismatchException e) {
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		//Izracunaj prosjek brojeva
		double prosjek = (double)suma / (negativni + pozitivni);
		
		//Ispisi rezultat
		System.out.println("Vasi brojevi: " + lista);
		System.out.println("Broj pozitivnih: " + pozitivni);
		System.out.println("Broj negativnih: " + negativni);
		System.out.println("Zbir je: " + suma);
		System.out.println("Prosjek je: " + prosjek);
	}

}
