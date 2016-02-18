package zadaci_17_02_2016;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak3 {
	
	/*
	 * The popularity ranking of baby names from years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames 
	 * and stored in files named babynameranking2001.txt, babynameranking2002.txt, . . . , babynameranking2010.txt. 
	 * Each file contains one thousand lines. Each line contains a ranking, a boy’s name, number for the boy’s name, 
	 * a girl’s name, and number for the girl’s name. Write a program that prompts the user to enter the year, 
	 * gender, and followed by a name, and displays the ranking of the name for the year.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) throws IOException {

		//Kreiraj skener objekat za unos iz konzole
		Scanner unos = new Scanner(System.in);
		
		//Pitaj orisnika da unese godinu
		System.out.println("Unesite godinu(2010-2014):");
		int godina; 
		while(true){
			try{
				godina = unos.nextInt();
				if(godina < 2010 || godina > 2013){
					System.out.println("Ne postoje podaci za datu godinu! Pokusajte ponovo!");
					continue;
				}
				break;
			}catch(InputMismatchException e){
				System.out.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		//Pitaj korisnika da unese pol
		System.out.println("Izaberite pol(M za muski i F za zenski):");
		String p;
		char pol;
		while(true){
			p = unos.next();
			pol = p.toUpperCase().charAt(0);
			if(pol == 'M' || pol == 'F')
				break;
			else
				System.out.println("Pogresan unos! Pokusajte ponovo!");
		}
		//Pitaj korisnika da unese ime
		System.out.println("Izaberite ime: ");
		String ime = unos.next().toUpperCase();
		
		//Kreiraj fajl objekat
		File file = new File("src/zadaci_17_02_2016/babynameranking" + godina + ".txt");
		if(!file.exists()){
			System.out.println("Fajl ne postoji!");
			System.exit(0);
		}
		unos.close();
		
		String imeIspis = "";//Ime za ispis
		String rank = "";//Rank za dato ime
		//Kreiraj skener objekat za unos iz fajla
		unos = new Scanner(file);
		//Iscitaj podatke iz fajla
		while(unos.hasNextLine()){
			String[] s = unos.nextLine().split("\\s+");
			rank = s[0];
			if(pol == 'M'){
				if(s[1].equalsIgnoreCase(ime)){
					imeIspis = s[1];
					break;
				}
			}else if(pol == 'F'){
				if(s[3].equalsIgnoreCase(ime)){
					imeIspis = s[3];
					break;	
				}
			}
		}
		//Ispisi rezultat
		if(imeIspis.length() != 0)
			System.out.println(imeIspis + " je rankirano #" + rank + " u godini " + godina);
		else
			System.out.println("Ime " + ime + " nije rankirano u godini " + godina);
	}
}
