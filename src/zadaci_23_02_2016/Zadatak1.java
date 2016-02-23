package zadaci_23_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak1 {
	
	/*
	 * Write a recursive method that displays an int value reversely on the console using the following header:
	 * public static void reverseDisplay(int value)
	 * For example, reverseDisplay(12345) displays 54321. Write a test program
	 * that prompts the user to enter an integer and displays its reversal.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);	
		
		//Pitaj korisnika da unese cijeli broj
		System.out.println("Unesite cijeli broj:");
		int broj;
		while(true){
			try{
				broj = unos.nextInt();
				break;
			}catch(InputMismatchException e){
				System.out.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		//Ispisi rezultat
		reverseDisplay(broj);	
	}
	
	/**Ispisuje broj unatrag*/
	public static void reverseDisplay(int value){
		
		if(value < 0)
			System.out.print("-");
		value = Math.abs(value);
		if(value < 10){
			System.out.println(value);
		}else{
			System.out.print(value % 10);
			reverseDisplay(value / 10);
		}
	}

}
