package zadaci_24_02_2016;

import java.util.ArrayList;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak1 {
	
	/*
	 * Write the following method that returns a new ArrayList. 
	 * The new list contains the non-duplicate elements from the original list.
	 * -public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj listu
		ArrayList<Integer> list = new ArrayList<>();
		//Dodaj brojeve u listu
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(6);
		list.add(1);
		list.add(4);
		
		//Ispisi listu
		System.out.println("Originalna lista: " + list);
		
		//Ispisi rezultat
		System.out.println("Lista bez duplikata: " + removeDuplicates(list));
	}

	/**Vraca listu bez duplih elemenata*/
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
		
		ArrayList<E> list1 = new ArrayList<>();
		for(int i = 0; i < list.size(); i++){
			if(!list1.contains(list.get(i)))
				list1.add(list.get(i));
		}
		return list1;
	}
}
