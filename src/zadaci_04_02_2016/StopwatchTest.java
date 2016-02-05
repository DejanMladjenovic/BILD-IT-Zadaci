package zadaci_04_02_2016;

/**
 * Naziv klase: StopwatchTest
 * 
 * @author Dejan Mladjenovic
 */

public class StopwatchTest {
	
	/*
	 * Napisati test program koji implementira klasu Stopwatch, i mjeri koliko je potrebno vremena 
	 * da se sortira 10000 brojeva koristeci se metodom "selection sort"
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj i deklarisi niz
		int[] niz = new int[10000];
		
		//Kreiraj objekat
		Stopwatch test = new Stopwatch();
		
		test.start();//Ukljuci stopericu
		sort(niz(niz));//Sortiraj niz
		test.end();//Iskljuci stopericu
		
		//Ispisi rezultat
		System.out.println("Vrijeme potrebno za sortiranje 10000 brojeva je: " + test.getElapsedTime() + " ms.");
		
			
			
	}
	
	/**Metoda inicijalizuje niz*/
	public static int[] niz(int[] niz){
		for(int i = 0; i < niz.length; i++)
			niz[i] = (int)(Math.random() * 100);
		return niz;
	}
	
	/**Metoda vraca sortiran niz*/
	public static int[] sort(int[] niz){
		
		for(int i = 0; i < niz.length - 1; i++){
			for(int j = i + 1; j < niz.length; j++){
				if(niz[j] < niz[i]){
					int temp = niz[i];
					niz[i] = niz[j];
					niz[j] = temp;
				}
			}
		}
		return niz;
	}
}
