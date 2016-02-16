package zadaci_15_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase Zadatak5
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak5 {
	
	/*
	 * Suppose that a text file contains an unspecified number of scores separated by blanks. 
	 * Write a program that prompts the user to enter the file, reads the scores from the file, 
	 * and displays their total and average.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) throws FileNotFoundException {

		//Kreiraj skener objekat za unos sa konzole
		Scanner unos = new Scanner(System.in);
		
		//Pitaj korisnika da unese fajl
		System.out.println("Izaberite fajl(npr: src/zadaci_15_02_2016/scores.txt):");
		
		File file;//Kreiraj fajl objekat
		
		//Provjeri da li trazeni fajl postoji
		while(true){
			file = new File(unos.nextLine());
			if(!file.exists()){
				System.out.println("Fajl ne postoji! Pokusajte ponovo!");
				continue;
			}else
				break;
		}
		unos.close();
		
		int zbir = 0;//Zbir brojeva
		int brojac = 0;//Brojac brojeva
		
		//Kreiraj skener objekat za citanje iz fajla
		unos = new Scanner(file);
		
		//Iscitaj podatke iz fajla
		System.out.print("Brojevi: ");
		while(unos.hasNext()){
			try{
				int broj = unos.nextInt();
				zbir += broj;
				brojac++;
				System.out.print(broj + " ");
			}catch(InputMismatchException e){
				unos.next();
				continue;
			}
		}
		unos.close();
		//izracunaj prosjek
		double prosjek = (double)zbir / brojac;
		
		//Ispisi rezultat
		System.out.println("\nZbir brojeva: " + zbir);
		System.out.println("Prosjek brojeva: " + prosjek);
	}

}
