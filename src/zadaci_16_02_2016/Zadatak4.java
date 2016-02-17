package zadaci_16_02_2016;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak14
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak4 {
	
	/*
	 * Suppose that the text file on the Web http://cs.armstrong.edu/liang/data/Scores.txt 
	 * contains an unspecified number of scores. Write a program that reads the scores 
	 * from the file and displays their total and average. Scores are separated by blanks.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) throws IOException{

		//Kreiraj URL objekat
		URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(url.openStream());
		
		int zbir = 0;//Zbir brojeva
		int brojac = 0;//Brojac brojeva
		
		//Ucitaj podatke iz fajla
		System.out.println("Brojevi:");
		while(unos.hasNext()){
			int broj = unos.nextInt();
			zbir += broj;
			brojac++;
			System.out.print(broj + " ");
		}
		unos.close();
		
		//izracunaj prosjek
		double prosjek = (double)zbir / brojac;
		
		//Ispisi rezultat
		System.out.println("\nZbir brojeva: " + zbir);
		System.out.printf("Prosjek brojeva: %4.2f", prosjek);	
		}
}
