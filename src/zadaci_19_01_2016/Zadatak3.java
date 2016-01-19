package zadaci_19_01_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak3 {
	
	/*
	 * Napisati program koji pita korisnika da unese 2 stringa te ispisuje 
	 * najveæi zajednièki prefix za ta dva stringa, ukoliko isti postoji. 
	 * Na primjer, ukoliko korisnik unese sljedeæa dva stringa "Dobrodošli u Dubai" i "Dobrodošli u Vankuver" 
	 * program treba da ispiše: Najveæi zajednièki prefix za dva stringa je "Dobrodošli u"
	 */

	/**Glavna metoda*/	
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese prvi string
		System.out.println("Unesite prvi string:");
		String str1 = unos.nextLine();		
		
		//Izbaci pitanje korisniku da unese drugi string
		System.out.println("Unesite prvi string:");
		String str2 = unos.nextLine();	
		
		String str3 = "";//Rezultat
		
		//Izracunaj najveci zajednicki prefiks dva stringa
		for(int i = 0; i < str1.length(); i++){
			if(str1.charAt(i) != str2.charAt(i)){
				str3 = str1.substring(0, i);
				break;
			}
		}

		//Ispisi rezultat
		System.out.print("Najveci zajednicki prefiks za dva stringa je: ");
		System.out.println("\"" + str3 + "\"");
	}

}
