package zadaci_12_02_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: ConvexPolygon
 * 
 * @author Dejan Mladjenovic
 */

public class ConvexPolygon {

	/*
	 * A polygon is convex if it contains any line segments
	 * that connects two points of the polygon. Write a program that prompts the user to
	 * enter the number of points in a convex polygon, then enter the points clockwise,
	 * and display the area of the polygon.	
	 */
	
	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Kreiraj listu za tacke
		ArrayList<Double[]> list = new ArrayList<>();
		
		
		//Pitaj korisnika da unese broj tacaka
		System.out.println("Unesite broj tacaka:");
		int broj;
		while(true){
			try{
				broj = unos.nextInt();
				if(broj < 3){
					System.out.println("Pogresan broj! Pokusajte ponovo!");
					continue;
				}
				break;
			}catch(InputMismatchException e){
				System.out.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		//Pitaj korisnika da unese koordinate tacaka
		for(int i = 0; i < broj; i++){
			//Kreiraj niz za koordinate
			Double[] tacka = new Double[2];
			System.out.println("Unesite " + (i + 1) + " tacku:");
			System.out.print("Unesite x:");
			tacka[0] = unosDoubleBrojeva(unos);
			System.out.print("Unesite y:");
			tacka[1] = unosDoubleBrojeva(unos);
			list.add(tacka);
		}
		
		//Ispisi rezultat
		System.out.println("Ukupna povrsina: " + (Math.round(povrsina(list) * 1000) / 1000d));	
	}
	
	/**Metoda vraca povrsinu poligona*/
	public static double povrsina(ArrayList<Double[]> list){
		
		double povrsina = 0;
		for(int i = 0; i < list.size() - 1; i++){
			povrsina += (list.get(i)[0] * list.get((i + 1))[1]) - (list.get(i)[1] * list.get((i + 1))[0]);
		}
		povrsina += (list.get(list.size() - 1)[0] * list.get(0)[1]) - (list.get(list.size() - 1)[1] * list.get(0)[0]);
		
		return Math.abs(povrsina)/ 2;
	}
	
	/**Metoda obradjuje izuzetke double tipa*/
	private static double unosDoubleBrojeva(Scanner unos){
		
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
