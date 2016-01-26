package zadaci_26_01_2016;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak3 {
	
	/*
	 * Napisati metodu sa sljedeæim headerom: public static int isPrime(int n) koja provjerava da li je broj prost/prime. 
	 * Napsati test program koji poziva ovu metodu i ispisuje sve proste brojeve u rasponu od 0 do 100000.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		int count = 0;//Brojac prostih brojeva
		//Prodji kroz zadati niz
		for(int i = 0; i < 10000; i++){
			if(isPrime(i)){
				count++;
				//Ispisi rezultat
				if(count % 10 == 0)
					System.out.println(i + " ");
				else
					System.out.print(i + " ");
			}
		}
	}
	
	/**Metoda vraca true ako je broj prost*/
	public static boolean isPrime(int number){
		
		for(int i = 2; i < number; i++){
			if(number % i == 0)
				return false;
		}
		return true;
	}


}
