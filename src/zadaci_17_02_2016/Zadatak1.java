package zadaci_17_02_2016;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak1 {
	
	/*
	 * A university posts its employees’ salaries at http:// cs.armstrong.edu/liang/data/Salary.txt. 
	 * Each line in the file consists of a faculty member’s first name, last name, rank, and salary 
	 * Write a program to display the total salary for assistant professors, associate professors, 
	 * full professors, and all faculty, respectively, and display the average salary for 
	 * assistant professors, associate professors, full professors, and all faculty, respectively.
	 */
	
	public static void main(String[] args) throws IOException {

		//Kreiraj URL objekat
		URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(url.openStream());
		
		double[] salaries = new double[3];//Suma plata po pozicijama
		int[] counter = new int[3];//Brojac zaposlenih po pozicijama
		
		//Iscitaj podatke iz fajla
		while(unos.hasNext()){
			String name = unos.next();
			String surname = unos.next();
			String rank = unos.next();
			double salary = unos.nextDouble();
			if(rank.contains("assistant")){
				salaries[0] += salary;
				counter[0]++;
			}else if(rank.contains("associate")){
				salaries[1] += salary;
				counter[1]++;
			}else if(rank.contains("full")){
				salaries[2] += salary;
				counter[2]++;
			}
		}
		unos.close();
		
		//Izracunaj ukupan iznos potreban za plate
		double totalSalary = salaries[0] + salaries[1] + salaries[2];
		
		//Izracunaj ukupan broj uposlenih
		double totalCounter = counter[0] + counter[1] + counter[2];
		
		//Ispisi rezultat
		System.out.printf("Total assistant: %.2f\n", salaries[0]);
		System.out.printf("Total associate: %.2f\n", salaries[1]);
		System.out.printf("Total full: %.2f\n", salaries[2]);
		System.out.printf("Total faculty: %.2f\n", totalSalary);
		System.out.printf("Average assistant: %.2f\n", salaries[0] / counter[0]);
		System.out.printf("Average associate: %.2f\n", salaries[1] / counter[1]);
		System.out.printf("Average full: %.2f\n", salaries[2] / counter[2]);
		System.out.printf("Average faculty: %.2f\n", totalSalary / totalCounter);
	}
}
