package zadaci_15_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Naziv klase Zadatak4
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak4 {
	
	/*
	 * Write a program that will count the number of 
	 * characters, words, and lines in a file. 
	 * Words are separated by whitespace characters.
	 * The file name should be passed as a command-line argument
	 */

	/**Glavna metoda*/
	public static void main(String[] args) throws FileNotFoundException {
		
		//Kreiraj fajl objekat
		File file = new File(args[0]);

		//Provjeri unos argumenata
		if(args.length != 1) {
			System.out.println("Koristite: java Zadatak4 nazivFajla");
			System.exit(1);
		}
		
		//Provjeri da li trazeni fajl postoji
		if(!file.exists()){
			System.out.println("Fajl ne postoji!");
			System.exit(2);
		}		
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(file); 
		
		int lines = 0;//Broj linija
		int words = 0;//Broj rijeci
		int chars = 0;//Broj karaktera
		//Iscitaj podatke iz fajla
		while(unos.hasNextLine()){
			String line = unos.nextLine();
			lines ++;
			words += line.split(" ").length;
			chars += line.length();
		}
		unos.close();
		
		//Ispisi rezultat
		System.out.println("Fajl " + file.getName() + " sadrzi:");
		System.out.println("redova: " + lines);
		System.out.println("rijeci: " + words);
		System.out.println("karaktera: " + chars);			
	}

}
