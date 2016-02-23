package zadaci_23_02_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak2 {
	
	/*
	 * Write a recursive method that displays a string reversely on the console using the following header:
	 * public static void reverseDisplay(String value)
	 * For example, reverseDisplay("abcd") displays dcba. 
	 * Write a test program that prompts the user to enter a string and displays its reversal
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Pitaj korisnika da unese neki string
		System.out.println("Unesite neki string:");
		String string = unos.nextLine();

		//Ispisi rezultat
		reverseDisplay(string);
	}
	
	/**Vraca string ispisan unazad*/
	public static void reverseDisplay(String value){
		
		if(value.length() <= 1){
			System.out.print(value);
		}else{
			System.out.print(value.charAt(value.length() - 1));
			reverseDisplay(value.substring(0, value.length() - 1));
		}
	}

}
