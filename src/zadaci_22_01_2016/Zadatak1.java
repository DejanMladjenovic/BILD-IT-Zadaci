package zadaci_22_01_2016;

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
	 *  Napisati program koji pita korisnika da unese cijeli broj za današnji dan u sedmici 
	 *  (0 za ponedjeljak, 1 za utorak...) i da unese broj dana nakon današnjeg dana 
	 *  te mu ispiše koji je to dan u buduænosti. 
	 *  (Primjer: ako korisnik unese 1 kao današnji dan a 3 kao dan u buduænosti 
	 *  program mu ispisuje da je danas utorak a dan u buduænosti je petak.)
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Inicijalizuj varijeble
		int dan = 0;
		int buduciDan = 0;
		
		// Izbaci pitanje korisniku da unese broj za danasnji dan
		System.out.println("Izaberite dan (0 za ponedjeljak, 1 za utorak): ");
		while (true) {
			try {
				dan = unos.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}

		// Izbaci pitanje korisniku da unes broj za buduci dan
		System.out.println("Izaberite broj za buduci dan: ");
		while (true) {
			try {
				buduciDan = unos.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		//Deklarisi dane u sedmici
		String imeDan = null;
		switch(dan % 7) {
			case 0: imeDan = "Ponedjeljak"; break;
			case 1: imeDan = "Utorak"; break;
			case 2: imeDan = "Srijeda"; break;
			case 3: imeDan = "Cetvrtak"; break;
			case 4: imeDan = "Petak"; break;
			case 5: imeDan = "Subota"; break;
			case 6: imeDan = "Nedjelja"; break;
		}
		
		//Odredi dan u buducnosti
		buduciDan = dan + buduciDan;
		
		//Deklarisi buduci dan
		String imeBuduciDan = null;
		switch(buduciDan % 7) {
		case 0: imeBuduciDan = "Ponedjeljak"; break;
		case 1: imeBuduciDan = "Utorak"; break;
		case 2: imeBuduciDan = "Srijeda"; break;
		case 3: imeBuduciDan = "Cetvrtak"; break;
		case 4: imeBuduciDan = "Petak"; break;
		case 5: imeBuduciDan = "Subota"; break;
		case 6: imeBuduciDan = "Nedjelja"; break;
		}
		
		//Ispisi rezultat
		System.out.println("Danas je " +imeDan + " a dan u buducnosti je " + imeBuduciDan);
	}
}
