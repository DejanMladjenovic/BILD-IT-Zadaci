package zadaci_05_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: IntersectingPoint
 * 
 * @author Dejan Mladjenovic
 */

public class IntersectingPoint {
	
	/*
	 * The two endpoints for the first line segment are (x1, y1) and (x2, y2) 
	 * and for the second line segment are (x3,y3) and (x4,y4). Write a program that prompts 
	 * the user to enter these four endpoints and displays the intersecting point.
	 * The intersecting point of the two lines can be found by solving the following linear equation:
	 * (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
	 * (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		// Kreiraj objekat
		Scanner unos = new Scanner(System.in);

		// Uzmite podatke od korisnika
		System.out.println("Unesite x1:");
		double x1 = unosBrojeva(unos);
		System.out.println("Unesite y1:");
		double y1 = unosBrojeva(unos);

		System.out.println("Unesite x2:");
		double x2 = unosBrojeva(unos);
		System.out.println("Unesite y2:");
		double y2 = unosBrojeva(unos);

		System.out.println("Unesite x3:");
		double x3 = unosBrojeva(unos);
		System.out.println("Unesite y3:");
		double y3 = unosBrojeva(unos);

		System.out.println("Unesite x4:");
		double x4 = unosBrojeva(unos);
		System.out.println("Unesite y4:");
		double y4 = unosBrojeva(unos);

		//Izracunaj parametre objekta
		double a = y1 - y2;
		double b = x1 - x2;
		double c = y3 - y4;
		double d = x3 - x4;
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		
		// Kreiraj objekat
		LinearEquation le = new LinearEquation(a, b, c, d, e, f);

		// Ispisi rezultat
		if (le.isSolvable())
			System.out.println("The intersectin point is at (" + le.getX()
					+ ", " + le.getY() + ")");
		else
			System.out.println("The two lines are parallel");

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
