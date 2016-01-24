package zadaci_24_01_2016;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {
	
	/*
	 * Napisati metodu koja vraæa broj dana u godini. Metoda koristi sljedeæi header: 
	 * public static int numberOfDayInAYear(int year). 
	 * Napisati program koji pita korisnika da unese poèetnu godinu, 
	 * krajnju godinu te ispisuje broj dana za svaku godinu u rasponu.
	 */	

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Inicijalizuj varijable
		int godina1;//Pocetna godina
		int godina2;//Krajnja godina
		
		//Izbaci pitanje korisniku da unese pocetnu godinu
		System.out.println("Molimo unesite pocetnu godinu:");
		while (true) {
			try {
				godina1 = unos.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		//Izbaci pitanje korisniku da unese krajnju godinu
		System.out.println("Molimo unesite krajnju godinu:");
		while (true) {
			try {
				godina2 = unos.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		//Ako je pocetna godina veca od krajnje zamijeni im mjesta
		if(godina1 > godina2){
			int a = godina1;
			godina1 = godina2;
			godina2 = a;
		}
		
		//Ispisi rezultat
		System.out.println("Godina | Broj dana");
		System.out.println("-------------------");
		for(int i = godina1; i < godina2; i++){
			System.out.print(i + "   | ");
			System.out.println(numberOfDayInAYear(i));
		}
		
	}
	
	/**Vraca broj dana u zadatoj godini*/
	public static int numberOfDayInAYear(int year){
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			return 366;
		}
		return 365;
	}

}
