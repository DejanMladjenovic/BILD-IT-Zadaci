package zadaci_19_01_2016;

/**
 * Naziv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak2 {
	
	/*
	 * Napisati program koji simulira nasumièno izvlaèenje karte iz špila od 52 karte. 
	 * Program treba ispisati koja karta je izvuèena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K) 
	 * te znak u kojem je data karta (Srce, Pik, Djetelina, Kocka). 
	 * Primjer: Karta koju ste izvukli je 10 u znaku kocke.
	 */

	/**Glavna metoda*/	
	public static void main(String[] args) {
		
		//Inicijalizuj oznake i pozicije
		String[] oznake = {"list", "srce", "djetelina", "kocka"};
		String[] pozicije = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"} ;
		
		//Inicijalizuj spil
		int[] spil = new int[52];
		for( int i = 0; i < spil.length; i++){
			spil[i] = i;
		}

		
		//Izmijesaj spil
		for(int i = 0; i < spil.length; i++){
			int indeks = (int)(Math.random() * spil.length);
			int privremeno = spil[i];
			spil[i] = spil[indeks];
			spil[indeks] = privremeno;
		}
		
		//Odredi poziciju karte
		int i = 0;
		String oznaka = oznake[spil[i] / 13];
		String pozicija = pozicije[spil[i] % 13];
		
		//Prikazi rezultat
		System.out.println("Karta koju ste izvukli je " + pozicija + " u znaku " + oznaka + ".");
		

	}

}
