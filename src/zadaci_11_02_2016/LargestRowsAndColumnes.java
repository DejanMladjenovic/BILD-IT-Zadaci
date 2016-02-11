package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LargestRowsAndColumnes {
	
	/*
	 * Write a program that randomly fills in 0s and 1s into an n-by-n matrix, 
	 * prints the matrix, and finds the rows and columns with the most 1s. 
	 * (Hint: Use two ArrayLists to store the row and column indices with the most 1s.)
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Pitaj korisnika za velicinu matrice
		System.out.println("Unesite velicinu matrice(a x a):");
		int broj;
		while(true){
			try{
				broj = unos.nextInt();
				break;
			}catch(InputMismatchException e){
			System.out.println("Pogresan unos! Pokusajte ponovo!");
			unos.nextLine();
			}
		}
		
		//Kreiraj matricu
		int[][] matrica = new int[broj][broj];

		generisanje(matrica);//Inicijalizuj matricu
		ispis(matrica);//ispisi matricu
		
		//Ispisi rezultat
		System.out.println("Red sa najvise jedinica: " + red(matrica));
		System.out.println("Kolona sa najvise jedinica: " + kolona(matrica));
		
	}
	
	/**Vraca red sa najvise jedinica*/
	public static ArrayList<Integer> red(int[][] m){
		
		ArrayList<Integer> red = new ArrayList<>();
		int max = 0;
		for(int i = 0; i < m.length; i++){
			int brojac = 0;
			for(int j = 0; j < m[0].length; j++){
				if(m[i][j] == 1)
					brojac++;
			}
			if(brojac > max){
				max = brojac;
				red.clear();
				red.add(i);
			}
			brojac = 0;
		}
		return red;
	}
	
	/**Vraca kolonu sa najvise jedinica*/
	public static ArrayList<Integer> kolona(int[][] m){
		
		ArrayList<Integer> kolona = new ArrayList<>();
		int max = 0;
		for(int i = 0; i < m.length; i++){
			int brojac = 0;
			for(int j = 0; j < m[0].length; j++){
				if(m[j][i] == 1)
					brojac++;
			}
			if(brojac > max){
				max = brojac;
				kolona.clear();
				kolona.add(i);
			}
			brojac = 0;
		}
		return kolona;
	}
	
	/**Metoda ispisuje matricu*/
	public static void ispis(int[][] m){
		
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[0].length; j++){
				System.out.print(m[i][j] + " ");
			}
			System.out.println();	
		}
	}
	
	/**Metoda inicijalizuje matricu*/
	public static void generisanje(int[][] m){
	
		for(int i = 0; i < m.length; i++)
			for(int j = 0; j < m[0].length; j++)
				m[i][j] = (int)(Math.random() * 2);
	}

}
