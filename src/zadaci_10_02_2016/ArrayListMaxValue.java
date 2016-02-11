package zadaci_10_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: ArrayListmaxValue
 * 
 * @author Dejan Mladjenovic
 */

public class ArrayListMaxValue {
	
	/*
	 * Write the following method that returns the maximum value in an ArrayList of integers. 
	 * The method returns null if the list is null or the list size is 0.
	 * -public static Integer max(ArrayList<Integer> list)
	 * Write a test program that prompts the user to enter a sequence of numbers ending
	 * with 0, and invokes this method to return the largest number in the input.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Kreiraj listu brojeva
		ArrayList<Integer> lista = new ArrayList<>();
		
		//Pitaj korisnika da unosi brojeve
		System.out.println("Unesite niz brojeva( nula prekida niz):");
		int broj;
		while(true){
			try{
				System.out.println("Broj:");
				broj = unos.nextInt();
				if(broj == 0)
					break;
				lista.add(broj);
			}catch(InputMismatchException e){
				System.out.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		//ispisi listu
		System.out.println("Vasi  brojevi: " + lista);
		
		//Ispisi najveci clan liste
		System.out.println("Najveci broj: " + max(lista));
	}
	
	/**Vraca najveci clan date liste*/
	public static Integer max(ArrayList<Integer> list){
		
		Collections.sort(list);
		Integer broj = list.get(list.size() - 1);
		return broj;	
	}
}
