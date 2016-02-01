package zadaci_01_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak4
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak4 {
	
	/*
	 * Napisati metodu sa sljedeæim headerom: public static String format(int number, int width) 
	 * koja vraæa string broja sa prefiksom od jedne ili više nula. Velièina stringa je width argument. 
	 * Na primjer, ukoliko pozovemo metodu format(34, 4) metoda vraæa 0034, ukoliko pozovemo format(34, 5) 
	 * metoda vraæa 00034. Ukoliko je uneseni broj veæi nego width argument, metoda vraæa samo string broja. 
	 * Npr. ukoliko pozovemo format(34, 1) metoda vraæa 34.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		//Izbaci pitanje korisniku da unese neki broj
		System.out.println("Unesite neki broj:");
		int broj = unosBrojeva(unos);
		
		//Izbaci pitanje korisniku da unese zeljeni broj cifara za dati broj
		System.out.println("Unesite broj cifara za broj:");
		int cifra = unosBrojeva(unos);
		
		//Ispisi rezultat
		System.out.println(format(broj, cifra));	
		
		unos.close();
	}
	
	
	/**Metoda vraca string datog broja sa prefiksom od jedne ili vise nula  zavisno od zeljene duzine
	 * Ako je trazena duzina manja od broja cifara, metoda vraca string broja*/ 
	public static String format(int number, int width){
		
		String broj =String.valueOf(number);
		String nula = "";
		if(broj.length() >= width)
			return broj;
		else{
			for(int i = 0; i < (width - broj.length()); i++){
				nula += "0";
			}
		}		
		return nula + broj;
	}
	
	/**Metoda obradjuje izuzetke int tipa*/
	private static int unosBrojeva(Scanner unos){
		
		while(true){
			try{
				return unos.nextInt();
			}catch(InputMismatchException e){
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
	}
	

}
