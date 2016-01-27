package zadaci_27_01_2016;

/**
 * Naziv klase: Zadatak4
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak4 {
	
	/*
	 * Palindrome prime je prosti broj koji je takoðer i palindrom. 
	 * Na primjer, 131 je palindrome prime, kao i brojevi 313 i 757. 
	 * Napisati program koji ispisuje prvih 100 palindrome prime brojeva, 10 brojeva po liniji.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		int brojac = 0;//Brojac prostih palindrom brojeva
		int broj = 0;//Pocetni broj za provjeru
		
		//Ispisi rezultat
		System.out.println("Prosti palindrom brojevi:");
		while(brojac < 100){
			if(isPrime(broj) && isPalindrome(broj)){
				brojac++;
				if(brojac % 10 == 0){
					System.out.println(broj);
				}else{
					System.out.print(broj + " ");
				}
			}
			broj++;
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
	
	/**Metoda vraca revers unesenog broja*/
	public static int reverse(int number){
		
		int result = 0;
		while(number != 0){
			result = result * 10 + number % 10;
			number = number / 10;
		}
		return result;
	}	
	
	/**Vraca true ako je trazeni broj palindrom*/
	public static boolean isPalindrome(int number){
		
		if(number == reverse(number)){
			return true;
		}
		return false;
	}
	


}
