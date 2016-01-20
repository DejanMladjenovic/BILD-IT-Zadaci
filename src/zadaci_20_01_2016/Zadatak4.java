package zadaci_20_01_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak4
 * 
 * @author Dejan Mladjenovic
 * 
 */

public class Zadatak4 {
	
	/*
	 * Napisati program koji pita korisnika da unese neki string 
	 * te mu ispisuje sve karaktere koji se nalaze na neparnim pozicijama. 
	 * Na primjer, ako korisnik unese string Beijing Chicago, program vraæa BiigCiao.
	 */

	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese neki string
		System.out.println("Unesite neki string:");
		String str = unos.nextLine();
		
		//Pretvori string u niz karaktera
		char[] str1 = str.toCharArray();
		
		//Ispisi karaktere na neparnim pozicijama
		for(int i = 0; i < str.length(); i++){
			if(i % 2 == 0){
				System.out.print(str1[i]);
			}
		}

		unos.close();
	}

}
