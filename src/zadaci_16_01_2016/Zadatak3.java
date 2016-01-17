package zadaci_16_01_2016;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 * 
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Zadatak3 {
	
	/*
	 * Napisati program koji æe brojati broj karaktera, rijeèi i linija teksta u nekom fileu. 
	 * Rijeèi trebaju biti odvojene jednim spaceom. Ime filea proslijediti kao argument u program.
	 */

	//Glavna metoda
	public static void main(String[] args) throws IOException{

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);           
		
		//Izbaci pitanje korisniku da unese naziv fajla
		System.out.println("Unesite naziv fajla: ");
		String nazivFajla = unos.next();

		//Kreiraj fajl objekat
		File fajl = new File("src/zadaci_16_01_2016/" + nazivFajla + ".txt");
        		 
		int rijeci = 0;
		int linije = 0;
		int karakteri = 0;
		
		//Iscitaj podatke iz fajla
		try{
			Scanner unos1 = new Scanner(fajl);
			while(unos1.hasNextLine()){
				linije++;
				String line = unos1.nextLine();
				for(int i = 0 ; i < line.length(); i++){
					if(line.charAt(i) != ' ' && line.charAt(i) != '\n')
						karakteri ++;
				}
				rijeci += new StringTokenizer(line, " ").countTokens();
			}
			unos1.close();
		}catch (Exception e){
			System.err.println("Trazeni fajl ne postoji!");
			System.exit(1);
		}
		
		//Ispisi rezultate
		System.out.println("Broj linija: " + linije);
		System.out.println("broj rijeci: " + rijeci);
		System.out.println("Broj karaktera: " + karakteri);
		
		unos.close();
		
	}
}
