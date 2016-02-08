package miniProjekat4;

import java.util.Scanner;

/**Naziv klase: Hangman
 * 
 * @author Dejan Mladjenovic
 */

public class Hangman {
	
	/*
	 * Napisati program za igru Hangman. Program nasumicno bira rijec iz memorije
	 * i pita korisnika da pogadja slova. Nakon sto korisnik pogodi rijec ili
	 * pogrijesi ukupno 6 puta program zavrsava igru.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		//Izaberi rijec za pogadjanje
		char[] trazenaSlova = rijec().toCharArray();
		
		//String u koji upisujemo promasena slova
		String promasenaSlova ="";
		
		//Kreiraj string za unos slova
		char[] pogodiSlova = new char[trazenaSlova.length];
		for(int i = 0; i < trazenaSlova.length; i++){
			pogodiSlova[i] = '-';
		}	
	
		//Izbaci pitanje korisniku da unosi slova
		int brojPokusaja = 0;
		while(true){
			ispis(brojPokusaja);
			System.out.print("Trazena rijec: ");
			System.out.println(pogodiSlova);
			System.out.println("Promasena slova: " + promasenaSlova);
			System.out.print("Unesite slovo: ");
			char slovo =  unos.nextLine().toLowerCase().charAt(0);
			int temp = 0;
			
			//Provjeri da li trazena rijec sadrzi dato slovo
			for(int i = 0; i < trazenaSlova.length; i++){
				if(trazenaSlova[i] == slovo){
					pogodiSlova[i] = slovo;
				}else{
					temp++;
				}
				if(temp == trazenaSlova.length){
					brojPokusaja++;
					promasenaSlova += slovo + " ";
				}
				System.out.println("");
			}
			//Zavrsi igru
			kraj(brojPokusaja, trazenaSlova, pogodiSlova);
		}
	}
	
	/**Metoda ispisuje sliku*/
	public static void ispis(int a){
		String[] hangman = new String[7];
		hangman[0] = " ___\n|\n| \n| \n|____";
		hangman[1] = " ___\n|  o \n|\n| \n|____";
		hangman[2] = " ___\n|  o \n|  |\n|\n|____";
		hangman[3] = " ___\n|  o \n| /|\n|\n|____";
		hangman[4] = " ___\n|  o \n| /|\\\n| \n|____";
		hangman[5] = " ___\n|  o \n| /|\\\n| /\n|____";
		hangman[6] = " ___\n|  o \n| /|\\\n| / \\\n|____";
		System.out.println(hangman[a]);
	}
	
	/**Metoda bira string koji treba pogoditi*/
	public static String rijec() {
		String[] rijeci = { "patak", "dvogled", "vizija", "koma"};
		int rijec = (int) (Math.random() * rijeci.length);
		String trazenaRijec = rijeci[rijec];
		return trazenaRijec;
	}
	
	/**Metoda zavrsava igru*/
	public static void kraj(int a, char[] b, char[] c){
		if(a == 6){
			ispis(a);
			System.out.println("\n--Kraj igre!--");
			System.out.println("Trazena rijec je: " + String.valueOf(b));
			System.exit(0);
		}else if(String.valueOf(b).equals(String.valueOf(c))){
			System.out.println("\n--Kraj igre!--");
			System.out.println("\nCestitamo! Pogodili ste rijec!");
			System.out.println("Trazena rijec je: " + String.valueOf(c));
			System.exit(0);
		}
	}
}
