package zadaci_03_02_2016;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak1 {
	
	/*
	 * Pretpostavimo da su sedmicni sati zaposlenih predstavljeni u matrici.
	 * Svaki red sadrzi sedam polja za sedam dana u sedmici.
	 * Pretpostavimo da ima 8 radnika.
	 * Napisati program koji prikazuje radnike 
	 * i njihove ukupne sate sortirane u opadajucem redoslijedu.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		int[] sati = new int[8];//Ukupno sati po radniku
		int[] radnici = new int[8];//Ukupno radnika

		//Kreiraj matricu
		int[][] m = new int[8][7];
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[0].length; j++){
				m[i][j] = (int)(Math.random() * 8);
				sati[i] += m[i][j];
				radnici[i] = i;
			}
		}
		
		//Sortiraj radnike po radnim satima u opadajucem redoslijedu
		for(int i = 0; i < sati.length - 1; i++){
			for(int j = i + 1; j < sati.length; j++){
				if(sati[i] < sati[j]){
					int temp = sati[i];
					sati[i] = sati[j];
					sati[j] = temp;	
					int temp1 = radnici[i];
					radnici[i] = radnici[j];
					radnici[j] = temp1;
				}
			}
		}
		ispis(m);//Ispisi matricu
		
		//Ispisi rezultat
		System.out.println();
		for(int i = 0; i < 8; i++){
			System.out.println("Radnik " + radnici[i] + " ima " + sati[i] + " sati");
		}	
	}
	
	/**Metoda ispisuje sate za svakog radnika*/
	public static void ispis(int[][] m){
		System.out.println("          pon uto sri cet pet sub ned");
		for(int i = 0; i < m.length; i++){
			System.out.print("Radnik " + i + "|  ");
			for(int j = 0; j < m[0].length; j++){
				System.out.print(m[i][j] + "   ");
			}
			System.out.println();
		}
	}
}
