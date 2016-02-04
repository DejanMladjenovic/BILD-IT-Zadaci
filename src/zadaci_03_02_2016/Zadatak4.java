package zadaci_03_02_2016;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Naziv klase: Zadatak4
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak4 {
	
	/*
	 * Napisati metodu koja sortira 2-dimenzionalni niz koristeci sledeci header:
	 * public static void sort(int[][] m)
	 * Metoda prvo sortira redove a zatim kolone 
	 * Na primjer, niz {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}} 
	 * ce biti sortiran kao {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj matricu
		int[][] m = { { 4, 2, }, { 1, 7, }, { 4, 5, }, { 1, 2, }, { 1, 1, }, { 4, 1, } };

		sort(m);//Sortiraj matricu
		
		//Ispisi rezultat
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[0].length; j++){
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}	
	}
	
	/**Metoda sortira matricu*/
	public static void sort(int[][] m){

		for(int i = 0; i < m.length - 1; i++){
			int[] niz = m[i];
			for(int j =i + 1; j < m.length; j++){
				if(m[i][0] > m[j][0]){
					niz = m[i];
					m[i] = m[j];
					m[j] = niz;
				}else if(m[i][0] == m[j][0]){
					if(m[i][1] > m[j][1]){
						niz = m[i];
						m[i] = m[j];
						m[j] = niz;
					}
				}
			}
		}	
	}
}
