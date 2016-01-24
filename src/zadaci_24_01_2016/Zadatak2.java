package zadaci_24_01_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak2 {
	
	/*
	 *  Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. 
	 *  Na primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su takoðer twin primes. 
	 *  Napisati program koji ispisuje sve twin prime brojeve manje od 10000, 10 parova po liniji.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//ispisi poruku
		System.out.println("Twin prime brojevi:");
		int brojac = 0;//Brojac kombinacija
		
		//Prodji kroz zadati niz
		for(int i = 2; i < 9998; i++){
			if(isPrime(i) && isPrime(i + 2)){
				brojac++;
				//ispisi rezultat
				if(brojac % 10 == 0)
					System.out.println(i + " i " + (i + 2) + ", ");
				else
					System.out.print(i + " i " + (i + 2) + ", ");
			}
		}
	}
	
	/**Metoda vraca true ako je broj prost*/
	public static boolean isPrime(int number){
		
		for(int i = 2; i < number; i++){
			if(number % i == 0)
				return false;
		}
		return true;
	}

}
