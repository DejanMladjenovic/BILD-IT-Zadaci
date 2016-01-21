package zadaci_21_01_2016;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak3 {
	
	/*
	 * Napisati program koji pita korisnika da unese godinu i prva tri slova 
	 * imena mjeseca (prvo slovo uppercase) te mu ispiše broj dana u tom mjesecu. 
	 * Na primjer, ukoliko korisnik kao godinu unese 2001 a kao mjesec Jan 
	 * program mu ispisuje da Jan 2011 ima 31 dan
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		// Deklarisi varijable
		int godina = 0;
		int brojDana = 0;
		String mjesec = "";
		String[] m = { "Jan", "Feb", "Mar", "Apr", "Maj", "Jun", "Jul", "Avg",
				"Sep", "Okt", "Nov", "Dec" };

		// Izbaci pitanje korisniku da unese godinu
		System.out.println("Unesite godinu:");
		while (true) {
			try {
				godina = unos.nextInt();
				break;
			} catch (Exception e) {
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		// Izbaci pitanje korisniku da unese ime mjeseca
		System.out.println("Unesite prva tri slova imena mjeseca(prvo slovo veliko):");
		while (true) {
			mjesec = unos.next();
			if (Arrays.asList(m).contains(mjesec))
				break;
			else
				System.err.println("Pogresan unos! Pokusajte ponovo!");
			continue;
		}
	
		//Odredi broj dana za svaki mjesec
		if(mjesec.equals("Jan") || mjesec.equals("Mar") || mjesec.equals("Maj") || mjesec.equals("Jul") 
				|| mjesec.equals("Avg") || mjesec.equals("Okt") || mjesec.equals("Dec"))
			brojDana = 31;
		else if(mjesec.equals("Apr") || mjesec.equals("Jun") || mjesec.equals("Sep") || mjesec.equals("Nov"))
			brojDana = 30;
		else if(mjesec.equals("Feb"))
			if((godina % 4 == 0 && godina % 100 != 0) || godina % 400 == 0)
				brojDana = 29;
			else
				brojDana = 28;
				
		//Ispisi rezultat
		System.out.println(mjesec + " " + godina + ". ima " + brojDana + " dana.");
	}
 
}
