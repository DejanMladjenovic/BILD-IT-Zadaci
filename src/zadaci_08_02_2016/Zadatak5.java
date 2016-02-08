package zadaci_08_02_2016;

import java.math.BigInteger;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak5 {
	
	/*
	 * Find the first ten numbers greater than Long.MAX_VALUE 
	 * that are divisible by 5 or 6.
	 */
	
	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreirarj objekat za pocetni broj
		BigInteger broj = BigInteger.valueOf(Long.MAX_VALUE);
		
		//BigInteger broj 5
		BigInteger pet = new BigInteger("5");

		//BigInteger broj 6
		BigInteger sest = new BigInteger("6");
		
		//Broji brojeve djeljive sa 5 ili sa 6
		int brojac = 0;
		while(brojac < 10){
			//Ostatak dijeljenja datog broja sa 5
			BigInteger moduloPet = broj.remainder(pet);
			
			//Ostatak dijeljenja datog broja sa 6
			BigInteger moduloSest = broj.remainder(sest);
			
			//Ako broj ispunjava uslov ispisi ga
			if(moduloPet == BigInteger.ZERO || moduloSest == BigInteger.ZERO){
				System.out.println(broj);
				brojac++;
			}
			//Povecaj vrijednost objekta za 1 vise
			broj = broj.add(BigInteger.ONE);
		}
	}

}
