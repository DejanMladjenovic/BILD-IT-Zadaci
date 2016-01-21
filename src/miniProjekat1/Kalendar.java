package miniProjekat1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Kalendar
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Kalendar {
	
	//Mjeseci u godini
	static String[] mjeseci = {"", "Januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul", "Avgust", 
			"Septembar", "Oktobar", "Novembar", "Decembar"};
	 static int mjesec;//Broj mjeseca
     static int godina;//Broj godine
   
     /**Glavna metoda*/
	public static void main(String[] args) throws FileNotFoundException {
       
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Pozovi metodu za ispis kalendara
		ispisKalendara();
		
		//Ispisi izbornik
		boolean zavrsiProgram = true;
		do {
			System.out.println("\n     Izbornik:");
			System.out.println("-------------------------------------");
			System.out.println("1. Prikazi napomene za izabrani mjesec");
			System.out.println("2. Dodaj novu napomenu za izabrani mjesec");
			System.out.println("3. Unesite novi mjesec za prikaz");
			System.out.println("4. Izlaz");
			System.out.println("\nIzaberite:");

			//Kreiraj skener objekat
			Scanner opcija = new Scanner(System.in);
			
			//Dodaj funkcije za izbornik
			try {
				int a = opcija.nextInt();
				switch (a) {
				case 1:
					ispis(unos);
					break;
				case 2:
					upis(unos);
					break;
				case 3:
					ispisKalendara();
					break;
				case 4:
					zavrsiProgram = false;
					break;
				}
			} catch (Exception e) {
				System.err.println("\nPogresan unos! Pokusajte ponovo!");
				opcija.nextLine();
			}
		} while (zavrsiProgram);

		//Kraj Programa
		System.out.println("----Kraj programa!----");
	}
	
	/**Metoda ispisuje kalendar*/
	public static void ispisKalendara(){
		
		//Dani u sedmici
		String[] dani = {"Pon", "Uto", "Sri", "Cet", "Pet", "Sub", "Ned"};
		
		//Broj dana po mjesecima
		int[] brojDana = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
				
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
		
		// Izbaci pitanje korisniku da unese mjesec
		System.out.println("Unesite mjesec:");
		while (true) {
			try {
				mjesec = unos.nextInt();
				if (mjesec < 1 || mjesec > 12) {
					System.err.println("Pogresan mjesec! Pokusajte ponovo!");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}

		//Broj dana u februaru u prestupnoj godini
		if (jePrestupna(godina) && mjesec == 2) {
			brojDana[2] = 29;
		}

		//Ispisi naslov kalendara
		System.out.println("              " + mjeseci[mjesec] + " " + godina);
		System.out.println("-----------------------------------------");
		for (String e : dani) {
			System.out.print(e + "   ");
		}

		// Odredi pocetni dan mjeseca
		int d = dan(mjesec, godina);
		System.out.println();
		for (int i = 0; i < d; i++) {
			System.out.print("      ");
		}

		// Ispisi datume u kalendar
		for (int i = 1; i <= brojDana[mjesec]; i++) {
			System.out.printf("%2d    ", i);
			if (((i + d) % 7 == 0) || (i == brojDana[mjesec])) {
				System.out.println();
			}
		}
	}
	
	/**Metoda ispituje da li je godina prestupna*/
	public static boolean jePrestupna(int godina){
		if((godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0)){
			return true;
		}
		return false;
	}
	
	/**Metoda odredjuje raspored datuma u kalendaru*/
	public static int dan(int M, int y){
		
		int a = y -(14 - M) / 12;
		int b = a + a/4 - a/100 + a/ 400;
		int c = M + 12 * ((14 - M) / 12) - 2;
		return (b +(31 * c) / 12)% 7;
	}
	
	/**Metoda upisuje podatke u fajl*/
	public static void upis(Scanner unos) throws FileNotFoundException{
		
		//Kreiraj fajl objekat
		File file = new File("src/miniProjekat1/Napomene.txt");
		
		//dodaj sadrzaj na postojeci u fajlu
		try (PrintWriter upis = new PrintWriter(new FileOutputStream(file, true))) {
			System.out.println(mjeseci[mjesec] + " " + godina);
			System.out.println("Koji dan:");
			int dan = unos.nextInt();
			System.out.println("Unesite napomenu:");
			unos.nextLine();
			String str = unos.nextLine();
			upis.println(dan + "." + mjesec + "." + godina + "; " + str);
			upis.close();
		} catch (IOException e) {
		}
		
		
	}
	
	/**Metoda ispisuje podatke iz fajla*/
	public static void ispis(Scanner unos) throws FileNotFoundException{
		
		//Kreiraj fajl objekat
		File file = new File("src/miniProjekat1/Napomene.txt");
		
		ArrayList<String> lista = new ArrayList<>();
		
		//Izbaci pitanje korisniku da unese dan u mjesecu
		int dan = 0;
		System.out.println("Unesite dan za ispis napomene (za mjesec " + mjeseci[mjesec] + " " + godina + ". godine) :");
		try {
			dan = unos.nextInt();

			// Iscitaj podatke iz fajla
			String datumZaPretragu = dan + "." + mjesec + "." + godina;
			Scanner unos1 = new Scanner(file);
			while (unos1.hasNextLine()) {
				String str = unos1.nextLine();
				String datum = str.substring(0, str.indexOf(";"));
				if (datum.equals(datumZaPretragu)) {
					lista.add(str);
				}
			}
			unos1.close();

			// Ispisi podatke
			System.out.println("\nNapomene:");
			if (lista.size() == 0) {
				System.out.println("Ne postoji napomena za " + datumZaPretragu);
			} else {
				for (String s : lista) {
					System.out.println(s);
				}
			}
		} catch (Exception e) {
			System.err.println("Pogresan unos!");
			unos.nextLine();
		}
		
	}
}
