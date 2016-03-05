package grupniProjekat;

/**
 * Naziv klase: Test
 * 
 * @author Dejan Mladjenovic
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	/**Glavna metoda*/
	public static void main(String[] args) throws Exception {
		
		//Kreiraj objekat
		WorldDaoConcrete test = new WorldDaoConcrete();
		
		//Konektuj se sa bazom podataka
		test.getConnected("world");
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Pitaj korisnika da unese broj za pretragu
		System.out.println("Unesite broj za pretragu(1-drzava, 2-stanovnistvo ili 3-grad):");
		int pretraga = 0;
		while(true){
			try{
				pretraga = unos.nextInt();
				if(pretraga != 1 ^ pretraga != 2 ^ pretraga != 3){
					System.out.println("Izaberite 1, 2 ili 3:");
					continue;
				}
				break;
			}catch(InputMismatchException e){
				System.out.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		ArrayList<Country> list = new ArrayList<>();//Lista drzava
		ArrayList<City> list1 = new ArrayList<>();//Lista gradova
		
		//Ispisi rezultat
		if(pretraga == 1){
			list.addAll(test.CountryName());
			printCountry();
			for(Country e: list)
				e.toPrint();
		}else if(pretraga == 2){
			list.addAll(test.Population());
			printCountry();
			for(Country e: list)
				e.toPrint();
		}else{
			list1.addAll(test.City());
			printCity();
			for(City e: list1)
				e.toPrint();
		}

	}
	
	/**Ispisuje zaglavlje za drzave*/
	public static void printCountry(){
		System.out.printf("%-5s%-15s%-15s%-15s%-15s%-12s%-15s\n", "Code", "Country", "Continent",
				"Surface Area", "Population", "GNP", "Local Name");
		System.out.println("---------------------------------------------------"
				+ "-------------------------------------");
	}
	
	/**Ispisuje zaglavlje za gradove*/
	public static void printCity(){
		System.out.printf("%-5s%-15s%-15s%-15s%-15s\n", "ID", "Name", "Country Code", "District", "Population");
		System.out.println("--------------------------------------------------------");
	}
}
