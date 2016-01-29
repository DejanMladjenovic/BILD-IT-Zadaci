package zadaci_29_01_2016;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak3 {
	
	/*
	 * Napisati program koji sabira sljedeæu seriju 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Ukupan zbir
		double zbir = 0;
		
		//Prodji kroz niz i izracunaj zbir
		for(int i = 1, j = 3; i < 98; i += 2, j +=2){
			zbir +=(double) i / j;
		}

		//Ispisi rezultat
		System.out.println("Zbir je: " + zbir);
	}

}
