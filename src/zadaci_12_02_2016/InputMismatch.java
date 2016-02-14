package zadaci_12_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: InputMismatch
 * 
 * @author Dejan Mladjenovic
 */

public class InputMismatch {
	
	/*
	* Write a program that prompts the user to read
	* two integers and displays their sum. Your program should prompt the user to
	* read the number again if the input is incorrect.	
	*/

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		//Pitaj korisnika da unese prvi broj
		System.out.println("Unesite prvi broj:");
		int broj1 = unosBrojeva(unos);

		//Pitaj korisnika da unese drugi broj
		System.out.println("Unesite drugi broj:");
		int broj2 = unosBrojeva(unos);
		
		//Izracunaj zbir
		int zbir = broj1 + broj2;
		
		//Ispisi rezultat
		System.out.println("Zbir:");
		System.out.println(broj1 + " + " + broj2 + " = " + zbir);
		
	}
	
	/**Metoda obradjuje izuzetke int tipa*/
	private static int unosBrojeva(Scanner unos){
		
		while(true){
			try{
				return unos.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
	}

}
