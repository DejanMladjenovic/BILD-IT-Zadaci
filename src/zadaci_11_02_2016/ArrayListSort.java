package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: ArrayListSort
 * 
 * @author Dejan Mladjenovic
 */

public class ArrayListSort {
	
	/*
	 * Write the following method that sorts an ArrayList of numbers:
	 * -public static void sort(ArrayList<Integer> list)
	 * Write a test program that prompts the user to enter 5 numbers, 
	 * stores them in an array list, and displays them in increasing order.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Kreiraj listu
		ArrayList<Integer> brojevi = new ArrayList<>();
		
		//Pitaj korisnika da unese 5 brojeva
		System.out.println("Unesite 5 brojeva:");
		for (int i = 0; i < 5; i++) {
			while (true) {
				try {
					brojevi.add(unos.nextInt());
					break;
				} catch (InputMismatchException e) {
					System.out.println("Pogresan unos! Pokusajte ponovo!");
					unos.nextLine();
				}
			}
		}
		//Ispisi listu prije sortiranja
		System.out.println("Lista prije sortiranja:");
		System.out.println(brojevi);
		
		//Pozovi metodu
		sort(brojevi);
		
		//Ispisi sortiranu listu
		System.out.println("Lista nakon sortiranja:");
		System.out.println(brojevi);	
	}
	
	/**Metoda sortira listu*/
	public static void sort(ArrayList<Integer> list){
		
		Collections.sort(list);
	}

}
