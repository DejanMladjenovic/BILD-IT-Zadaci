package zadaci_22_01_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak2 {
	
	/*
	 *  Great circle distance predstavlja udaljenost između dvije tačke na površine sfere. 
	 *  Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku širinu i dužinu dvije tačke. 
	 *  Great circle distance između ove dvije tačke može biti izračunata koristeći se sljedećom formulom: 
	 *  d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). 
	 *  Napisati program koij pita korisnika da unese geografsku širinu i dužinu u stepenima dvije tačke 
	 *  na površini zemlje te mu ispisuje great circle distance. Prosječni radius zemlje je 6.371.01 km. 
	 *  Stepene koje korisnik unese trebamo promijeniti u radianse koristeći se Math.toRadians metodom 
	 *  jer Java trigonometrijske metode koriste radianse. Širina i dužina u ovoj formuli se odnose na 
	 *  zapad i sjever. Koristimo negativne vrijednosti da označimo istok i jug.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Koordinate prve tacke
		System.out.println("Prva tacka");
		//Izbaci pitanje korisniku da unese geografsku sirinu
		System.out.println("Unesite geografsku sirinu:");
		double x1 = Math.toRadians(unosDoubleBrojeva(unos));
		
		//Izbaci pitanje korisniku da unese geografsku duzinu
		System.out.println("Unesite geografsku duzinu:");
		double y1 = Math.toRadians(unosDoubleBrojeva(unos));
		
		//Koordinate druge tacke
		System.out.println("\nDruga tacka");
		//Izbaci pitanje korisniku da unese geografsku sirinu
		System.out.println("Unesite geografsku sirinu:");
		double x2 = Math.toRadians(unosDoubleBrojeva(unos));
		
		//Izbaci pitanje korisniku da unese geografsku duzinu
		System.out.println("Unesite geografsku duzinu:");
		double y2 = Math.toRadians(unosDoubleBrojeva(unos));
		
		//Prosjecni radius Zemlje
		double radius = 6371.01;
		
		//Izracunaj razdaljinu izmedju dvije tacke
		double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		//Ispisi rezultat
		System.out.println("Udaljenost izmedju dvije tacke je:");
		System.out.println((double)(Math.round(d * 100d) / 100d) + " km.");
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
