package zadaci_17_01_2016;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {
	
	/*
	 * Implementirati sljedeæu metodu da sortira redove u 2D nizu:
	 * public static double[ ][ ] sortRows(double[ ][ ] array)
	 * Napisati testni program koji pita korisnika da unese 3x3 matricu 
	 * (ili da pita korisnika koliku matricu želi unijeti) te mu ispisuje 
	 * na konzoli matricu sa sortiranim redovima - od najmanjeg broja do najveæeg.
	 */

	/** Glavna metoda */
	public static void main(String[] args) {

		// Ispis izvorne matrice
		double[][] matrica = niz();
		System.out.println("Matrica prije sortiranja:");
		ispis(matrica);

		// Ispis matrice nakon sortiranja
		double[][] result = sortRows(matrica);
		System.out.println("Matrica nakon sortiranja:");
		ispis(result);
	}

	/** Ucitava matricu od korisnika */
	public static double[][] niz() {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		// Ucitaj broj redova
		System.out.println("Unesite broj redova matrice:");
		int red = unosIntBrojeva(unos);

		// Ucitaj broj kolona
		System.out.println("Unesite broj kolona matrice:");
		int kolona = unosIntBrojeva(unos);

		// Ucitaj clanove matrice
		System.out.println("Unesite clanove matrice: ");
		double[][] m = new double[red][kolona];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = unosDoubleBrojeva(unos);
			}
		}
		unos.close();
		return m;
	}

	/** Metoda obradjuje izuzetke int tipa */
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

	/** Metoda obradjuje izuzetke double tipa */
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

	/** Ispisuje matricu */
	public static void ispis(double[][] m) {

		for (int i = 0; i < m.length; i++) {
			for (int index = 0; index < m[i].length; index++) {
				System.out.print("  " + m[i][index]);
			}
			System.out.println();
		}
	}

	/** Vraca matricu sa sortiranim redovima */
	public static double[][] sortRows(double[][] array) {

		double[][] result = new double[array.length][array[0].length];
		for (int i = 0; i < array.length; i++) {
			Arrays.sort(array[i]);
			result[i] = array[i];
		}
		return result;
	}
}
