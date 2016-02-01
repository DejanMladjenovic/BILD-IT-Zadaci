package zadaci_01_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak1 {
	
	/*
	 * Napisati program koji prima ASCII kod (cijeli broj izmeðu 0 i 127) te ispisuje koji je to karakter. 
	 * Na primjer, ukoliko korisnik unese 69 kao ASCII kod, 
	 * program mu ispisuje da je karakter sa tim brojem karakter E.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese broj izmedju 0 i 127
		System.out.println("Molimo unesite cijeli broj izmedju 0 i 127:");
		int broj;
		while (true) {
			try {
				broj = unos.nextInt();
				if (broj < 1 || broj > 126){
					System.err.println("Pogresan broj! Pokusajte ponovo!");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		//Odredi karakter u ASCII kodu od datog broja
		char karakter = (char) broj;
		
		//Ispisi rezultat
		System.out.println("ASCII kod: " + broj);
		System.out.println("Karakter: " + karakter);
		
		unos.close();
	}

}
