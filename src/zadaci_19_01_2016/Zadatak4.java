package zadaci_19_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak4
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak4 {
	
	/*
	 * Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom redosljedu.
	 */

	/**Glavna metoda*/	
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Kreiraj dva niza
		int[] niz = new int[10];//Brojevi iz unosa
		int[] niz1 = new int[10];//Brojevi nakon izmjene
		
		//Izbaci pitanje korisniku da unese 10 cijelih brojeva
		System.out.println("Unesite 10 cijelih brojeva:");
		for (int i = 0, j = niz1.length - 1; i < 10; i++, j--) {
			boolean pravilanUnos = true;
			while (pravilanUnos) {
				try {
					niz[i] = unos.nextInt();
					niz1[j] = niz[i];
					pravilanUnos = false;
				} catch (InputMismatchException e) {
					System.err.println("Pogresan unos! Pokusajte ponovo!");
					unos.nextLine();
				}
			}
		}
		
		//Ispisi izvorni niz
		System.out.println("Niz prije izmjene:");
		for(int i = 0; i < niz1.length; i++){
			System.out.print(niz[i] + " ");
		}
		
		//Ispisi niz nakon izmjene
		System.out.println();
		System.out.println("Niz nakon izmjene:");
		for(int i = 0; i < niz1.length; i++){
			System.out.print(niz1[i] + " ");
		}
		
		unos.close();
	}

}
