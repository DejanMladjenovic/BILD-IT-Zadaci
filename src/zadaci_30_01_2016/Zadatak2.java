package zadaci_30_01_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak2 {
	
	/*
	 * Napisati program koji pita korisnika da unese neki string 
	 * te mu ispisuje dužinu tog stringa kao i prvo slovo stringa.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese neki string
		System.out.println("Molimo unesite neki string: ");
		String string = unos.nextLine();
		
		//Pretvori string u niz karaktera
		char[] slova = string.toCharArray();
		
		//Ispisi rezultat
		System.out.println("Duzina stringa: " + slova.length);
		System.out.println("Prvo slovo stringa: " + slova[0]);
		
		unos.close();
	}

}
