package zadaci_02_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak5 {
	
	/*
	 * Napisati metodu koja sabira 2 matrice koje korisnik unese. Metoda treba da koristi sljedeæi header:
	 * public static double[ ][ ] addMatrix(double[ ][ ] a, double[ ][ ] b)
	 * Da bi dvije matrice bile sabrane, moraju biti istih dimenzija i istog ili kompatibilnog tipa elemenata.
	 * Rezultat sabiranja matrica pohraniti u treæu matricu, matricu c, i ispisati korisniku rezultat.
	 * Napisati test program koji pita korisnika da unese dvije matrice 3 x 3 i ispisuje njihov zbir.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese prvu matricu
		System.out.println("Unesite clanove prve matrice(3 x 3):");
		double[][] a = new double[3][3];
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++){
				a[i][j] = unosBrojeva(unos);
			}
		}
		
		//Izbaci pitanje korisniku da unese drugu matricu
		System.out.println("Unesite clanove druge matrice(3 x 3):");
		double[][] b = new double[3][3];
		for(int i = 0; i < b.length; i++){
			for(int j = 0; j < b[0].length; j++){
				b[i][j] = unosBrojeva(unos);
			}
		}
		
		//Kreiraj trecu matricu kao zbir prve dvije
		double[][] c = addMatrix(a, b);
		
		//Ispisi rezultat
		ispis(a);
		System.out.println("    +");
		ispis(b);
		System.out.println("    =");
		ispis(c);
		
		unos.close();
	}
	
	/**Metoda vraca zbir dvije matrice*/
	public static double[][] addMatrix(double[][] a, double[][] b){
		
		double[][] m = new double[a.length][a[0].length];
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				m[i][j] = a[i][j] + b[i][j];
			}
		}
		return  m;
	}
	
	/**Metoda obradjuje izuzetke double tipa*/
	private static double unosBrojeva(Scanner unos){
		
		while(true){
			try{
				return unos.nextDouble();
			}catch(InputMismatchException e){
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
	}
	
	/**Metoda ispisuje matricu*/
	public static void ispis(double[][] m){
		
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
}
