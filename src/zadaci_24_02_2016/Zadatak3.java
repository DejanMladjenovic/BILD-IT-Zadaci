package zadaci_24_02_2016;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak3 {
	
	/*
	 * Implement the following method that returns the maximum element in an array.
	 * -public static <E extends Comparable<E>> E max(E[] list)
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj niz Integera
		Integer[] array = {new Integer(3), new Integer(9), new Integer(5)};
		
		//Ispisi niz
		System.out.print("Niz: ");
		for(Integer e: array){
			System.out.print(e + " ");
			
		}
		System.out.println("\nNajveci clan: " + max(array));
	}

	/**Vraca najveci clan niza*/
	public static <E extends Comparable<E>> E max(E[] list){
		
		E max = list[0];
		for(int i = 1; i < list.length; i++){
			if(list[i].compareTo(max) > 0){
				max = list[i];
			}
		}
		return max;
	}
}
