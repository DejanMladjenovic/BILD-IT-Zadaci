package zadaci_20_01_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 * 
 */

public class Zadatak5 {
	
	/*
	 * Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeće v, možemo izračunati minimalnu 
	 * dužinu piste potrebne da avion uzleti koristeći se sljedećom formulom: dužina = v * v / 2a. 
	 * Napisati program koji pita korisnika da unese v u m/s i a u m/s² te ispisuje korisniku minimalnu dužinu piste. 
	 * (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje dužina piste je 514.286)
	 */

	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		//Izbaci pitanje korisniku da unese brzinu aviona
		System.out.println("Molimo unesite brzinu aviona( u m/s):");
		double v = unosDoubleBrojeva(unos);
		
		//Izbaci pitanje korisniku da unese ubrzanje aviona
		System.out.println("Molimo unesite ubrzanje aviona( u m/s²):");
		double a = unosDoubleBrojeva(unos);
		
		//Izracunaj minimalnu duzinu piste potrebnu za polijetanje
		double duzina = v * v / (2 * a);
		
		//Ispisi rezultat
		System.out.println("\nMinimalna duzina piste iznosi:");
		System.out.println(Math.round(duzina * 1000d) / 1000d);
		
		unos.close();
	}

	/** Metoda obradjuje izuzetke double tipa */
	private static double unosDoubleBrojeva(Scanner unos) {

		while (true) {
			try {
				return unos.nextDouble();
			} catch (Exception e) {
				System.err.println("Pogresan unos! Pokusajte ponovo.");
				unos.nextLine();
			}
		}
	}

}
