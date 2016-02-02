package zadaci_02_02_2016;

/**
 * Naziv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak2 {
	
	/*
	 * Napisati metodu koja vraca nasumucan broj od 1 do 54,
	 * iskljucujuci broj koji je proslijedjen kao argument
	 * public static int getRandom(int... numbers)
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Niz brojeva koji se prosljedjuju
		int[] numbers = {2, 4, 13, 17, 29, 32, 45, 50};
		
		//Ispisi rezultat
		System.out.println("Nasumican broj: " + getRandom(numbers));		
	}
	
	/**Metoda generise nasumican broj od 1 do 54
	 * iskljucujuci brojeve proslijedjene kao argumente*/ 
	public static int getRandom(int... numbers){
		
		int broj;
		while(true){
				broj = (int)(1 + Math.random() * 54);
				if(numbers.equals(broj))
					continue;
				break;		
		}
		return broj;
	}		
}
