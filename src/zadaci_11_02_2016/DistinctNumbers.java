package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: DistinctNumbers
 * 
 * @author Dejan Mladjenovic
 */

public class DistinctNumbers {
	
	/*
	 * Write a method that removes the duplicate elements from 
	 * an array list of integers using the following header:
	 * -public static void removeDuplicate(ArrayList<Integer> list)
	 * Write a test program that prompts the user to enter 10 integers to a list 
	 * and displays the distinct integers separated by exactly one space.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Kreiraj listu
		ArrayList<Integer> brojevi = new ArrayList<>();
		
		//Pitaj korisnika da unese 10 brojeva
		System.out.println("Unesite 10 brojeva:");
		for (int i = 0; i < 10; i++) {
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
		//Ispisi listu
		System.out.println("Izvorna lista: \n" + brojevi);
		
		//Ispisi listu nakon uklanjanja duplikata
		System.out.println("Uredjena lista: ");
		removeDuplicate(brojevi);	
	}
	
	/**Metoda brise duplikate iz liste*/
	public static void removeDuplicate(ArrayList<Integer> list){
		
		ArrayList<Integer> lista = new ArrayList<>();
		for(int i = 0; i < 10; i++)
			if(!lista.contains(list.get(i)))
				lista.add(list.get(i));
		
		System.out.println(lista);	
	}
}
