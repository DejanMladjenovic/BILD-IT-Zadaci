package zadaci_03_02_2016;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak5 {
	
	/*
	 * Napisati program koji generise 6 x 6 matricu nasumicno brojevima 0 i 1, ispisuje matricu
	 * i provjerava da li svaki red i svaka kolona ima paran broj jedinica
	 */

	/** Glavna metoda */
	public static void main(String[] args) {

		// Deklarisi i inicijalizuj matricu
		int[][] m = new int[6][6];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] = (int) (Math.random() * 2);
			}
		}

		// Ispisi matricu
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		//Izracunaj i ispisi da li je broj jedinica paran u svakom redu
		System.out.println();
		for(int i = 0; i < m.length; i++){
			int brojac = 0;
			for(int j = 0; j < m[0].length; j++){
				if(m[i][j] == 1)
					brojac++;
			}
			if(brojac % 2 == 0)
				System.out.println("Broj jedinica u " + (i + 1) + ". redu: paran.");
			else
				System.out.println("Broj jedinica u " + (i + 1) + ". redu: neparan.");
		}
		
		//Izracunaj i ispisi da li je broj jedinica paran u svakoj koloni
		System.out.println();
		for(int j = 0; j < m[0].length; j++){
			int brojac = 0;
				for(int i = 0; i < m.length; i++){
				if(m[i][j] == 1)
					brojac++;
			}
			if(brojac % 2 == 0)
				System.out.println("Broj jedinica u " + (j + 1) + ". koloni: paran.");
			else
				System.out.println("Broj jedinica u " + (j + 1) + ". koloni: neparan.");
		}

	}

}
