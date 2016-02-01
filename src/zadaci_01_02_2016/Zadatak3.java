package zadaci_01_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak3 {
	
	/*
	 * U javi, short vrijednost se sprema u samo 16 bita. 
	 * Napisati program koji pita korisnika da unese short broj te mu ispiše svih 16 bita za dati cijeli broj. 
	 * Na primjer, ukoliko korisnik unese broj 5 - program mu ispisuje 0000000000000101
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Izbaci pitanje korisniku da unese broj tipa short
		System.out.println("Unesite broj izmedju -32769 i 32768:");
		short broj;
		while(true){
			try{
				broj = unos.nextShort();
				break;
			}catch(InputMismatchException e){
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		String nula = "";//String nula
		
		//Dodaj nule kao prefiks binarnoj vrijednosti broja od 16 bita
		for(int i = 0; i < 16 - String.valueOf(Integer.toBinaryString(broj)).length(); i++){
			nula += "0";
		}
		
		//Ispisi rezultat
		System.out.println(nula + Integer.toBinaryString(broj));
		
		unos.close();
	}

}
