package zadaci_12_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: OutOfBounds
 * 
 * @author Dejan Mladjenovic
 */

public class OutOfBounds {
	
	/*
	 * Write a program that meets the following requirements:
	 * -Creates an array with 100 randomly chosen integers.
	 * -Prompts the user to enter the index of the array, then displays the corresponding element value.
	 * If the specified index is out of bounds, display the message Out of Bounds.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Kreiraj  i generisi niz
		int[] niz = new int[100];
		for(int i = 0; i < niz.length; i++){
			niz[i] = (int)(Math.random() * 10);
		}
		
		//Pitaj korisnika da unese indeks clana za prikaz
		System.out.println("Unesite indeks clana za prikaz:");
		while(true){
			try{
				int broj = unos.nextInt();
				//Ispisi rezultat
				System.out.println("Broj na datom indeksu: " + niz[broj]);
				break;
			//Uhvati izuzetke	
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Izvan granica! Pokusajte ponovo!");
			}catch(InputMismatchException e){
				System.out.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
	}

}
