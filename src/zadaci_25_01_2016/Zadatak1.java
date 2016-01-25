package zadaci_25_01_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 */


public class Zadatak1 {
	
	/*
	 * Napisati program koji pita korisnika da unese imena tri grada te ih ispiše u abecednom redu. 
	 * Na primjer, ukoliko korisnik unese Chicago, Los Angeles i Atlanta kao gradove, 
	 * program vraæa Atlanta, Chicago, Los Angeles.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		//Kreiraj listu gradova
		ArrayList<String> gradovi = new ArrayList<>();
		
		//Izbaci pitanje korisniku da unese nazive gradova
		for(int i = 1; i <= 3; i++){
			System.out.println("Molimo unesite ime " + i + ". grada:");
			String grad = unos.nextLine();
			gradovi.add(grad);
		}
		
		//Sortiraj gradove po abecednom redu
		Collections.sort(gradovi);
		
		//Ispisi rezultat
		System.out.println("Sortirani gradovi:");
		System.out.print(gradovi.get(0) + ", " + gradovi.get(1) + ", " + gradovi.get(2) + ".");
	}

}
