package zadaci_19_01_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak5 {
	
	/*
	 * Napisati metodu koja broji slova u stringu. Metoda treba koristiti sljedeæi header: 
	 * public static int countLetters(String s). 
	 * Napisati program koji pita korisnika da unese neki string te mu vrati koliko taj string ima slova.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese neki string
		System.out.println("Unesite neki string:");
		String str = unos.nextLine();
		
		//Poziva metodu
		System.out.println("Broj slova u vasem stringu je: ");
		System.out.println(countLetters(str));
		
	
	}
	
	/**Metoda vraca broj slova u datom stringu*/
	public static int countLetters(String s){
		
		int brojac = 0;
		for(int i = 0; i < s.length(); i++){
			if(Character.isLetter(s.charAt(i))){
				brojac++;
			}
		}
		return brojac;
	}

}
