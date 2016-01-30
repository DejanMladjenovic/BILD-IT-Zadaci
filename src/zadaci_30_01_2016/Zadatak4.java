package zadaci_30_01_2016;

import java.util.Calendar;

/**
 * Naziv klase: Zadatak4
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak4 {
	
	/*
	 * Napisati metodu koja vraæa datum i trenutaèno vrijeme.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Ispisi rezultat
		System.out.println(vrijeme());
	}
	
	/**Metoda vraca datum i trenutacno vrijeme*/
	public static String vrijeme() {
		
		//Kreiraj kalendar objekat
		Calendar c = Calendar.getInstance();
		
		int godina = c.get(Calendar.YEAR);//Trenutna godina
		int mjesec = c.get(Calendar.MONTH) + 1;//Trenutni mjesec
		int dan = c.get(Calendar.DAY_OF_MONTH);//Trenutni dan

		//Ukupan broj milisekundi od 01.01.1970. godine
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

		// Izracunati trenutni sat
		long trenutnoSati = (1 + ukupnoSati) % 24;

		return dan + "." + mjesec + "." + godina +". " + trenutnoSati + ":" + trenutnaMinuta + ":" + trenutnaSekunda;

	}

}
