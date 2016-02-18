package zadaci_17_02_2016;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak2 {
	
	/*
	 * Write a program that prompts the user to enter a file name and displays 
	 * the occurrences of each letter in the file. Letters are case-insensitive.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) throws IOException {

		//Kreiraj skener objekat za citanje iz konzole
		Scanner unos = new Scanner(System.in);
		
		//Pitaj korisnika da unese naziv fajla
		System.out.println("Unesite naziv fajla(npr src/zadaci_15_02_2016/file.txt):");
		File file;
		while(true){
			file = new File(unos.nextLine());
			//Provjeri da li fajl postoji
			if(!file.exists()){
				System.out.println("Fajl ne postoji! Pokusajte ponovo!");
				continue;
			}else
				break;
		}
		unos.close();

		//Brojac slova
		int[] brojac = new int[26];
		
		//Kreiraj skener objekat za citanje iz fajla
		unos = new Scanner(file);
		
		//Iscitaj podatke iz fajla
		try{
			while(unos.hasNextLine()){
				String line = unos.nextLine();
				for(int i = 0; i < line.length(); i++){
					char c = line.charAt(i);
					if(Character.isLetter(c))
						brojac[Character.toUpperCase(c) - 65]++;	
				}
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Greska u programu!");
		}
		unos.close();
		
		//Ispisi rezultat
		for(int i = 0; i < brojac.length; i++){
			System.out.println("Slovo " + (char)(i+'A') + " se ponavlja " + brojac[i] + " puta.");
		}
	}
}
