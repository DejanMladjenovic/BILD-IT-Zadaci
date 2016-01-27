package zadaci_27_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak2 {
	
	/*
	 * Napišite metodu sa sljedeæim headerom koja vraæa naopako ispisan broj koji joj je proslijeðen kao argument: 
	 * public static void reverse(int number). Na primjer, reverse(3456) treba da vrati 6543. 
	 * Napisati program koji pita korisnika da unese neki cijeli broj te mu vrati isti ispisan naopako
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		//Izbaci pitanje korisniku da unese broj
		System.out.println("Molimo unesite broj:");
		int broj;//Unos sa tastature
		while(true){
			try{
				broj = unos.nextInt();
				break;
			}catch(InputMismatchException e){
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		//Ispisi rezultat
		System.out.println("Broj:   " + broj);
		reverse(broj);
		
		unos.close();
	}
	
	/**Metoda ispisuje revers unesenog broja*/
	public static void reverse(int number){
		
		int result = 0;
		while(number != 0){
			result = result * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Revers: " + result);
	}

}
