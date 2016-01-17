package zadaci_16_01_2016;

/**
 * Naziv klase: Zadatak4
 * 
 * @author Dejan Mladjenovic
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4 {
	
	/*
	 * Napisati metodu koja ispisuje n x n matricu korsiteæi sljedeæi header:
	 * public static void printMatrix(int n)
	 * Svaki element u matrici je ili 0 ili 1, generisan nasumièno. 
	 * Napisati test program koji pita korisnika da unese n te ispisuje n x n matricu.
	 */

	//Glavna metoda
	public static void main(String[] args) {
		
		try{
			//Kreiraj skener objekat
			Scanner unos = new Scanner(System.in);
			//Izbaci pitanje korisniku da unese velicinu matrice
			System.out.println("Unesite velicinu matrice:");
			int matrica = unos.nextInt();
			
			printMatrix(matrica);//Poziva metodu
			
			unos.close();
		}catch(InputMismatchException e){
			System.err.println("Greska u unosu!");
		}
	}
	
	//Metoda ispisuje matricu brojevima 0 i 1 nasumicno
	public static void printMatrix(int n){
		for( int i = 1; i <= n; i++ ){
			for( int k = 1; k <= n; k++ ){
				System.out.print((int)(Math.random() + 0.5) + " ");
			}
			System.out.println();
		}
	}


}
