package zadaci_25_01_2016;

import java.util.Calendar;
import java.util.Date;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 */


public class Zadatak3 {
	
	/*
	 * Ako pozovemo metodu System.currentTimeMillis() dobijemo broj milisekundi od 1. januara 1970 
	 * do trenutka pozivanja metode. Napisati program koji ispisuje trenutaèni datum i vrijeme 
	 * u formatu "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj kalendar objekat
		Calendar c = Calendar.getInstance();
		int godina = c.get(Calendar.YEAR);
		int mjesec = c.get(Calendar.MONTH);
		int dan = c.get(Calendar.DAY_OF_MONTH);
		
		//Mjeseci u godini
		String[] mjeseci = {"Januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul", "Avgust", 
				"Septembar", "Oktobar", "Novembar", "Decembar"};
		
		//Ispisi rezultat
		System.out.println(dan + ". " + mjeseci[mjesec] + ", " + godina + " " + convertMillis());
		
		
	}
	
	/** Metoda pretvara milisekunde u sate, minute i sekunde */
	public static String convertMillis() {

		long ukupnoMilisekundi = System.currentTimeMillis();
		
		// Dobiti ukupan broj sekundi
		long ukupnoSekundi = ukupnoMilisekundi / 1000;

		// Izraèunati trenutnu sekundu
		long trenutnaSekunda = ukupnoSekundi % 60;

		// Dobiti ukupan broj minuta
		long ukupnoMinuta = ukupnoSekundi / 60;

		// Izraèunati trenutnu minutu
		long trenutnaMinuta = ukupnoMinuta % 60;

		// Dobiti ukupan broj sati
		long ukupnoSati = ukupnoMinuta / 60;
		
		//Izracunati trenutni sat
		long trenutnoSati = (1 + ukupnoSati) % 24;

		return trenutnoSati + ":" + trenutnaMinuta + ":" + trenutnaSekunda;

	}

}
