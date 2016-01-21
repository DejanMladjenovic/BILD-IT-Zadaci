package zadaci_21_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak1 {
	
	/*
	 * Napisati program koji ispisuje tri nasumièna cijela broja te pita korisnika da unese njihov zbir. 
	 * Ukoliko korisnik pogriješi, program ispisuje pitanje ponovo sve sa porukom da pokuša ponovo.  
	 * Ukoliko korisnik unese taèan odgovor, program mu èestita i završava sa radom.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Kreiraj niz tri nasumicna broja
		int[] brojevi = new int[3];
		for(int i = 0; i < 3; i++){
			brojevi[i] = (int)(Math.random() * 10);
		}
		
		//Trazeni odgovor
		int zbir = (brojevi[0] + brojevi[1] + brojevi[2]);

		int odgovor = 0;
		boolean b = true;
		
		//Vrti u petlji dok korisnik ne unese tacan odgovor
		do {
			try {
				//Izbaci pitanje korisniku da unese odgovor 
				System.out.println("Molimo unesite zbir datih brojeva:");
				System.out.println(brojevi[0] + " + " + brojevi[1] + " + " + brojevi[2] + " = ");
				odgovor = unos.nextInt();
				if(odgovor == zbir)
					System.out.println("Tacno!");
				else
					System.out.println("Pokusajte ponovo!");
				b = false;
			} catch (InputMismatchException e) {
				System.err.println("Pogresan unos!");
				unos.nextLine();
			}
		} while (odgovor != zbir);
	}

}
