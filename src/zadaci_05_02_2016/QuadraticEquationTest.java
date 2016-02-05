package zadaci_05_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**Naziv klase: QuadraticEquationTest
 * 
 * @author Dejan Mladjenovic
 */

public class QuadraticEquationTest {
	
	/*
	 * Write a test program that prompts the user to enter values for a,b, and c and displays 
	 * the result based on the discriminant. If the discriminant is positive, display the two roots. 
	 * If the discriminant is 0, display the one root. Otherwise, display “The equation has no roots.”
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese vrijednost a
		System.out.println("Unesite vrijednost a:");
		double a = unosBrojeva(unos);
		
		//Izbaci pitanje korisniku da unese vrijednost b
		System.out.println("Unesite vrijednost b:");
		double b = unosBrojeva(unos);
		
		//Izbaci pitanje korisniku da unese vrijednost c
		System.out.println("Unesite vrijednost c:");
		double c = unosBrojeva(unos);
		
		//Kreiraj objekat
		QuadraticEquation qe = new QuadraticEquation(a, b, c);
		
		//Ispisi rezultat
		if(qe.getDiscriminant() > 0){
			System.out.println("Root1: " + Math.round(qe.getRoot1() * 100) / 100d);
			System.out.println("Root2: " + Math.round(qe.getRoot2() * 100) / 100d);
		}else if(qe.getDiscriminant() == 0){
			System.out.println("Root: " + Math.round(qe.getRoot1() * 100) / 100d);
		}else
			System.out.println("The equation has no roots.");
	}
	
	/**Metoda obradjuje izuzetke double tipa*/
	public static double unosBrojeva(Scanner unos){
	
		while(true){
			try{
				return unos.nextDouble();
			}catch(InputMismatchException e){
				System.out.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}	
	}

}
