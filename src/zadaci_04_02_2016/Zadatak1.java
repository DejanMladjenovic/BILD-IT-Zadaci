package zadaci_04_02_2016;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak1 {
	
	/*
	 * Implementirati metodu koja sortira redove u 2D nizu i vraca sortiran niz.
	 * Koristite sleeci header: public static double[][] sortRows(double[][] m)
	 * Napisati test program koji pita korisnika da unese 3 x 3 matricu 
	 * i ispisuje u konzoli sortirani matricu 
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Kreiraj matricu
		double[][] m = new double[3][3];		
		
		//Izbaci pitanje korisniku da unese 3 x 3 matricu		
		System.out.println("Unesite clanove u matricu 3 x 3:");
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[0].length; j++){
				while(true) {
					try{
						m[i][j] = unos.nextDouble();
						break;
					}catch (Exception e) {
						System.out.println("Pogresan unos! Pokusajte ponovo!");
						unos.nextLine();
					}
				}
			}
		}
		
		//Ispisi rezultat
		System.out.println("Matrica prije sortiranja:");
		ispis(m);
		
		System.out.println("Matrica nakon sortiranja:");
		sortRows(m);
		ispis(m);
		
		unos.close();
	}
	
	/**Metoda ispisuje matricu*/
	public static void ispis(double[][] m){
		
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[0].length; j++){
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/**Metoda sortira redove matrice*/
	public static double[][] sortRows(double[][] m){

		for(int i = 0; i < m.length; i++){
			Arrays.sort(m[i]);			
		}
		return m;
		
	}
}
