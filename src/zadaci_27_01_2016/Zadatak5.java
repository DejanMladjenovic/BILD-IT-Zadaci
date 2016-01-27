package zadaci_27_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak5 {
	
	/*
	 * Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva razlièita pakovanja. 
	 * Želimo napisati program koji uporeðuje cijene ta dva pakovanja. 
	 * Program pita korisnika da unese težinu i cijenu oba pakovanja te ispisuje koje pakovanje ima bolju cijenu.
	 */
	
	/**Glavna metoda*/
	public static void main(String[] args) {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		//Prvi proizvod
		System.out.println("Prvi proizvod");
		
		//Izbaci pitanje korisniku da unese tezinu
		System.out.println("Molimo unesite tezinu( u kg):");
		double tezina1 = unosBrojeva(unos);
		
		//Izbaci pitanje korisniku da unese cijenu
		System.out.println("Molimo unesite cijenu( u KM):");
		double cijena1 = unosBrojeva(unos);
		
		//Drugi proizvod
		System.out.println("Drugi proizvod");
		
		//IZbaci pitanje korisniku da unese tezinu
		System.out.println("Molimo unesite tezinu( u kg):");
		double tezina2 = unosBrojeva(unos);
		
		//IZbaci pitanje korisniku da unese cijenu
		System.out.println("Molimo unesite cijenu( u KM):");
		double cijena2 = unosBrojeva(unos);
	
		//Ispisi cijenu po kilogramu za oba proizvoda
		System.out.println("\nPrvi proizvod");
		System.out.println("Cijena po kilogramu :" + (int)((cijena1 / tezina1) * 1000) / 1000.0 + " KM.");
		
		System.out.println("Drugi proizvod");
		System.out.println("Cijena po kilogramu :" + (int)((cijena2 / tezina2) * 1000) / 1000.0 + " KM.");
		
		//Uporedi koji proizvod ima bolju cijenu
		if((cijena1 / tezina1) < (cijena2 / tezina2)){
			System.out.println("Prvi proizvod ima bolju cijenu!");
		}else if((cijena1 / tezina1) > (cijena2 / tezina2)){
			System.out.println("Drugi proizvod ima bolju cijenu!");
		}else{
			System.out.println("Proizvodi imaju istu cijenu!");
		}
		
	}
	
	/**Metoda obradjuje izuzetke*/
	private static double unosBrojeva(Scanner unos){
		
		while(true){
			try{
				return unos.nextDouble();
			}catch(InputMismatchException e){
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
	}


}
