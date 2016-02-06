package zadaci_06_02_2016;

/**
 * Naziv klase PrimeNumbers
 * 
 * @author Dejan Mladjenovic
 */

public class PrimeNumbers {
	
	/*
	 * Write a program that displays all the prime numbers less than 120 in decreasing order. 
	 * Use the StackOfIntegers class to store the prime numbers (e.g., 2, 3, 5, ...) 
	 * and retrieve and display them in reverse order.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj skladisni objekat
		StackOfIntegers stack = new StackOfIntegers();
		
		//Unesi rezultat u skladiste
		for(int i = 1; i < 120; i++){
			if(isPrime(i)){
				stack.push(i);
			}
		}
		//Ispisi rezultat
		System.out.println("Prosti brojevi od 120 pa nanize su:");
		while(!stack.empty()){
			System.out.print(stack.pop() + " ");
		}
		
	}
	
	/**Vraca true ako je broj prost*/
	public static boolean isPrime(int n){
		for(int i = 2; i <= n / 2; i++)
			if(n % i == 0)	
				return false;
			return true;
	}


}
