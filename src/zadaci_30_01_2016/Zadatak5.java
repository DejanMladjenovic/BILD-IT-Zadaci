package zadaci_30_01_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak5 {
	
	/*
	 * Napisati program koji pita korisnika da unese cijeli broj te ispisuje piramidu svih brojeva do tog broja. 
	 * (Na primjer, ukoliko korisnik unese 7 vrh piramide je broj 1, red ispod vrha piramide je 2 1 2, 
	 * red ispod je 3 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese cijeli broj
		System.out.println("Molimo unesite cijeli broj:");
		int broj = unos.nextInt();
		
		//Ispisi piramidu
		for(int i = 1; i < broj; i++){
			for(int j = 1; j <= broj - i; j++)
				System.out.print("  ");
			for(int j = i; j >= 1; j--)
				System.out.print(j + " ");
			for(int j = 2; j <= i; j++)
				System.out.print(j + " ");
			System.out.println();	
		}
	}

}
