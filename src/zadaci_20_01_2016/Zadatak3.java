package zadaci_20_01_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 * 
 */

public class Zadatak3 {
	
	/*
	 * Napisati metode sa sljedeæim headerima: public static int reverse(int number) i public static boolean isPalindrome(int number). 
	 * Prva metoda prima cijeli broj kao argument i vraæa isti ispisan naopako. (npr. reverse(456) vraæa 654.) 
	 * Druga metoda vraæa true ukoliko je broj palindrom a false ukoliko nije. 
	 * Koristite reverse metodu da implementirate isPalindrome metodu. 
	 * Napišite program koji pita korisnika da unese broj te mu vrati da li je broj palindrome ili ne.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		// Izbaci pitanje korisniku da unese neki broj
		System.out.println("Molimo unesite neki broj:");
		boolean pravilanUnos = true;
		do {
			try {
				int broj = unos.nextInt();

				// Ispisi rezultat
				if (isPalindrome(broj))
					System.out.println("Broj je palindrom.");
				else
					System.out.println("Broj nije palindrom.");
				pravilanUnos = false;
			} catch (Exception e) {
				System.err.println("Pogresan unos! Pokusajte ponovo");
				unos.nextLine();
			}
		} while (pravilanUnos);

		unos.close();
	}
	
	/**Vraca revers nekog broja*/
	public static int reverse(int number){
		int reverse = 0;
		while (number != 0){
			reverse = reverse * 10 +  number % 10 ;
			number = number / 10;	
		}
		return reverse;
	}
	
	/**Vraca true ako je trazeni broj palindrom*/
	public static boolean isPalindrome(int number){
		if(number == reverse(number)){
			return true;
		}
		return false;
	}
	
	

}
