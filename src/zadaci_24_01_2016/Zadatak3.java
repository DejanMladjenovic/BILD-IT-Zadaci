package zadaci_24_01_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak3 {
	
	/*
	 * Napisati program koji ispisuje sve moguæe kombinacije za biranje dva broja u rasponu od 1 do 7. 
	 * Takoðer, program ispisuje broj svih moguæih kombinacija.  Dakle, program treba da ispiše sve moguæe 
	 * parove brojeva u datom rasponu, krenuvši sa 1 2, 1 3, 1 4, itd. Broj moguæih kombinacija je 21.
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
