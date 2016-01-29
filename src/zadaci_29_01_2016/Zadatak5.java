package zadaci_29_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak5 {
	
	/*
	 * Napisati metodu koja ispisuje n x n matricu koristeæi se sljedeæim headerom: 
	 * public static void printMatrix(int n). Svaki element u matrici je ili 0 ili 1, nasumièno generisana. 
	 * Napisati test program koji pita korisnika da unese broj n te mu ispiše n x n matricu u konzoli.
	 */

	public static void main(String[] args) {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese velicinu matrice
		System.out.println("Unesite velicinu matrice:");
		int broj;
		while (true) {
			try {
				broj = unos.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		//Ispisi rezultat
		System.out.println("Matrica:");
		printMatrix(Math.abs(broj));
	}
	
	/**Metoda ispisuje matricu u zadatoj velicini,
	 * nasumicno, brojevima 0 i 1*/
	public static void printMatrix(int n){
		
		int[][] matrica = new int[n][n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				matrica[i][j] = (int)(Math.random() * 2);
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
	}

}
