package zadaci_18_01_2016;

import java.util.Scanner;

/**
 * Nazv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak2 {
	
	/*
	 * ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva: d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. 
	 * Posljednji broj, d10, služi kao checksum i njega izraèunavamo iz prvih devet brojeva koristeæi se sljedeæom 
	 * formulom: (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11. 
	 * Ukoliko je checksum 10, zadnji broj oznaèavamo sa X u skladu sa ISBN-10 konvencijom. 
	 * Napisati program koji pita korisnika da unese prvih 9 brojeva te ispiše desetocifreni ISBN-10 broj. 
	 * (Primjer: ukoliko unesemo, kao prvih 9 brojeva, 013601267 program nam ispisuje 0136012671 kao ISBN-10 broj. 
	 * Ukoliko unesemo 013031997 kao prvih 9 brojeva, program nam ispisuje 013031997X kao ISBN-10 broj)
	 */

	public static void main(String[] args) {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		// Kreiraj niz
		int[] niz = new int[9];
		int suma = 0;

		// Izbaci pitanje korisniku da unese brojeve
		System.out.println("Molimo unesite 9 cifara vaseg ISBN broja:");
		for (int i = 0; i < niz.length; i++) {
			boolean pravilanUnos = true;
			System.out.println("Unesite " + (i + 1) + ".cifru:");
			while (pravilanUnos) {
				try {
					niz[i] = unos.nextInt();
					suma += niz[i] * (i + 1);
					pravilanUnos = false;
				} catch (Exception e) {
					System.err.println("Greska! Pokusajte ponovo!");
					unos.nextLine();
				}
			}
		}

		//Generisi zadnju cifru
		String kontrBroj = "";
		int temp = suma % 11;
		if (temp == 10) {
			kontrBroj = "X";
		} else {
			kontrBroj = Integer.toString(temp);
		}
		
		//Ispisi rezultat
		System.out.println("\nVas ISBN: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i]);
		}
		System.out.print(kontrBroj);
		
		unos.close();
	}

}
