package zadaci_15_02_2016;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



/**
 * Naziv klase Zadatak3
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak3 {
	
	/*
	 * Write a program that removes all the occurrences of a specified string from a text file. 
	 * For example, invoking "java Exercise12_11 John filename"
	 * removes the string John from the specified file. 
	 * Your program should get the arguments from the command line.
	 */

	public static void main(String[] args) throws IOException {	

		//Kreiraj fajl objekat
		File file = new File(args[1]);
		
		//Provjeri unos argumenata
		if(args.length != 2) {
			System.out.println("Koristite: java Zadatak3 string nazivFajla");
			System.exit(1);
		}
		
		//Provjeri da li trazeni fajl postoji
		if(!file.exists()){
			System.out.println("Fajl ne postoji!");
			System.exit(2);
		}
		
		//Kreiraj skener objekat za citanje iz fajla
		Scanner unos1 = new Scanner(file);
		
		//Prikazi podatke iz fajla
		while(unos1.hasNext()){
			System.out.print(unos1.nextLine());
		}
		
		//Naziv stringa za brisanje
		String rijec = args[0];
		
		//Prazan string za zamjenu
		String str = null;
		
		//Iscitaj podatke i ukloni datu rijec iz fajla
		unos1 = new Scanner(file);
		while(unos1.hasNext()){
			str = unos1.nextLine();
			str = str.replaceAll(rijec, "");
		}
		
		//Upisi nove podatke u fajl
		PrintWriter output = new PrintWriter(file);
		output.print(str);
		System.out.println(str);
		output.close();
		
	}
}