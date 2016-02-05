package zadaci_05_02_2016;

/**
 * Naziv klase: LinearEquationTest
 * 
 * @author Dejan Mladjenovic
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class LinearEquationTest {
	
	/*
	 * Write a test program that prompts the user to enter 
	 * a,b,c,d,e, and f and displays the result. 
	 * If ad - bc  is 0, report that “The equation has no solution.”
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		//Kreiraj niz karaktera
		char[] karakteri = {'a', 'b', 'c', 'd', 'e', 'f'};
		
		//Unesi podatke od korisnika
		double[] brojevi = new double[karakteri.length];
		for(int i = 0; i < karakteri.length; i++){
			System.out.println("Unesite " + karakteri[i] + ":");
			while(true){
				try{
					brojevi[i] = unos.nextDouble();
					break;
				}catch(InputMismatchException e){
					System.out.println("Pogresan unos! Pokusajte ponovo!");
					unos.nextLine();
				}
			}
		}
		
		//Kreiraj objekat
		LinearEquation le = new LinearEquation(brojevi[0],brojevi[1],brojevi[2],brojevi[3],
				brojevi[4],brojevi[5]);
		
		//Ispisi rezultat
		if(le.isSolvable()){
			System.out.println("X: " + Math.round(le.getX() * 100) / 100d);
			System.out.println("Y: " + Math.round(le.getY() * 100) / 100d);
		}else{
			System.out.println("The equation has no solution.");
		}				
	}	
}
