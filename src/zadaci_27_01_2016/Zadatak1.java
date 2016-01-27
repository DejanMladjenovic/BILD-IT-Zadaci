package zadaci_27_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak1 {
	
	/*
	 *  Napisati program koji uèitava ukupan iznos raèuna koji treba uplatiti kao i procenat tog raèuna 
	 *  kojeg želimo platiti kao napojnicu te izraèunava ukupan raèun i napojnicu. 
	 *  Na primjer, ukoliko korisnik unese 10 kao raèun i 15 % kao procenat za napojnicu 
	 *  program treba da ispiše da je ukupan raèun za uplatiti 11.5 a napojnica 1.5.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		// Izbaci pitanje korisniku da unese ukupan iznos racuna
		System.out.println("Molimo unesite ukupan iznos racuna( u KM): ");
		double iznos = unosBrojeva(unos);
		
		//Izbaci pitanje korisniku da unese stopu napojnice
		System.out.println("Molimo unesite stopu napojnice(u procentima):");
		double stopaNapojnice = unosBrojeva(unos);

		//Izracunaj napojnicu
		double napojnica = iznos * (stopaNapojnice / 100);
		
		//Izracunaj ukupan racun za uplatiti
		double ukupanIznos = iznos + napojnica;

		// Ispisi rezultat
		System.out.println("Ukupan iznos za uplatiti je " + ukupanIznos + " KM, a napojnica je " + napojnica + " KM.");		
	
		unos.close();
	}
	
	/**Metoda obradjuje izuzetke*/
	private static double unosBrojeva(Scanner unos){
		
		while(true){
			try{
				return unos.nextDouble();
			}catch(InputMismatchException e){
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
	}

}
