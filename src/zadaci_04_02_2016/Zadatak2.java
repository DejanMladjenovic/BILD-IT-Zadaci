package zadaci_04_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak2 {
	
	/*
	 * Dva 2D niza m1 i m2 su striktno identicni ako su njihovi odgovarajuci clanovi jednaki.
	 * Napisati metodu koja vraca true ako su m1 i m2 striktno identicni koristeci sledeci header:
	 * public static boolean equals(int[][] m1, int[][] m2).
	 * Napisati test program koji pita korisnika da unese 3 x 3 matricu i ispisuje da li su
	 * nizovi striktno identicni.
	 */

	/**Glavna metoda*/
	public static void main(String[] args){
				
		// Kreiraj prvu matricu
		double[][] m1 = new double[3][3];
		System.out.println("Unesite clanove u prvu matricu 3 x 3:");
		upis(m1);

		
		// Kreiraj drugu matricu
		double[][] m2 = new double[3][3];
		System.out.println("Unesite clanove u drugu matricu 3 x 3:");
		upis(m2);
		
		//Ispisi matrice
		System.out.println("Prva matrica:");
		ispis(m1);
		
		System.out.println("\nDruga matrica");
		ispis(m2);
		
		//Ispisi rezultat
		System.out.print("\nMatrice ");
		System.out.println(equals(m1, m2) ? "su identicne." : "nisu identicne.");

	}

	/** Metoda vraca true ako su nizovi identicni */
	public static boolean equals(double[][] m1, double[][] m2) {

		if (m1.length != m2.length)
			return false;
		for (int i = 0; i < m1.length; i++)
			for (int j = 0; j < m1[0].length; j++)
				if (m1[i][j] != m2[i][j])
					return false;

		return true;
	}

	/**Metoda ispisuje matricu*/
	public static void ispis(double[][] m){
		
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[0].length; j++){
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/**Metoda unosi podatke od korisnika*/
	public static void upis(double[][] m){
		
		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);		
		
		//Unesi podatke od korisnika
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[0].length; j++)
				while (true) {
					try {
						m[i][j] = unos.nextDouble();
						break;
					} catch (InputMismatchException e) {
						System.out.println("Pogresan unos! Pokusajte ponovo!");
						unos.nextLine();
					}
				}
	}
}
