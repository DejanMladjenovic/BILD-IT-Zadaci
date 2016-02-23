package zadaci_23_02_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak3 {
	
	/*
	 * Write a recursive method that finds the number of occurrences 
	 * of a specified letter in a string using the following method header:
	 * public static int count(String str, char a)
	 * For example, count("Welcome", 'e') returns 2. 
	 * Write a test program that prompts the user to enter a string and a character, 
	 * and displays the number of occurrences for the character in the string.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Pitaj korisnika da unese neki string
		System.out.println("Unesite neki string:");
		String string = unos.next();
		
		//Pitaj korisnika da unese neki karakter
		System.out.println("Unesite neki karakter:");
		char ch = unos.next().charAt(0);
		
		System.out.println("Vas string: " + string);
		System.out.println("Karakter " + ch + " se ponavlja " + count(string, ch) + " puta.");
		
	}
	
	/**Vraca broj datih slova u datom stringu*/
	public static int count(String str, char a){
		
		if (str.length() == 0)
			return 0;
		else if (str.charAt(str.length() - 1) == a)
			return 1 + count(str.substring(0, str.length() - 1), a);
		else
			return count(str.substring(0, str.length() - 1), a);
	}

}
