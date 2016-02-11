package zadaci_10_02_2016;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Naziv klase: ShuffleArrayList
 * 
 * @author Dejan Mladjenovic
 */

public class ShuffleArrayList {
	
	/*
	 * Write the following method that shuffles the elements in an ArrayList of integers.
	 * -public static void shuffle(ArrayList<Integer> list)
	 */
	
	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj niz objekata Integer tipa
		Integer[] niz = {1, 2, 3, 4, 5, 6, 7, 8};
		
		//Kreiraj listu objekata od datog niza Integera
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(niz));
		
		//Ispisi listu prije sortiranja
		System.out.println("Lista prije sortiranja: \n" + list);
		
		//Izmijesaj clanove liste
		shuffle(list);
		
		//Ispisi listu nakon mijesanja
		System.out.println("Lista nakon sortiranja: \n" + list);
	}

	/**Metoda mijesa nasumicno clanove date liste*/
	public static void shuffle(ArrayList<Integer> list){
		
		for(int i = 0; i < list.size(); i++){
			int broj = list.get(i);
			list.remove(i);
			int index = (int)(Math.random() * list.size() - 1);
			list.add(index, broj);
		}
	}
}
