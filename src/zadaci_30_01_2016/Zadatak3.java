package zadaci_30_01_2016;

import java.util.Scanner;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak3 {
	
	/*
	 * Napisati program koji pita korisnika da unese Social Security Number (SSN) u formatu DDD-DD-DDDD 
	 * gdje D predstavlja broj. Program treba da provjerava da li je broj unešen u ispravnom formatu.
	 * Ukoliko nije, program pita korisnika da pokuša ponovo. 
	 * Ukoliko jeste unešen u pravom formatu, program završava sa radom.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//izbaci pitanje korisniku da unese SSN
		System.out.println("Molimo unesite vas SSN u formatu DDD-DD-DDDD( D predstavlja broj:");
		String ssn;
		do{
			ssn = unos.nextLine();
			if(isValid(ssn))
				break;
			else
				System.out.println("Pokusajte ponovo!");
			
		}while(!isValid(ssn));
		
		//Ispisi SSN
		System.out.println("SSN:");
		System.out.println(ssn);
		
		
	}
	
	/**Metoda vraca true ako je unos ispravan*/
	public static boolean isValid(String d){
		
		if(d.length() != 11)
			return false;
		
		for(int i = 0; i < d.length(); i++){
			if(i == 3 || i == 6){
				if(d.charAt(i) != '-' && d.charAt(i) != '-'){
					return false;
				}
			}else if(!Character.isDigit(d.charAt(i))){
				return false;
			}
		}
		return true;
	}

}
