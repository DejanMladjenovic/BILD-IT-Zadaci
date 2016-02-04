package zadaci_03_02_2016;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak3 {
	
	/*
	 * Napisati program koji nasumicno upisuje 0 i 1 u matricu 4 x 4, ispisati matricu
	 * i naci prvi red i prvu kolonu sa najvise jedinica.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		// Deklarisi i inicijalizuj matricu
		int[][] m = new int[4][4];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; i++) {
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

		// Odredi red sa najvise jedinica
		int red = 0;
		int redBrojac = 0;
		int redMax = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (m[i][j] == 1)
					redBrojac++;
			}
			if (redBrojac > redMax) {
				redMax = redBrojac;
				red = i + 1;
				redBrojac = 0;
			} else {
				redBrojac = 0;
			}
		}

		// Odredi kolonu sa najvise jedinica
		int kolona = 0;
		int kolonaBrojac = 0;
		int kolonaMax = 0;
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				if (m[i][j] == 1)
					kolonaBrojac++;
			}
			if (kolonaBrojac > kolonaMax) {
				kolonaMax = kolonaBrojac;
				kolona = j + 1;
				kolonaBrojac = 0;
			} else {
				kolonaBrojac = 0;
			}
		}

		// Ispisi rezultat
		System.out.println("Red sa najvise jedinica: " + red);
		System.out.println("Kolona sa najvise jedinica: " + kolona);
	}
}
