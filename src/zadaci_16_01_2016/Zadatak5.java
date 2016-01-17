package zadaci_16_01_2016;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 */

import java.util.Scanner;

public class Zadatak5 {
	
	/*
	 * Napisati metodu koja prima jedan argument te simulira bacanje nov�i�a toliko puta. 
	 * Nakon �to se simulacija zavr�i, program ispisuje koliko puta je nov�i� pokazao glavu a koliko puta pismo.
	 */

	//Glavna metoda
	public static void main(String[] args) {

		try{
			//Kreiraj skener objekat
			Scanner unos = new Scanner(System.in);
			
			//Izbaci pitanje korisniku da unese broj ponavljanja
			System.out.println("Unesite broj bacanja novcica: ");
			int brojBacanja = unos.nextInt();
			
			simulacija(brojBacanja);//Poziva metodu
			
			unos.close();
		}catch(Exception e){
			System.err.println("Pogresan unos!");
			System.exit(1);
		}
		
	}
	
	//Metoda ispisuje rezultat simulacije
	public static void simulacija(int brojBacanja){
		final int PISMO = 0;
		int brojPisma = 0;
		int brojGlava = 0;
		for (int i = 0; i < brojBacanja; i++) {
			int ishodBacanja = (int)(Math.random() + 0.5);
			if (ishodBacanja == PISMO)
				brojPisma++;
			else
				brojGlava++;
			}
			System.out.println("\nPismo: " + brojPisma + " puta.");
			System.out.println("Glava: " + brojGlava + " puta.");
			
			
	}
}
