package zadaci_16_02_2016;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak5 {
	
	/*
	 * Create a data file with 1,000 lines. Each line in the file consists of a faculty member’s first name, 
	 * last name, rank, and salary. The faculty member’s first name and last name for the ith line are 
	 * FirstNamei and LastNamei. The rank is randomly generated as assistant, associate, and full. 
	 * The salary is randomly generated as a number with two digits after the decimal point. 
	 * The salary for an assistant professor should be in the range from 50,000 to 80,000, 
	 * for associate professor from 60,000 to 110,000, and for full professor from 75,000 to 130,000. 
	 * Save the file in Salary.txt.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) throws IOException{

		//Kreiraj fajl objekat
		File file = new File("Salary.txt");
		//Provjeri da li fajl vec postoji
		if(file.exists()){
			System.out.println("Fajl vec postoji!");
			System.exit(0);
		}
		
		//Kreiraj objekat za unos podataka u fajl
		PrintWriter output = new PrintWriter(file);
		for(int i = 0; i < 1000; i++){
			String name = "FirstName" + (i + 1);//Ime
			String surname = "LastName" + (i + 1);//Prezime
			String s = rank();//Rank
			
			//Upisuj pdatke u fajl
			output.println(name + " " + surname + " " + s);			
		}
		output.close();	
	}
	
	/**Metoda vraca nasumicno odredjenu poziciju i visinu plate */
	public static String rank(){
		
		//Niz pozicija
		String[] ranks = {"assistant", "associate", "full     "};
		
		//Odredi nasumicno poziciju uposlenika
		String rank = ranks[(int)(Math.random() * 3)];
		
		//Odredi nasumicno visinu plate na osnovu pozicije
		double salary = 0;
		if(rank.equals("assistant"))
			salary = (double)(50000 + Math.random() * 30000);
		if(rank.equals("associate"))
			salary = (double)(60000 + Math.random() * 50000);
		if(rank.equals("full     "))
			salary = (double)(75000 + Math.random() * 55000);
		
		return rank + " " + String.format("%.2f", salary);	
	}
}
