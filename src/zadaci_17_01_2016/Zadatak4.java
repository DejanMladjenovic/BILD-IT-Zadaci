package zadaci_17_01_2016;

/**
 * Naziv klase: Zadatak4
 * 
 * @author Dejan Mladjenovic
 *
 */

import java.util.Scanner;

public class Zadatak4 {
	
	/*
	 *  Napisati metodu koja vraæa lokaciju najveæeg elementa u 2D nizu.
	 *  Metoda treba da koristi sljedeæi header:
	 *  public static int[ ] locateLargest(double[ ][ ] a)
	 *  Napisati test program koji pita korisnika da unese 2D niz 
	 *  te mu ispisuje lokaciju najveæeg elementa u nizu.
	 */

	/** Glavna metoda */
	public static void main(String[] args) {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		// Izaberite broj redova
		System.out.println("Unesite broj redova matrice:");
		int red = unosIntBrojeva(unos);

		// Izaberite broj kolona
		System.out.println("Unesite broj kolona matrice:");
		int kolona = unosIntBrojeva(unos);

		// Kreiraj matricu
		System.out.println("Unesi clanove matrice: ");
		double[][] m = new double[red][kolona];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = unosDoubleBrojeva(unos);
			}
		}

		// Ispisi matricu
		System.out.println("Matrica:");
		for (int a = 0; a < m.length; a++) {
			for (int b = 0; b < m[a].length; b++) {
				System.out.print(m[a][b] + " ");
			}
			System.out.println();
		}
		unos.close();

		// Ispisi rezultat
		System.out.println("\nNajveci clan matrice");
		System.out.println("Red: " + locateLargest(m)[0]);
		System.out.println("Kolona: " + locateLargest(m)[1]);

	}

	/** Metoda obradjuje izuzetke tipa int */
	private static int unosIntBrojeva(Scanner unos) {

		while (true) {
			try {
				return unos.nextInt();
			} catch (Exception e) {
				System.err.println("Greska!Pokusajte ponovo.");
				unos.nextLine();
			}
		}
	}

	/** Metoda obradjuje izuzetke tipa double */
	private static double unosDoubleBrojeva(Scanner unos) {
		
		while (true) {
			try {
				return unos.nextDouble();
			} catch (Exception e) {
				System.err.println("Greska!Pokusajte ponovo.");
				unos.nextLine();
			}
		}
	}

	/** Vraca poziciju najveceg clana u matrici */
	public static int[] locateLargest(double[][] a) {

		int[] max = new int[2];
		max[0] = 0;
		max[1] = 0;
		double tempMaxVal = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (tempMaxVal < a[i][j]) {
					tempMaxVal = a[i][j];
					max[0] = (i + 1);
					max[1] = (j + 1);
				}
			}

		}
		return max;

	}

}
