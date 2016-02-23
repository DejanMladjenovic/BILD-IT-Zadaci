package zadaci_23_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak4
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak4 {
	
	/*
	 * Write a recursive method that computes the sum of the digits in an integer. 
	 * Use the following method header:  public static int sumDigits(long n)
	 * For example, sumDigits(234) returns 2 + 3 + 4 = 9. Write a test program
	 * that prompts the user to enter an integer and displays its sum.
	 */

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
		System.out.println("Zbir cifara: " + sumDigits(broj));
	}

	/**Vraca zbir cifara datog broja*/
	public static int sumDigits(long n){
		
		n = Math.abs(n);
		if(n < 10)
			return (int)n;
		else
			return (int)n % 10 + sumDigits(n / 10);
	}
}
