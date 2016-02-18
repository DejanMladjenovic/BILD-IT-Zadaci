package zadaci_18_02_2016;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak1 {
	
	/*
	 * Rewrite the PrintCalendar class in Listing 6.12 to display a calendar 
	 * for a specified month using the Calendar and GregorianCalendar classes. 
	 * Your program receives the month and year from the command line.
	 * You also can run the program without the year. 
	 * In this case, the year is the current year. If you run the program without specifying 
	 * a month and a year, the month is the current month.
	 */

	//Mjeseci u godini
	static String[] mjeseci = {"Januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul", "Avgust", 
			"Septembar", "Oktobar", "Novembar", "Decembar"};
	 static int mjesec;//Broj mjeseca
     static int godina;//Broj godine

	
	/**Glavna metoda*/
	public static void main(String[] args) {
		
		if(args.length > 2){
			System.out.println("Koristite: java Zadatak1 mjesec godina");
			System.exit(1);
		}
		
		//Postavi mjesec
		if(args.length == 0)
			mjesec = Calendar.getInstance().get(Calendar.MONTH) - 1;
		else{
			mjesec= Integer.parseInt(args[0]) - 1;
			if(mjesec < 0 || mjesec > 11){
				System.out.println("Pogresan unos mjeseca!");
				System.exit(0);
			}
		}
		
		//Postavi godinu
		if(args.length < 2)
			godina = Calendar.getInstance().get(Calendar.YEAR);
		else
			godina= Integer.parseInt(args[1]);
		
		//Ispisi kalendar
		ispis(mjesec, godina);
	
	}
	
	/**Ispisuje kalendar za dati mjesec */
	public static void ispis(int mjesec, int godina){

		//ispisi zaglavlje kalendara
		System.out.println("              " + mjeseci[mjesec] + " " + godina);
		System.out.println("----------------------------------------");
		System.out.println("pon   uto   sri   cet   pet   sub   ned");

		// Odredi pocetni dan mjeseca
		int d = prviDanMjeseca(mjesec, godina);
		System.out.println();
		for (int i = 0; i < d; i++) {
			System.out.print("      ");
		}
		//Broj dana po mjesecima
		int[] brojDana = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//Broj dana u februaru u prestupnoj godini
		if (jePrestupna(godina) && mjesec == 1) {
			brojDana[1] = 29;
		}		
		// Ispisi datume u kalendar
		for (int i = 1; i <= brojDana[mjesec]; i++) {
			System.out.printf("%2d    ", i);
			if (((i + d) % 7 == 0) || (i == brojDana[mjesec])) {
				System.out.println();
			}
		}
	}
	
	/**Vraca poziciju u sedmici za prvi dan datog mjeseca*/
	public static int prviDanMjeseca(int mjesec, int godina){
		
		Calendar calendar = new GregorianCalendar();
		calendar.set(Calendar.MONTH, (mjesec));
		calendar.set(Calendar.YEAR, godina);
		calendar.set(Calendar.DAY_OF_MONTH, 0);
		
		return calendar.get(Calendar.DAY_OF_WEEK) - 1;
	}
	
	/**Metoda ispituje da li je godina prestupna*/
	public static boolean jePrestupna(int godina){
		if((godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0)){
			return true;
		}
		return false;
	}

}
