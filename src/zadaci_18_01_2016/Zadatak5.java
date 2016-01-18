package zadaci_18_01_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Nazv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak5 {
	
	/*
	 * Napisati program koji uèitava neodreðeni broj cijelih brojeva (nula prekida unos) 
	 * te ispisuje koliko je brojeva bilo iznad ili jednako prosjeku svih unešenih brojeva 
	 * a koliko je bilo brojeva ispod prosjeka. 
	 * Pretpostavimo da je maksimalan niz brojeva koje korisnik može unijeti 100.
	 */

	public static void main(String[] args) {
		
		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Kreiraj listu
		ArrayList<Integer> lista = new ArrayList<>();		
		
		int broj = -1;//Pocetni unos
		int suma = 0;//Zbir svih clanova
		int gore = 0;//broj clanova iznad ili jednakih prosjeku
		int dole = 0;//broj clanova ispod prosjeka
		
		//Izbaci pitanje korisniku da unese brojeve
		System.out.println("Molimo unosite brojeve(nula prekida niz):");
		while (!(broj == 0) && lista.size() < 100) {
			boolean pravilanUnos = true;
			while (pravilanUnos) {
				try {
					broj = unos.nextInt();
					if (broj != 0)
						lista.add(broj);
					suma += broj;
					pravilanUnos = false;
				} catch (Exception e) {
					System.err.println("Pogresan unos! Pokusajte ponovo!");
					unos.nextLine();
				}
			}
		}
		
		//Izracunaj prosjek
		double prosjek = (double) suma / lista.size();
		
		//Sortiraj clanove liste
		Collections.sort(lista);
		for(int i = 0; i < lista.size(); i++){
			if(lista.get(i) >= prosjek){
				gore++;
			}else{
				dole++;
			}
		}
		
		//Ispisi rezultat
		System.out.println(lista);
		System.out.println("Prosjek: " + prosjek);
		System.out.println("Brojeva iznad ili u prosjeku: " + gore);
		System.out.println("Brojeva ispod prosjeka: " + dole);
		
		unos.close();
	}

}
