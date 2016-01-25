package zadaci_25_01_2016;

/**
 * Naziv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 */


public class Zadatak2 {
	
	/*
	 * Napisati program koji ispisuje sve proste brojeve od 2 do 1000, ukljuæujuæi i 2 i 1000. 
	 * Program treba da ispiše 8 brojeva po liniji te razmak izmeðu brojeva treba da bude jedan space.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		int brojac = 0;//Brojac prostih brojeva
		//Prodji kroz zadati niz
		for(int i = 2; i <= 1000; i++){
			if(isPrime(i)){
				brojac++;
				//Ispisi rezultat
				if(brojac % 8 == 0)
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
