package zadaci_30_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak1 {
	
	/*
	 * Napisati program koji pita korisnika da unese cijeli trocifreni broj te provjerava da li je unijeti broj palindrom. 
	 * Broj je palindrom ukoliko se èita isto i sa lijeva na desno i sa desna na lijevo npr. 121, 131, itd.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese broj
		System.out.println("Molimo unesite cijeli trocifreni broj: ");
		int broj;
		while(true){
			try{
				broj = unos.nextInt();
				if(broj < 100 ^ broj > 999){
					System.err.println("Unesite trocifren broj!");
					continue;
				}
				break;
			}catch(InputMismatchException e){
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		//Izracunaj da li je broj palindrom i ispisi rezultat
		if(broj % 10 == broj / 100){
			System.out.println("Broj je palindrom!");
		}else
			System.out.println("Broj nije palindrom!");
			
		unos.close();		
	}
}
