package zadaci_19_01_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak1 {
	
	/*
	 * Pretpostavimo da uplatimo $100 svaki mjesec na štedni raèun koji ima godišnju interesnu stopu od 5%. 
	 * Mjeseèna interesna stopa je stoga 0.05 / 12 = 0.00417. 
	 * Nakon prvog mjeseca vrijednost na raèunu postaje 100 * (1 + 0.00417) = 100.417. 
	 * Nakon drugog mjeseca, vrijednost na raèunu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. 
	 * Nakon treæeg mjeseca, vrijednost na raèunu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. 
	 * Napisati program koji pita korisnika da unese mjeseèni iznos štednje 
	 * te broj mjeseci nakon kojeg bi želio znati stanje raèuna.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese mjesecni iznos stednje
		System.out.println("Unesite mjesecni iznos stednje:");
		double iznos = unosDoubleBrojeva(unos);
		
		//Izbaci pitanje korisniku da unese broj mjeseci stednje
		System.out.println("Unesite broj mjeseci:");
		int mjesec = unosIntBrojeva(unos);
		
		//Kamatna stopa
		double kamatnaStopa = 0.05 / 12;
		
		//Izracunaj stanje racuna za dati period
		double suma = 0;
		for(int i = 0; i < mjesec; i++){
			suma = (iznos + suma) * (1 + kamatnaStopa);
		}
		
		//Ispisi rezultat
		System.out.println("Stanje racuna:");
		System.out.println((double)Math.round(suma * 1000d) / 1000d);
		
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


}
