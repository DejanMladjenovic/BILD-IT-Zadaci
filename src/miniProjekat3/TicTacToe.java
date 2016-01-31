package miniProjekat3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: TicTacToe
 * 
 * @author Dejan Mladjenovic
 */

public class TicTacToe {
	/*
	 * Napisati program za igru "Iks-Oks". Igru igraju dva igraca naizmjenicno.
	 * Tabla se sastoji od 3 reda i 3 kolone. 
	 * Pobjednik je onaj ko postigne 3 poena u liniji(red, kolona ili dijagonala).
	 * U suprotnom, ako se tabla ispuni do kraja igra zavrsava bez pobjednika.
	 */
	
	private static char igrac;//Igrac na potezu
	private static int red;//Unos reda od korisnika
	private static int kolona;//Unos kolone od korisnika

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Kreiraj matricu
		char[][] m = new char[3][3];
		
		ispis(m);//Ispis matrice
		igrac = 'X';//Pocetni igrac
		
		while (!jePuna(m)) {
			do {
				// Izbaci pitanje korisniku da unese red
				System.out.println("Izaberite red( 0, 1 ili 2) za igraca: " + igrac);
				do {
					red = unosBrojeva(unos);
					if (red < 0 ^ red > 2)
						System.err.println("Pogresan broj! Pokusajte ponovo!");
				} while (red < 0 ^ red > 2);

				// Izbaci pitanje korisniku da unese kolonu
				System.out.println("Izaberite kolonu( 0, 1, ili 2) za igraca: " + igrac);
				do {
					kolona = unosBrojeva(unos);
					if (kolona < 0 ^ kolona > 2)
						System.err.println("Pogresan broj! Pokusajte ponovo!");
				} while (kolona < 0 ^ kolona > 2);
				
				//Ponovi unos ako je data pozicija vec popunjena
				if(jeZauzeta(m)){
					System.err.println("Polje je vec zauzeto! Pokusajte ponovo!");
					continue;
				}else 
					break;
			} while (jeZauzeta(m));
		
			ispis(m);//Ispis matrice
			
			//Ispis za slucaj pobjede
			if(pobjeda(m)){
				System.out.println("\n---Pobjeda!---\nPobjednik je " + igrac);
				System.exit(0);
			}
		
			igrac();//Promjena igraca na potezu		
		}
		//Ispis za slucaj nerijesenog rezultata
		System.out.println("Nerijeseno!");
	}

	
	/**Metoda vraca true ako je birana pozicija vec zauzeta*/
	public static boolean jeZauzeta(char[][] m){
	
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++){
				if ((m[red][kolona] == m[i][j]) && (m[i][j] != 'X' && m[i][j] != 'O')){
					m[red][kolona] = igrac;
					return false;
				}
			}	
		}
		return true;
	}
	
	/**Metoda ispisuje matricu*/
	public static void ispis(char[][] m){
	
		System.out.println("-------");
		for(int i = 0; i < 3; i++){
			System.out.print("|");
			for(int j = 0; j < 3; j++){
				System.out.print(m[i][j] + "|");
			}
			System.out.println();
			System.out.println("-------");
		}
	}
	
	/**Metoda mijenja igraca*/
	public static void igrac(){
	
		if(igrac == 'X')
			igrac = 'O';
		else if(igrac == 'O'){
			igrac = 'X';
		}
	}
	
	/**Metoda vraca true ako je matrica popunjena*/
	public static boolean jePuna(char[][] m){
				
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(m[i][j] != 'X' && m[i][j] != 'O'){
					return false;
				}
			}
		}
		return true;
	}
	
	/**Metoda vraca true ako je neko dosao do pobjede*/
	public static boolean pobjeda(char[][] m){
		
		//Provjera redova
		for (int i = 0, j = 0; i < 3; i++) {
			if (m[i][j] == 'X' ^ m[i][j] == 'O')
				if (m[i][j] == m[i][(j + 1)] && m[i][j] == m[i][(j + 2)])
					return true;
		}
		//Provjera kolona
		for (int i = 0, j = 0; j < 3; j++) {
			if (m[i][j] == 'X' ^ m[i][j] == 'O')
				if (m[i][j] == m[(i + 1)][j] && m[i][j] == m[(i + 2)][j])
					return true;
		}
		//Provjera dijagonale \
		if((m[0][0] == 'X' ^ m[0][0] == 'O') && m[0][0] == m[1][1] && m[0][0] == m[2][2])
			return true;
		//Provjera dijagonale /
		if((m[0][2] == 'X' ^ m[0][0] == 'O') && m[0][2] == m[1][1] && m[0][2] == m[2][0])
			return true;
		
		return false;
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
