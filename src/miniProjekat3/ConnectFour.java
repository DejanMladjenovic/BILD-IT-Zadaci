package miniProjekat3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: ConnectFour
 * 
 * @author Dejan Mladjenovic
 */

public class ConnectFour {
	
	/*
	 *Napisati program za igru: Connect Four. Igru igraju dva igraca naizmjenicno.
	 *Tabla se sastoji od 6 redova i 7 kolona.
	 *Pobjednik je onaj ko postigne 4 poena u liniji(red, kolona ili dijagonala).
	 *U suprotnom, ako se tabla ispuni do kraja igra zavrsava bez pobjednika.   
	 */
	
	public static char igrac;//Igrac na potezu
	public static int kolona;//Unos kolone od korisnika

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		//Kreiraj i inicijalizuj matricu
		char[][] m = new char[7][7];
		for(int i = 0; i < 6; i++)
			for(int j = 0; j < 7; j++)
				m[i][j] = ' ';
		
		ispis(m);//Ispisi matricu
		igrac = 'R';//Pocetni igrac
		
		while (!jePuna(m)) {
			//Izbaci pitanje korisniku da unese broj kolone
			System.out.println("Postavite " + igrac + " disk u kolonu(0-6):");
			do {
				kolona = unosBrojeva(unos);
				if (kolona < 0 || kolona > 6 ){
					System.out.println("Pogresan broj! Pokusajte ponovo:");
					continue;
				}else if (jeZauzeta(m)) {
					System.out.println("Kolona je puna! Izaberite drugu kolonu:");
					continue;
				}
				break;
			} while ((kolona < 0 || kolona > 6) || jeZauzeta(m));

			ispis(m);//ispisi matricu
			
			//Ispis za slucaj pobjede
			if(pobjeda(m)){
				System.out.println("\n---Pobjeda!---\nPobjednik je " + igrac);
				System.exit(0);
			}
			igrac();//Promijeni igraca
		}
		//Ispis za slucaj nerijesenog rezultata
		System.out.println("\nNerijeseno!");	
		
		unos.close();
	}
	
	/**Metoda vraca true ako je matrica popunjena*/
	public static boolean jePuna(char[][] m){
				
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 7; j++){
				if(m[i][j] == ' '){
					return false;
				}
			}
		}
		return true;
	}
	
	/**Metoda vraca true ako je pozicija zauzeta*/
	public static boolean jeZauzeta(char[][] m){
		
		for(int i = 5; i >= 0; i--)
			for(int j = 0; j < 7; j++)
				if(m[i][kolona] == m[i][j] && m[i][kolona] == ' '){
					m[i][kolona] = igrac;					
					return false;
				}else	
					continue;
		return true;
	}
	
	/**Metoda ispisuje matricu*/
	public static void ispis(char[][] polje){
		System.out.println();
		for(int i = 0; i < 6; i++){
			System.out.print("|");
			for(int j = 0; j < 7; j++){
				System.out.print(polje[i][j] + "|");
			}
			System.out.println();			
		}
		System.out.println("---------------");
		System.out.println("|0|1|2|3|4|5|6|");
	}
	
	/**Metoda vraca true ako je neko dosao do pobjede*/
	public static boolean pobjeda(char[][] m){
		
		//Provjera za redove
		for(int i = 5; i >= 0; i--){
			int brojac = 1;
			for(int j = 0; j < 6; j++){
				if(m[i][j] != ' ' && m[i][j] == m[i][(j + 1)])
					brojac++;
				else
					brojac = 1;
				if(brojac == 4)
					return true;				
			}
		}
		
		//Provjera za kolone
		for(int j = 0; j < 7; j++){
			int brojac = 1;
			for(int i = 6; i >= 1; i--){
				if(m[i][j] != ' ' && m[i][j] == m[(i - 1)][j])
					brojac++;
				else
					brojac = 1;
				if(brojac == 4)
					return true;
			}
		}
		
		//Provjera za dijaonale /
		for(int i = 5; i >= 3; i--){
			for(int j = 0; j < 4; j++){
				if(m[i][j] != ' ' && m[i][j] == m[(i - 1)][(j + 1)] 
						&& m[i][j] == m[(i - 2)][(j + 2)] && m[i][j] == m[(i - 3)][(j + 3)])
					return true;
			}
		}
		
		//Provjera za dijagonale \ 
		for(int i = 5; i >= 3; i--){
			for(int j = 3; j < 7; j++){
				if(m[i][j] != ' ' && m[i][j] == m[(i - 1)][(j - 1)] 
						&& m[i][j] == m[(i - 2)][(j - 2)] && m[i][j] == m[(i - 3)][(j - 3)])
					return true;
			}	
		}						
		return false;
	}

	/**Metoda mijenja igraca*/
	public static void igrac(){
		if(igrac == 'R')
			igrac = 'Y';
		else if(igrac == 'Y')
			igrac = 'R';
	}
	
	/**Metoda obradjuje izuzetke int tipa*/
	private static int unosBrojeva(Scanner unos){
		
		while(true)
			try{
				return unos.nextInt();
			}catch(InputMismatchException e){
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
	}	
}
