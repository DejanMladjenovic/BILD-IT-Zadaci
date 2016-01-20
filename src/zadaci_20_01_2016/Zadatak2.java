package zadaci_20_01_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 * 
 */

public class Zadatak2 {
	
	/*
	 * Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u rasponu godina koje korisnik unese. 
	 * Program pita korisnika da unese poèetnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu. 
	 * Razmak izmeðu godina treba biti jedan space
	 */

	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese pocetnu godinu
		System.out.println("Molimo unesite pocetnu godinu:");
		int start = unosIntBrojeva(unos);
		
		//Izbaci pitanje korisniku da unese zavrsnu godinu
		System.out.println("Molimo unesite zavrsnu godinu:");
		int kraj = unosIntBrojeva(unos);
		
		//Ako je pocetna godina veca od zavrsne zamijeni im mjesta
		if(start > kraj){
			int temp = start;
			start = kraj;
			kraj = temp;
		}
		
		//Ispisi rezultat
		int brojac = 0;
		for(int i = start; i <= kraj; i++){
			if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
				brojac++;
				if(brojac % 10 == 0){
					System.out.println(i);
				}else{
					System.out.print(i + " ");
				}
			}
		}
	}

	/** Metoda obradjuje izuzetke int tipa */
	private static int unosIntBrojeva(Scanner unos) {
		
		while (true) {
			try {
				return unos.nextInt();
			} catch (Exception e) {
				System.err.println("Pogresan unos! Pokusajte ponovo.");
				unos.nextLine();
			}
		}
	}
}
