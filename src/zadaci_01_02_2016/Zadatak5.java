package zadaci_01_02_2016;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak5 {
	
	/*
	 * Napisati program koji uèitava 10 brojeva te ispisuje koliko je jedinstvenih brojeva unijeto 
	 * te sve jedinstvene brojeve koji su unijeti, razmaknute jednim spaceom. 
	 * Ukoliko se neki broj pojavljuje više puta, broj treba ispisati samo jednom
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Kreiraj listu brojeva
		ArrayList<Integer> lista = new ArrayList<>();
		
		//Izbaci pitanje korisniku da unese 10 brojeva
		System.out.println("Unesite 10 brojeva");
		for(int i = 0; i < 10; i++){
			System.out.print("Unesite " + (i + 1) + ". broj:");
			int broj = unos.nextInt();
			if(!lista.contains(broj)){
				lista.add(broj);
			}
		}
		
		//Ispisi rezultat
		System.out.println("\nUkupno jedinstvenih brojeva: " + lista.size());
		for(int i = 0; i < lista.size(); i++)
			System.out.print(lista.get(i) + " ");		
	}

}
