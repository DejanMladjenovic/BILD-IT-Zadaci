package miniProjekat4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: Battleship
 * 
 * @author Dejan Mladjenovic
 */

public class Battleship {
	
	/*
	 * Napraviti program za igricu Battleship. Polje za igru predstavlja matrica 5 x 5.
	 * U polju se nalaze tri neprijateljska broda. Korisnik unosi koordinate za gadjanje.
	 * Ukupno ima 10 pokusaja da pogodi sva tri broda.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		char[][] matrica = new char[5][5];//Kreiraj matricu za prikaz
		char[][] brodovi = new char[5][5];//Kreiraj matricu sa brodovima
		int[] potez = new int[2];//Kreiraj niz za unos podataka od korisnika
		int brojac = 10;//Brojac poteza
		
		brodoviMatrica(brodovi);//Inicijalizuj matricu sa brodovima
		mijesanje(brodovi);//Postavi brodove nasumicno u matrici
		pocetnaMatrica(matrica);//Inicijalizuj matricu za prikaz
		do {
			brojac--;
			ispis(matrica);//Ispisi matricu
			
			//Izbaci pitanje korisniku da izabere red
			System.out.print("Izaberite red: ");
			while(true){
				potez[0] = unosBrojeva(unos);
				if(potez[0] > 4 || potez[0] < 0){
					System.out.println("Pogresan broj! Pokusajte ponovo!");
					continue;
				}
				break;
			}
			//Izbaci pitanje korisniku da izabere kolonu
			System.out.print("Izaberite kolonu: ");
			while(true){
				potez[1] = unosBrojeva(unos);
				if(potez[1] > 4 || potez[1] < 0){
					System.out.println("Pogresan broj! Pokusajte ponovo!");
					continue;
				}
				break;
			}
			
			System.out.println("\n");
			provjera(potez, brodovi);//Provjeri da li je brod pogodjen
			prikaz(potez, brodovi, brojac);//Prikazi informacije o igri
			promjena(potez, brodovi, matrica);//Azuriraj prikaz
		} while (brojac > 0);
		//Kraj igre
		ispis(brodovi);
		System.out.println("Kraj igre!");
	}
	
	/**Metoda ispisuje matricu*/
	public static void ispis(char[][] m){
		
		System.out.println("   0  1  2  3  4");
		System.out.println("----------------");
		for(int i = 0; i < m.length; i++){
			System.out.print(i + "| ");
			for(int j = 0; j < m[i].length; j++){
				System.out.print(m[i][j] + "  ");		
			}
			System.out.println();
		}
	}
	
	/**Metoda inicijalizuje pocetnu matricu*/
	public static void pocetnaMatrica(char[][] m){
		for(int i = 0; i < m.length; i++)
			for(int j = 0; j < m[i].length; j++)
				m[i][j] = '-';
	}
	
	/**Metoda obnavlja matricu*/
	public static void promjena(int[] niz, char[][] brodovi, char[][] matrica){
		int brojac = 0;
		for(int i = 0; i < matrica.length; i++){
			for(int j = 0; j < matrica[i].length; j++){
				matrica[niz[0]][niz[1]] = brodovi[niz[0]][niz[1]];
				if(matrica[i][j] == 'X')
					brojac++;
				if(brojac == 3){
					ispis(matrica);
					System.out.println("\n<--Pobjeda-->");
					System.exit(0);
				}
			}	
		}	
		brojac = 0;
	}
	
	/**Metoda provjerava da li je brod pogodjen*/
	public static void provjera(int[] niz, char[][] m){
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				if(m[niz[0]][niz[1]] == 'X')
					System.out.println("Pogodak!");		
			}
		}
	}
	
	/**Metoda nasumicno postavlja brodove*/
	public static void mijesanje(char[][] m){
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
			int i1 = (int)(Math.random() * m.length);
			int j1 = (int)(Math.random() * m[i].length);
			char temp = m[i][j];
			m[i][j] = m[i1][j1];
			m[i1][j1] = temp;
			}
		}
	}
	
	/**Metoda inicijalizuje matricu sa brodovima*/
	public static void brodoviMatrica(char[][] m){
		m[0][0] = 'X';
		m[0][1] = 'X';
		m[0][2] = 'X';
		for(int i = 0; i < m.length; i++)
			for(int j = 0; j < m[i].length; j++){
				if(m[i][j] != 'X' )
					m[i][j] = '*';
			}
	}

	/**Metoda prikazuje informacije o igri*/
	public static void prikaz(int[] niz, char[][] m, int brojac){
		int red = 0;
		int kolona = 0;
		for(int i = 0; i < m.length; i++){
			if(m[niz[0]][i] == 'X')
				red++;
			if(m[i][niz[1]] == 'X')
				kolona++;
		}
		System.out.println("Broj pokusaja: " + brojac);
		System.out.println("Red " + niz[0] + " -> " + red + " brodova");
		System.out.println("Kolona " + niz[1] + " -> " + kolona + " brodova");
	}
	
	/**Metoda obradjuje izuzetke int tipa*/
	public static int unosBrojeva(Scanner unos){
		while(true){
			try{
				return unos.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Pogresan unos!Pokusajte ponovo!");
				unos.nextLine();
			}
		}
	}
}
