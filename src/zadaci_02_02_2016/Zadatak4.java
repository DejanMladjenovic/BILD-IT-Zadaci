package zadaci_02_02_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak4
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak4 {
	
	/*
	 * Napisati metodu koja vraca sumu clanova odredjene kolone u matrici korosteci sesledecim headerom:
	 * public static double sumColumn(double[][] m, int columnIndex).
	 * Napisati test program koji cita matricu 3 x 4 i ispisuje sumu svake kolone.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Kreiraj matricu
		double[][] m = new double[3][4];
		
		System.out.println("Unesite clanove u matricu 3 x 4:");
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[0].length; j++){
				try{
				m[i][j] = unos.nextDouble();
				}catch(Exception e){
					System.out.println("Pogresan unos! Pokusajte ponovo!");
					unos.nextLine();
				}
			}
		}
		
		//Ispisi matricu
		System.out.println("Matrica:");
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[0].length; j++){
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		//Ispisi rezultat
		System.out.println();
		for(int i = 0; i < m[0].length; i++){
			System.out.println("Suma elemenata " + (i + 1) + ". kolone je " + sumColumn(m, i));
		}
		unos.close();
	}
	
	/**Metoda vraca zbir clanova date kolone u matrici*/
	public static double sumColumn(double[][] m, int columnIndex){
		
		double zbir = 0;
		for(int i = 0; i < m.length; i++){
			zbir += m[i][columnIndex];	
		}
		return zbir;
	}

}
