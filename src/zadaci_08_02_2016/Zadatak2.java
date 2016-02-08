package zadaci_08_02_2016;

import java.math.BigInteger;

/**
 * Naziv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak2 {
	
	/*
	 * Find the first ten square numbers that are greater than Long.MAX_VALUE. 
	 * A square number is a number in the form of n2. For example, 4, 9, and 16 are square numbers. 
	 * Find an efficient approach to run your program fast.
	 */
	
	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj objekat za pocetni broj
		BigInteger kvadratniBroj = BigInteger.valueOf(Long.MAX_VALUE);
		
		//Kreiraj objekat za korijen odredjenog broja
		BigInteger korijen = new BigInteger(String.format("%.0f", Math.sqrt(Long.MAX_VALUE)));
		
		//Pronadji prvih deset brojeva koji ispunjavaju uslov
		int brojac = 0;
		while(brojac < 10){
			//Ako broj ispunjava uslov ispisi ga
			if(korijen.multiply(korijen).compareTo(kvadratniBroj) >= 0){
				System.out.println(korijen.multiply(korijen));
				brojac++;
			}
			//Povecaj vrijednost objekta za 1
			korijen = korijen.add(BigInteger.ONE);
		}
		
	}

}
