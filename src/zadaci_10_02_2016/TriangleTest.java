package zadaci_10_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: TriangleTest
 * 
 * @author Dejan Mladjenovic
 */

public class TriangleTest {
	
	/*
	 * Write a test program that prompts the user to enter three
	 * sides of the triangle, a color, and a Boolean value to indicate whether the triangle
	 * is filled. The program should create a Triangle object with these sides and set
	 * the color and filled properties using the input. The program should display
	 * the area, perimeter, color, and true or false to indicate whether it is filled or not.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Pitaj korisnika da unese prvu stranu
		System.out.println("Unesite prvu stranu trougla:");
		double strana1 = unosBrojeva(unos);
		
		//Oitaj korisnika da unse drugu stranu
		System.out.println("Unesite drugu stranu trougla:");
		double strana2 = unosBrojeva(unos);
		
		//Pitaj korisnikda da unese trecu stranu
		System.out.println("Unesite trecu stranu trougla:");
		double strana3 = unosBrojeva(unos);
		
		//Pitaj korisnika da unese boju
		System.out.println("Unesite boju: ");
		String boja = unos.next();
		
		//Pitaj korisnika da potvrdi da li je trougao popunjen
		System.out.println("Da li je trougao popunjen(za potvrdu unesite \"da\"):");
		String popunjen = unos.next();
		boolean da = false;;
		if(popunjen.equals("da")){
			da = true;
		}

		//Kreiraj objekat
		Triangle t = new Triangle(strana1, strana2, strana3, boja, da);
		
		//Ispisi rezultat
		System.out.println(t.toString());
		System.out.println("Obim: " + t.getPerimeter());
		System.out.println("Povrsina: " + t.getArea());
		System.out.println("Boja: " + t.getColor());
		System.out.println("Popunjen: " + t.isFilled());
		
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
