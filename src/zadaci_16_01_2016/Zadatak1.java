package zadaci_16_01_2016;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak1 {
	
	/*
	 * Napisati program koji ispisuje sve prestupne godine, 10 po liniji, 
	 * od godine 101 do 2100, odvojene jednim spaceom. 
	 * Takoðer ispisati i ukupan broj prijestupnih godina u ovom vremenskom periodu.
	 */

	//Glavna metoda
	public static void main(String[] args) {
		
		//Inicijalizuj podatke
		int pocetak = 101;
		int kraj = 2100;
		int brojac = 0;
		
		//Izracunaj i ispisi prestupne godine, 10 po redu
		System.out.println("Prestupne godine od 101. do 2100.:\n");
		for(int i = pocetak; i <= kraj; i++){
			if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)){
				brojac++;
				if(brojac % 10 == 0){
					System.out.println(i);
				}else{
					System.out.print(i + " ");
				}
			}
		}
		
		//Ispisi koliko ima prestupnih godina u zadatom intervalu
		System.out.println("\n\nUkupno prestupnih godina: " + brojac);
	}
 
}
