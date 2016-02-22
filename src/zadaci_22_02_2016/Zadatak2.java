package zadaci_22_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**Naziv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak2 {
	
	/*
	 * The gcd(m, n) can also be defined recursively as follows:
	 * If m % n is 0, gcd(m, n) is n.
	 * Otherwise, gcd(m, n) is gcd(n, m % n).
	 * Write a recursive method to find the GCD. Write a test program 
	 * that prompts the user to enter two integers and displays their GCD.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Pitaj korisnika da unese prvi broj
		System.out.println("Unesite prvi broj:");
		int broj1;
		while(true){
			try{
				broj1= unos.nextInt();
				break;
			}catch(InputMismatchException e){
				System.out.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}

		//Pitaj korisnika da unese drugi broj
		System.out.println("Unesite drugi broj:");
		int broj2;		
		while(true){
			try{
				broj2= unos.nextInt();
				break;
			}catch(InputMismatchException e){
				System.out.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		//Ispisi rezultat
		System.out.println(gcd(broj1, broj2));
		
	}
	
	/**Vraca najveci zajednicki djelilac za dva broja*/
	public static int gcd(int m, int n){
		
		if(m % n == 0)
			return n;
		else
			return gcd(n, m % n);
	}
}
