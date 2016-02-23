package zadaci_23_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak5 {
	
	/*
	 * Write a recursive method that returns the largest integer in an array. 
	 * Write a test program that prompts the user to enter 
	 * a list of eight integers and displays the largest element.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Kreiraj listu
		int[] niz = new int[8];
		
		//Pitaj korisnika da unese listu od 8 brojeva
		System.out.println("Unesite 8 cijelih brojeva:");
		for(int i = 0; i < 8; i++){
			System.out.println("Unesite " + (i +1) + ". broj:");
			while(true){
				try{
					niz[i] = unos.nextInt();
					break;
				}catch(InputMismatchException e){
					System.out.println("Pogresan unos! Pokusajte ponovo!");
					unos.nextLine();
				}
			}
		}
		
		//Ispisi niz
		System.out.print("Niz: ");
		for(int i = 0; i < 8; i++){
			System.out.print(niz[i] + " ");
		}
		
		//Ispisi rezultat
		System.out.println("\nNajveci clan je " + max(niz, niz.length - 1));		
	}
	
	/**Vraca najveci clan niza*/
	public static int max(int[] niz, int i){
		
		if(i > 0)
			return Math.max(niz[i], max(niz, (i - 1)));
		else
			return niz[0];		
	}
}
