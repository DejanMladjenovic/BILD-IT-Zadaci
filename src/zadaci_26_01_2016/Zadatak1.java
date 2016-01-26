package zadaci_26_01_2016;

import java.util.Random;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak1 {
	
	/*
	 * Pretpostavimo da se registarska tablica za auto sastoji od tri uppercase karaktera i 4 broja 
	 * u sljedeæem formatu AAA-1234. Napisati program koji nasumièno generiše tablicu.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj niz clanova tablice
		char[] tablica = new char[8];
		
		//Upisi podatke u svaki clan niza
		tablica[0] = karakter('A', 'Z');
		tablica[1] = karakter('A', 'Z');
		tablica[2] = karakter('A', 'Z');
		tablica[3] = '-';
		tablica[4] = karakter('0', '9');
		tablica[5] = karakter('0', '9');
		tablica[6] = karakter('0', '9');
		tablica[7] = karakter('0', '9');

		//Ispisi rezultat
		System.out.println("Tablica:");
		System.out.println(tablica);
	
		
	}
	
	/**Vraca nasumicni karakter izmedju dva karaktera*/
	public static char karakter(char k1, char k2){
		
		return (char)(k1 + Math.random() * (k2 - k1 + 1));
	}

}
