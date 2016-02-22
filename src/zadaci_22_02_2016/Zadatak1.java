package zadaci_22_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak1 {
	
	/*
	 * Rewrite the fib method in Listing 18.2 using iterations.
	 * Hint: To compute fib(n) without recursion, you need to obtain fib(n - 2)
	 * and fib(n - 1) first. Let f0 and f1 denote the two previous Fibonacci
	 * numbers. The current Fibonacci number would then be f0 + f1.
	 * Write a test program that prompts the user to enter an index and displays its Fibonacci number.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Pitaj korisnika da unese index
		System.out.println("Izaberite indeks za Fibonacci broj:");
		int index;
		while(true){
			try{
				index= unos.nextInt();
				break;
			}catch(InputMismatchException e){
				System.out.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		//ispisi rezultat
		System.out.println("Fibonacci broj na indeksu " + index + " je " + fibonacci(index));
	}
	
	/**Vraca Fibonacci broj za dati index*/
	public static long fibonacci(long n){
		if(n == 0 || n == 1)
			return 1;
		int f0 = 0;
		int f1 = 1;
		int currentFib;
		for(int i = 2; i <= n; i++){
			currentFib = f0 + f1;
			f0 = f1;
			f1 = currentFib;
		}
		return f1;
	}
}
