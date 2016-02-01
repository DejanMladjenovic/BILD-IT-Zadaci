package zadaci_01_02_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak2 {
	
	/*
	 * Napisati program koji prima karakter te vraæa njegov Unicode. 
	 * Primjer: ukoliko korisnik unese karakter E program mu vraæa 69 kao unicode za taj karakter.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese neki karakter
		System.out.println("Molimo unesite neki karakter:");
		String string;
		while(true){
			string = unos.nextLine();
			if(string.length() < 1){
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				continue;
			}
			break;
		}
		
		//Odredi unikod za dati karakter
		char k = string.charAt(0);
		
		//Ispisi razultat
		System.out.println("Karakter: " + k);
		System.out.println("Unikod: " + (int) k);
		
		unos.close();
	}
}
