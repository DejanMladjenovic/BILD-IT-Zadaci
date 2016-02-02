package zadaci_02_02_2016;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak1 {
	
	/*
	 * Napisati program koji ispisuje 100 nasumicnih cijelih brjeva 
	 * od 0 do 9 i ispisuje koliko puta se svaki broj ponovio.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj niz 
		int[] brojac = new int[10];
		
		//Generisi 100 nasumicnih brojeva od 0 do 9
		for(int i = 0; i < 100; i++){
			int broj = (int)(Math.random() * 10);
			brojac[broj]++;
		}
		
		//Ispisi rezultat
		for(int i = 0; i < brojac.length; i++){
			System.out.println("Broj " + i + " se ponovio " + brojac[i] + " puta.");
		}

	}

}
