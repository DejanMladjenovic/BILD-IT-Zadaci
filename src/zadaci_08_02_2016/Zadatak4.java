package zadaci_08_02_2016;

import java.math.BigInteger;

/**
 * Naziv klase: Zadatak4
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak4 {
	
	/*
	 * A prime number is called a Mersenne prime if it can be writtenin the form 2p - 1 
	 * for some positive integer p. Write a program that findsall Mersenne primes with p … 100 
	 * and displays the output as shown below.
	 * (Hint: You have to use BigInteger to store the number, because it is too big to
	 * be stored in long. Your program may take several hours to run.)
	 *  p   2^p – 1
	 *  2     3
	 *  3     7
	 *  5     31
	 */	

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Brojac prolazi kroz prvih 100 brojeva
		for(int i = 1; i <= 100; i++){
			//Kreiraj objekat eksponenta
			BigInteger dva = new BigInteger("2");

			//Dodaj eksponent svakom objektu od broja 1 do 100
			BigInteger broj = dva.pow(i);
			
			//Kreiraj  Mersene objekat
			BigInteger mersene = broj.subtract(BigInteger.ONE);
			
			//Ako je vrijednost Mersene objekta prost broj ispisi ju
			if(mersene.isProbablePrime(1)){
				System.out.println(i + "  " + mersene);
			}	
		}
	}

}
