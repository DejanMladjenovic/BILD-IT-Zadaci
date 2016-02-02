package zadaci_02_02_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak3 {
	
	/*
	 *Napisati metodu koja provjerava da li u nizu postoje 4 uzastopna ista broja.
	 *Metoda ima sledeci header: public static boolean isConsecutiveFour(int[] values).
	 *Napisati test program koji pita korisnika da upise koliko zeli brojeva za provjeru,
	 *a zatim uzima brojeve od korisnika i ispisuje rezultat.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese velicinu niza
		System.out.println("Unesite broj clanova za provjeru:");
		int suma; 
		do{
			suma = unosBrojeva(unos);
			if(suma < 4)
				System.out.println("Minimalno 4 clana! Pokusajte ponovo!");
		}while(suma < 4);
		
		//Kreiraj niz brojeva
		int[] values = new int[suma];
		
		//Izbaci pitanje korisniku da unosi brojeve
		System.out.println("Unesite brojeve( ukupno " + suma + " brojeva):");
		for(int i = 0; i < suma; i++){
			values[i] = unosBrojeva(unos);	
		}
		
		//Ispisi rezultat
		if(isConsecutiveFour(values))
			System.out.println("Lista sadrzi 4 uzastopna ista broja.");
		else
			System.out.println("Lista ne sadrzi 4 uzastopna ista broja.");
		
	}
	
	/**Metoda vraca true ako u nizu postoje 4 uzastopna ista broja*/
	public static boolean isConsecutiveFour(int[] values){
		
		for(int i = 0; i < values.length - 3; i++){
			if(values[i] == values[i + 1] && values[i] == values[i + 2]
					&& values[i] == values[i + 3]){
				return true;
			}
		}
		return false;
	}
	
	/**Metoda obradjuje izuzetke int tipa*/
	private static int unosBrojeva(Scanner unos){
		
		while(true){
			try{
				return unos.nextInt();
			}catch(Exception e){
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
	}

}
