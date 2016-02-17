package zadaci_16_02_2016;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak3 {
	
	/*
	 * Write a program that counts the number of words in President Abraham Lincoln’s 
	 * Gettysburg address from http://cs.armstrong.edu/liang/data/Lincoln.txt.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) throws IOException {

		//Kreiraj URL objekat
		URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(url.openStream());
		
		//Brojac rijeci
		int words = 0;
		
		//Iscitaj podatke iz fajla
		while(unos.hasNext()){
			String word = unos.next();
			int brojac = 0;
			//Provjeri da li unos sadrzi slovo ili broj
			for(int i = 0; i < word.length(); i++){
				if(Character.isLetterOrDigit(word.charAt(i)))
					brojac++;		
			}
			if(brojac > 0)
				words ++;
			brojac = 0;
		}
		unos.close();
		
		//Ispisi rezultat
		System.out.println("Fajl sadrzi " + words + " rijeci.");
		
	}

}
