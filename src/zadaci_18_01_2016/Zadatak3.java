package zadaci_18_01_2016;

import java.util.Scanner;

/**
 * Nazv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 *
 */
public class Zadatak3 {

	/*
	 * Napisati metodu sa sljedeæim headerom koja ispisuje tri broja u rastuæem redosljedu: 
	 * public static void displaySortedNumbers(double num1, double num2, double num3). 
	 * Napisati program koji pita korisnika da unese tri broja te ispiše ta tri broja u rastuæem redosljedu.
	 */
	
	/** Glavna metoda */
	public static void main(String[] args) {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		// Unesite prvi broj
		System.out.println("Unesite 1. broj:");
		double broj1 = unosBrojeva(unos);

		// Unesite drugi broj
		System.out.println("Unesite 2. broj:");
		double broj2 = unosBrojeva(unos);

		// Unesite treci broj
		System.out.println("Unesite 3. broj:");
		double broj3 = unosBrojeva(unos);

		// Poziva metodu
		displaySortedNumbers(broj1, broj2, broj3);

		unos.close();
	}
	
	/**Metoda obradjuje izuzetke*/
	private static double unosBrojeva(Scanner unos){
		
		while(true){
			try{
				return unos.nextDouble();
			}catch(Exception e){
				System.err.println("Greska!Pokusajte ponovo.");
				unos.nextLine();
			}
		}
	}

	/** Metoda uzima 3 broja iz unosa i sortira ih od najmanjeg do najveceg */
	public static void displaySortedNumbers(double num1, double num2,
			double num3) {

		//Ispis brojeva prije sortiranja
		System.out.println("\nPrije sortiranja: ");
		System.out.println(num1 + " " + num2 + " " + num3);

		//Sortiranje brojeva
		if (num1 > num2) {
			double temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		if (num2 > num3) {
			double temp = num2;
			num2 = num3;
			num3 = temp;
		}

		if (num1 > num2) {
			double temp = num1;
			num1 = num2;
			num2 = temp;
		}

		//Ispis brojeva nakon sortiranja
		System.out.println("Poslije sortiranja:");
		System.out.println(num1 + " " + num2 + " " + num3);
	}

}
