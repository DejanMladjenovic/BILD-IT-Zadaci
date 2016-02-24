package zadaci_24_02_2016;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak5 {
	
	/*
	 * Implement the following method using binary search. 
	 * public static <E extends Comparable<E>> int binarySearch(E[] list, E key)
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj niz Integera
		Integer[] list = {new Integer(4), new Integer(7), new Integer(9)};
		
		//Ispisi rezultat
		System.out.println("Broj 7 se nalazi na indeksu " + binarySearch(list, 7));
	}
	
	/**Ako clan postoji u nizu vraca njegov indeks, u suprotnom vraca -low - 1*/
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key){
		
		int low = 0;
		int high = list.length -1;
		while(high >= low){
			int mid = (high - low) / 2 + low;
			if(list[mid].compareTo(key) == 0)
				return mid;
			if(list[mid].compareTo(key) > 0)
				high = mid - 1;
			else
				low = mid + 1;
			
		}
		return -low - 1;
	}

}
