package zadaci_26_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak4
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak4 {
	
	/*
	 * Napisati program koji pita korisnika da unese 3 cijela broja 
	 * te mu ispiše ta ista tri broja u rastuæem redosljedu. 
	 * Bonus: Napisati metodu koja prima tri cijela broja kao argumente
	 *  te vraæa brojeve u rastuæem redosljedu
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		// Unesite prvi broj
		System.out.println("Unesite 1. broj:");
		int broj1 = unosBrojeva(unos);

		// Unesite drugi broj
		System.out.println("Unesite 2. broj:");
		int broj2 = unosBrojeva(unos);

		// Unesite treci broj
		System.out.println("Unesite 3. broj:");
		int broj3 = unosBrojeva(unos);

		//Ispis brojeva prije sortiranja
		System.out.println("\nPrije sortiranja: ");
		System.out.println(broj1 + " " + broj2 + " " + broj3);
		
		//Ispis brojeva nakon sortiranja
		System.out.println("Poslije sortiranja:");
		System.out.println(sortiraniBrojevi(broj1, broj2, broj3));
		
		unos.close();
	
	}

	/**Metoda obradjuje izuzetke*/	
	private static int unosBrojeva(Scanner unos){
		
		while(true){
			try{
				return unos.nextInt();
			}catch(InputMismatchException e){
				System.err.println("Greska!Pokusajte ponovo.");
				unos.nextLine();
			}
		}
	}
	
	/** Metoda uzima 3 broja iz unosa i sortira ih od najmanjeg do najveceg */
	public static String sortiraniBrojevi(int broj1, int broj2, int broj3){

		//Sortiranje brojeva
		if (broj1 > broj2) {
			int temp = broj1;
			broj1 = broj2;
			broj2 = temp;
		}
		
		if (broj2 > broj3) {
			int temp = broj2;
			broj2 = broj3;
			broj3 = temp;
		}

		if (broj1 > broj2) {
			int temp = broj1;
			broj1 = broj2;
			broj2 = temp;
		}

	return (new String( broj1 + " " + broj2 + " " + broj3));
	}

}
