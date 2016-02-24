package zadaci_24_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak2 {
	
	/*
	 * Implement the following generic method for linear search.
	 * public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Pitaj korisnika da unese cijeli broj
		System.out.println("Unesite cijeli broj:");
		int broj;
		while(true){
			try{
				broj = unos.nextInt();
				break;
			}catch(InputMismatchException e) {
				System.out.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}

		//Kreiraj niz Integera
		Integer[] list = {new Integer(5), new Integer(7), new Integer(2)};
		
		//Ispisi rezultat
		if(linearSearch(list, broj) >= 0)
			System.out.println("Broj " + broj + " se nalazi na indeksu " + linearSearch(list, broj));
		else
			System.out.println("Broj " + broj + " se ne nalazi u nizu");
		
	}
	
	/**Ako dati clan postoji u nizu vraca indeks tog clana, u suprotnom vraca -1*/
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key){
		
		for(int i = 0; i < list.length; i++){
			if(list[i].compareTo(key) == 0)
				return i;
		}
		return -1;
	}
}
