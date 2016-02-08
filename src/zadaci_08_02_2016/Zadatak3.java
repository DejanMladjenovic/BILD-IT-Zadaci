package zadaci_08_02_2016;

import java.math.BigInteger;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak3 {
	
	/*
	 * Write a program that finds five prime numbers 
	 * larger than Long.MAX_VALUE.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj objekat za pocetni broj
		BigInteger broj = BigInteger.valueOf(Long.MAX_VALUE);
		
		//Broji proste brojeve
		int brojac = 0;
		while(brojac < 5){
			if(broj.isProbablePrime(1)){
				System.out.println(broj);//Ispisi rezultat
				brojac++;
			}
			//Povecaj vrijednost objekta za 1 
			broj = broj.add(BigInteger.ONE);
		}
	}

}
