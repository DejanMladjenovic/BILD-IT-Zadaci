package zadaci_24_01_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak4
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak4 {
	
	/*
	 * Napisati metodu koja pronalazi broj ponavljanja odreðenog karaktera u stringu. 
	 * Metoda treba da koristi sljedeæi header: public static int count(String str, char a). 
	 * Na primjer, ukoliko pozovemo metodu na sljedeæi naèin: count("Welcome", e) metoda treba da vrati 2. 
	 * Napisati program koji pita korisnika da unese string i koji karakter želi da prebroji 
	 * u datom stringu te mu ispiše koliko se puta odreðeni karakter ponovio u zadatom stringu.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese neki string
		System.out.println("Molimo unesite neki string:");
		String string = unos.nextLine();
		
		//Izbaci pitanje korisniku da unese karakter koji zeli izbrojiti u datom stringu
		System.out.println("Molimo unesite karakter koji zelite izbrojiti:");
		String s = unos.nextLine();
		char k = s.charAt(0);
		
		//Ispisi rezultat
		if(count(string, k) > 0)
			System.out.println("U stringu \"" + string + "\" karakter \"" + k 
					+ "\" se ponovio " + count(string, k) + " puta." );
		else
			System.out.println("Karakter \"" + k + "\" se ne nalazi u datom stringu." );
	}
	
	/**Metoda vraca broj ponavljanja trazenog karaktera u stringu*/
	public static int count(String str, char a){
		int brojac = 0;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == a){
				brojac++;
			}
		}
		return brojac;
	}

}
