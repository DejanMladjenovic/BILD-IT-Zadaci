package zadaci_06_02_2016;

/**
 * Naziv klase: MyIntegerTest
 * 
 * @author Dejan Mladjenovic
 */

public class MyIntegerTest {
	
	/*
	 * Write a client program that tests all methods in the class MyInteger.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Broj za provjeru
		int number = 23;

		//Kreiraj glavni objekat
		MyInteger integer1 = new MyInteger(23);
		
		//Testiraj metode za objekat
		System.out.println("Object1: " + integer1.getValue());
		System.out.println("Is even: " + integer1.isEven());//Da li je paran
		System.out.println("Is odd: " + integer1.isOdd());//Da li je neparan
		System.out.println("Is prime: " + integer1.isPrime());//Da li je prost
		System.out.println("Is equal to number: " + integer1.equals(number));//Da li je jednak broju
		System.out.println("Is equal to object2: " + integer1.equals(new MyInteger(24)));//Da li je jednak objektu
		
		//Testiraj metode za dati broj
		System.out.println("\nNumber: " + number);
		System.out.println("Is even: " + MyInteger.isEven(number));//Da li je paran
		System.out.println("Is odd: " + MyInteger.isOdd(number));//Da li je neparan
		System.out.println("Is prime: " + MyInteger.isPrime(number));//Da li je prost
		
		//Testiraj metodu za pretvaranje niza karaktera u broj 
		System.out.println(MyInteger.parseInt("235".toCharArray()));
		
		//Testiraj metodu za pretvaranje stringa u broj
		System.out.println(MyInteger.parseInt("235"));	
	}

}
