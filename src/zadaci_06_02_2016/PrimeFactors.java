package zadaci_06_02_2016;

/**
 * Naziv klase: PrimeFactors
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class PrimeFactors {
	
	/*
	 * Write a program that prompts the user to enter
	 * a positive integer and displays all its smallest factors in decreasing order. For
	 * example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2, 2.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese broj
		System.out.println("Molimo unesite pozitivan cijeli broj:");
		 int number;
		while(true){
			try{
				number = unos.nextInt();
				if(number < 1){
					System.out.println("Pogresan unos! Pokusajte ponovo!");
					continue;
				}else if(number == 1){
					System.out.println("Najmanji faktor broja 1 je: \n1");
					System.exit(0);
				}
				break;
			}catch(Exception e){
				System.out.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		//Kreiraj skladisni objekat
		StackOfIntegers stack = new StackOfIntegers();
		
		//Ispisi poruku
		System.out.println("Najmanji faktori broja " + number + " su:");
		
		//Izracunaj najmanje faktore datog broja i unesi u skladiste
		int factor = 2;
		while(number != 1){
			if(number % factor == 0){
				stack.push(factor);
				number /= factor;
			}else{
				factor++;
			}
		}

		//Ispisi rezultat
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}	
	}
}
