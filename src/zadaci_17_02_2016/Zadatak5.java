package zadaci_17_02_2016;

import java.util.ArrayList;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak5 {
	
	/*
	 * Write the following method that sorts an ArrayList of numbers.
	 * -public static void sort(ArrayList<Number> list)
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj listu brojeva
		ArrayList<Number> list = new ArrayList<>();
		list.add(15);
		list.add(4);
		list.add(12.7);
		list.add(-3.6);
		
		//Ispisi rezultat
		System.out.println("Lista prije sortiranja: " + list);
		sort(list);
		System.out.println("Lista nakon sortiranja: " + list);
	}
	
	/**Metoda sortira brojeve u listi*/
	public static void sort(ArrayList<Number> list){
		
		Number temp = 0;
		for(int i = 0; i < list.size() - 1; i++){
			for(int j = i +1; j < list.size(); j++)
			if(list.get(i).doubleValue() > list.get(j).doubleValue()){
				temp = list.get(i);
				list.set(i, list.get(j));
				list.set(j, temp);
			}		
		}
	}
}
