package zadaci_16_01_2016;

/**
 * Naziv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {
	
	/*
	 * Napisati metodu koja prima jedan argument, broj pitanja, te generiše toliko nasumiènih, 
	 * jednostavnih pitanja oduzimanja tipa : „Koliko je 5 - 2 ?“. 
	 * Metoda treba da broji broj taènih i netaènih odgovora te ih ispiše korisniku.
	 */

	//Glavna metoda
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese broj pitanja
		System.out.println("Izaberite broj pitanja:");
		int brojPitanja = unos.nextInt();
		
		razlika(brojPitanja);
		unos.close();
	}
	
	//Metoda generise pitanja i ispisuje rezultat 
	public static void razlika(int a){
		int tacniOdgovori = 0;//Tacnih odgovora
		int netacniOdgovori = 0;//Netacni odgovori
		int brojac = 0;//Broj odgovora
		long pocetak = System.currentTimeMillis();
		String ispis = "";
		Scanner unos = new Scanner(System.in);
		
		while(brojac < a){
			//Generisi dva nasumicna dvocifrena broja
			int broj1 = (int)(Math.random() * 10);
			int broj2 = (int)(Math.random() * 10);
			
			//Ako je prvi broj manji od drugog zamijeni im mjesta
			if(broj1 < broj2){
				int privremeno = broj1;
				broj1 = broj2;
				broj2 = broj1;
			}
			
			//Postavi pitanje korisniku da unese razliku brojeva
			System.out.println("\nKoliko je: " + broj1 + " - " + broj2 + "?");
			boolean pravilanUnos = true;
			while(pravilanUnos){
				try{
					int odgovor = unos.nextInt();
					
					//Razvrstaj odgovore i ispisi rezultat
					if(broj1 - broj2 == odgovor){
						System.out.println("Tacno!");
						tacniOdgovori++;
					}else{
						System.out.println("Netacno!");
						System.out.println(broj1 + " - " + broj2 + " = " + (broj1 - broj2));
						netacniOdgovori++;
					}
					brojac++;
					ispis += "\n" + broj1 + " - " + broj2 + " = " + odgovor + ((broj1 - broj2 == odgovor)? " Tacno" : " Netacno" );
					pravilanUnos = false;
				}catch(InputMismatchException ex){
					System.err.println("Pogresan unos. Unesite broj!");
					unos.nextLine();
				}
			}
		}
		
		//Odredi trajanje testa
		long kraj = System.currentTimeMillis();
		long trajanjeTesta = kraj - pocetak;
		
		//Ispisi rezultate
		System.out.println("--------------------------");
		System.out.println("Tacnih odgovora: " + tacniOdgovori);
		System.out.println("Netacnih odgovora: " + netacniOdgovori);
		System.out.println(ispis + "\nTrajanje testa:" + trajanjeTesta/1000 + " sekundi.");
	
		unos.close();
	}
}
