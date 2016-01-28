package miniProjekat2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: CreditCardValidation
 * 
 * @author Dejan Mladjenovic
 */

public class CreditCardValidation {
	
	/*
	 * Napisati program za validaciju kreditnih kartica. Kartica mora sadrzavati izmedju 13 i 16 karaktera.
	 * Mora poceti sa 4 (Visa), 5 (Master), 37 (American) ili 6 (Discover).
	 */

	/**Main method*/
	public static void main(String[] args) {
		
		//Create scanner object
		Scanner unos = new Scanner(System.in);

		//Ask user to import number of the card
		System.out.println("Unesite broj kartice:");
		long number;
		while(true){
			try{
				number = unos.nextLong();
				break;
			}catch(InputMismatchException e){
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		//Check card
		if(isValid(number))
			System.out.println("Credit card is valid!");
		else
			System.out.println("Credit card is invalid!");
		
	}
	
	/**Return true if the card number is valid*/
	public static boolean isValid(Long number){
		if((sumOfDoubleEvenPlace(number) + sumOfoddPlace(number)) % 10 == 0 && getSize(number) > 12 
				&& getSize(number) < 17 && ((prefixMatches(number, 1) || prefixMatches(number, 2)))){
			return true;
		}
		return false;
	}
	
	/**Return sum of doubled every second digit from right to left. If doubling of a digit 
	 * is two-digit number add up the two digits to get a single-digit number*/
	public static int sumOfDoubleEvenPlace(long number){
		int sum = 0;
		while(number > 0){
			number /= 10;
			sum += getDigit((int)(number % 10) * 2);
			number /= 10;
		}
		return sum;
	}
	
	/**Return this number if it is a single digit, otherwise,
	 * return the sum of the two digits*/
	public static int getDigit(int number){
		int sum;
		if(number < 10)
			return number;
		else{
			int digit1 = number / 10;
			int digit2 = number % 10;
			sum = digit1 + digit2;
		}
		return sum;
		
	}
	
	/**Return sum of odd-place digits in number*/
	public static int sumOfoddPlace(long number){
		int sum = 0;
		while(number > 0){
			if(Long.toString(number).toCharArray().length % 2 == 0){
				sum += number % 10;
				number /= 100;
			}else{
				number /= 10;
			}	
		}
		return sum;
	}
	
	/**Return true if the digit d is a prefix for number*/
	public static boolean prefixMatches(long number, int d){

		if ((getPrefix(number, d) == 4) || (getPrefix(number, d) == 5)
				|| (getPrefix(number, d) == 37) || (getPrefix(number, d) == 6)){
			return true;
		}
		return false;
	}
	
	/**Return the number of digits in the number*/
	public static int getSize(long d){
		int count = 0;
		while(d > 0){
			count++;
			d /= 10;
		}
		return count;
		
	}
	
	/**Return the first k number of digits from number. If the
	 * number of digits in number is less than k, returns number*/
	public static long getPrefix(long number, int k) {
		if (getSize(number) < k) {
			return number;
		} else {

			int size = (int) getSize(number);

			for (int i = 0; i < (size - k); i++) {
				number = number / 10;
			}

			return number;
		}
	}

}
