package zadaci_26_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak2 {
	
	/*
	 * Napisati program koji pita korisnika da unese dva cijela, pozitivna broja 
	 * te ispisuje najveæi i najmanji zajednièki djelilac za ta dva broja
	 */

	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);		
		
		//Izbaci pitanje korisniku da unese prvi broj
		System.out.println("Unesite prvi broj:");
		int broj1 = unosBrojeva(unos);
		
		//Izbaci pitanje korisniku da unese drugi broj
		System.out.println("Unesite drugi broj:");
		int broj2 = unosBrojeva(unos);
		
		int minzd = 1;//Najmanji zajednicki djelilac
		int maxzd = 1;//Najveci zajednicki djelilac
		int k = 2;//Moguci najveci zajednicki djelilac
		
		//Pronadji najveci zajednicki djelilac za date brojeve
		while (k <= broj1 && k <= broj2) {
			if (broj1 % k == 0 && broj2 % k == 0) {
				maxzd = k;
			}
			k++;
		}
		
		//Ispisi rezultat
		System.out.println("Najmanji zajednicki djelilac za " + broj1 + " i " + broj2 + " je " + minzd);
		System.out.println("Najveci zajednicki djelilac za " + broj1 + " i " + broj2 + " je " + maxzd);

	}
	
	/** Metoda obradjuje izuzetke */
	private static int unosBrojeva(Scanner unos) {

		while (true) {
			try {
				return unos.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Greska!Pokusajte ponovo.");
				unos.nextLine();
			}
		}
	}

}
