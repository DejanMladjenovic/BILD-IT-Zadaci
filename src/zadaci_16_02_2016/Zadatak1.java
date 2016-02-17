package zadaci_16_02_2016;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak1 {
	
	/*
	 * Write a program that converts the Java source code from the next-line brace style 
	 * to the end-of-line brace style. Your program can be invoked from the command line 
	 * with the Java sourcecode file as the argument. It converts the Java source code to a new format.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) throws IOException {

		if(args.length != 1){
			System.out.println("Koristite: java Zadatak1 nazivFajla");
			System.exit(1);
		}
		
		//Kreiraj fajl objekat
		File file = new File(args[0]);
		//Provjeri da li fajl vec postoji
		if(!file.exists()){
			System.out.println("Fajl ne postoji!");
			System.exit(2);
		}
		
		String string = "";
		//Kreiraj skener objekat
		Scanner unos = new Scanner(file);
		while(unos.hasNext()){
			string += unos.nextLine() + "\n";		
		}
		
		//Ukloni whitespace karaktere prije "{" 
		string = string.replaceAll("\\s*\\{", " {");
		
		//Kreiraj printwriter objekat
		try{
			PrintWriter output = new PrintWriter(file);
			output.println(string);
			output.close();
			System.out.println("Operacija uspjela!");
		}catch(IOException e){
			System.out.println("Greska!");
		}
	}
}
