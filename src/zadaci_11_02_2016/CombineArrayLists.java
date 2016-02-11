package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CombineArrayLists {
	
	/*
	 * Write a method that returns the union of two array lists of integers using the following header:
	 * -public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
	 * For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is {2, 3, 1, 5, 3, 4, 6}. 
	 * Write a test program that prompts the user to enter two lists, each with five integers, 
	 * and displays their union. The numbers are separated by exactly one space in the output
	 */

	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Kreiraj liste
		ArrayList<Integer> lista1 = new ArrayList<>();
		ArrayList<Integer> lista2 = new ArrayList<>();
		
		//Pitaj korisnika da unese 5 brojeva u prvu listu
		System.out.println("Prva lista:");
		System.out.println("Unesite 5 brojeva:");
		for (int i = 0; i < 5; i++) {
			while (true) {
				try {
					lista1.add(unos.nextInt());
					break;
				} catch (InputMismatchException e) {
					System.out.println("Pogresan unos! Pokusajte ponovo!");
					unos.nextLine();
				}
			}
		}
		
		//Pitaj korisnika da unese 5 brojeva u drugu listu
		System.out.println("Druga lista:");
		System.out.println("Unesite 5 brojeva:");
		for (int i = 0; i < 5; i++) {
			while (true) {
				try {
					lista2.add(unos.nextInt());
					break;
				} catch (InputMismatchException e) {
					System.out.println("Pogresan unos! Pokusajte ponovo!");
					unos.nextLine();
				}
			}
		}
		
		//Ispisi rezultat
		System.out.println("Unija dvije liste: ");
		for(int i: union(lista1, lista2))
			System.out.print(i + " ");

	}
	
	/**Vraca uniju dvije liste*/
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
		
		list1.addAll(list2);
		
		return list1;
		
	}

}
