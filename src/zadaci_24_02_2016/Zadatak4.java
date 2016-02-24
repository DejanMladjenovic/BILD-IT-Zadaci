package zadaci_24_02_2016;

/**
 * Naziv klase: Zadatak4
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak4 {

	/*
	 * Write a generic method that returns the maximum element in a two-dimensional array.
	 * -public static <E extends Comparable<E>> E max(E[][] list)
	 */
	
	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj matricu
		Integer[][] matrix = {{2, 9, 3}, {7, 4, 8}};		
		
		//Ispisi rezultat
		System.out.println(max(matrix));		
	}
	
	/**Vraca najveci clan matrice*/
	public static <E extends Comparable<E>> E max(E[][] list){
		
		E max = list[0][0];
		for(int i = 0; i < list.length; i++){
			for(int j = 0; j < list[0].length; j++){
				if(list[i][j].compareTo(max) > 0)
					max = list[i][j];
			}
		}
		return max;
	}

}
