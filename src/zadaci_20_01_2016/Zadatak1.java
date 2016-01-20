package zadaci_20_01_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 * 
 */

public class Zadatak1 {
	
	/*
	 * Napisati program koji uèitava iznos investicije, godišnju interesnu stopu i broj godina 
	 * te vraæa buduæu vrijednost investicije koristeæi se sljedeæom formulom: 
	 * buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12. 
	 * Na primjer, ukoliko unesete kao iznos investicije 1000, 3.25 kao godišnju interesnu stopu 
	 * i 1 kao broj godina program vam vraæa 1032.98 kao buducu vrijednost investicije.
	 */

	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		//Izbaci pitanje korisniku da unese iznos investicije
		System.out.println("Molimo unesite iznos investicije:");
		double iznos = unosDoubleBrojeva(unos);
		
		//Izbaci pitanje korisniku da unese godisnju interesnu stopu
		System.out.println("Molimo unesite godisnju interesnu stopu:");
		double gis = unosDoubleBrojeva(unos);
		
		//Izbaci pitanje korisniku da unese broj godina
		System.out.println("Molimo unesite broj godina:");
		int bg = unosIntBrojeva(unos);
		
		//Mjesecna interesna stopa
		double mis = gis / 1200;
		
		//Buduca vrijednost investicije
		double bvi = iznos * Math.pow((1 + mis), (bg * 12));
		
		//Ispisi rezultat
		System.out.println("\nBuduca vrijednost investicije:");
		System.out.println((int)(bvi * 100d) / 100d);
		
		unos.close();
	}
	
	/** Metoda obradjuje izuzetke int tipa */
	private static int unosIntBrojeva(Scanner unos) {

		while (true) {
			try {
				return unos.nextInt();
			} catch (Exception e) {
				System.err.println("Pogresan unos! Pokusajte ponovo.");
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
				System.err.println("Pogresan unos! Pokusajte ponovo.");
				unos.nextLine();
			}
		}
	}


}
