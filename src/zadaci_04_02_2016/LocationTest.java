package zadaci_04_02_2016;

/**
 * Naziv klase: LocationTest
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class LocationTest {
	
	/*
	 * Napisati test program koji pita korisnika da unese matricu
	 * i ispisuje lokaciju najveceg clana matrice
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		//IZbaci pitanje korisniku a unese broj redova matrice
		System.out.println("Unesite broj redova:");
		int red = unos.nextInt();
		
		//IZbaci pitanje korisniku a unese broj kolona matrice
		System.out.println("Unesite broj kolona:");
		int kol = unos.nextInt();
		
		//Kreiraj matricu
		double[][] m = new double[red][kol];
		System.out.println("Unesite clanove matrice:");
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
		//Ispis matrice
		System.out.println("Matrica:");
		ispis(m);
		
		//Kreiraj objekat
		Location d = Location.locateLargest(m);
		
		//Ispisi rezultat
		System.out.println("Lokacija najveceg elementa je " + d.maxValue + " na (" + d.row + ", " + d.column + ")");
		
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


}
