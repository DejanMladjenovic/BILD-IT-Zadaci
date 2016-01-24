package zadaci_24_01_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak5 {
	
	/*
	 * Napisati program koji pita korisnika da unese dva stringa te provjerava i ispisuje 
	 * da li je drugi string substring prvog stringa. Na primjer, ukoliko korisnik unese ABCD kao prvi string 
	 * a BC kao drugi string program mu ispisuje da je BC substring ABCD stringa.
	 */
	
	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese prvi string
		System.out.println("Molimo unesite prvi string:");
		String string1 = unos.nextLine();
		
		// Izbaci pitanje korisniku da unese prvi string
		System.out.println("Molimo unesite drugi string:");
		String string2 = unos.nextLine();
		
		//Ispisi rezultat
		if(string1.contains(string2))
			System.out.println("String \"" + string2 + "\" je subsring \"" + string1 + "\" stringa.");
		else
			System.out.println("String \"" + string2 + "\" nije subsring \"" + string1 + "\" stringa.");
	}

}
