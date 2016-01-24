package zadaci_24_01_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak3 {
	
	/*
	 * Napisati program koji ispisuje sve mogu�e kombinacije za biranje dva broja u rasponu od 1 do 7. 
	 * Tako�er, program ispisuje broj svih mogu�ih kombinacija.  Dakle, program treba da ispi�e sve mogu�e 
	 * parove brojeva u datom rasponu, krenuv�i sa 1 2, 1 3, 1 4, itd. Broj mogu�ih kombinacija je 21.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		int brojac = 0;//Brojac kombinacija
		
		//Ispisi kombinacije
		for(int i = 1; i < 8; i++){
			for(int j = i + 1; j < 8; j++){
				System.out.println(i + " " + j);
				brojac++;
			}
		}
		//Ukupno kombinacija
		System.out.println("Ukupno kombinacija: " + brojac);
		
	}

}
