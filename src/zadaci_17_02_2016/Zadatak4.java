package zadaci_17_02_2016;

import java.util.ArrayList;

/**
 * Naziv klase: Zadatak4
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak4 {
	
	/*
	 * Write the following method that shuffles an ArrayList of numbers:
	 * -public static void shuffle(ArrayList<Number> list)
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj listu brojeva
		ArrayList<Number> list = new ArrayList<>();
		list.add(-3.6);
		list.add(4);
		list.add(12.7);
		list.add(15);
		
		//Ispisi rezultat
		System.out.println("Lista prije mijesanja: " + list);
		shuffle(list);
		System.out.println("Lista nakon mijesanja: " + list);
		
	}
	
	/**Metoda nasumicno mijesa brojeve u listi*/
	public static void shuffle(ArrayList<Number> list){
		
		Number temp = 0;
		for(int i = 0; i < list.size() - 1; i++){
			int j = (int)(Math.random() * (list.size()));
			temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
					
				
			
		}
		
	}

}
