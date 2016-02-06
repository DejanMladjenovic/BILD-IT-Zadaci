package zadaci_06_02_2016;

/**
 * Naziv klase: MyInteger
 * 
 * @author Dejan Mladjenovic
 */

public class MyInteger {
	
	/*
	 * Design a class named MyInteger. The class contains:
	 * An int data field named value that stores the int value represented by this object.
	 * A constructor that creates a MyInteger object for the specified int value.
	 * A getter method that returns the int value.
	 * The methods isEven(), isOdd(), and isPrime() that return true if the 
	 * value in this object is even, odd, or prime, respectively.
	 * The static methods isEven(int), isOdd(int), and isPrime(int) that
	 * return true if the specified value is even, odd, or prime, respectively.
	 * The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) 
	 * that return true if the specified value is even, odd,or prime, respectively.
	 * The methods equals(int) and equals(MyInteger) that return true if
	 * the value in this object is equal to the specified value.
	 * A static method parseInt(char[]) that converts an array of numeric
	 * characters to an int value.
	 * A static method parseInt(String) that converts a string into an int value.
	 */
	
	//Osobine
	int value;
	
	//Konstruktor
	public MyInteger(int value){
		this.value = value;
	}
	
	//Geter
	public int getValue(){
		return value;
	}
	
	//Vraca true ako je vrijednost parna
	public boolean isEven(){
		return this.value % 2 == 0;
	}
	
	//Vraca true ako je vrijednost neparna
	public boolean isOdd(){
		return this.value % 2 != 0;
	}
	
	//Vraca true ako je vrijednost prost broj
	public boolean isPrime(){
		for(int i = 2; i < this.value / 2; i++)
			if(this.value % i == 0)
				return false;
		return true;
	}
	
	//Vraca true ako je dati broj paran
	public static boolean isEven(int value){
		return value % 2 == 0;	
	}
	
	//Vraca true ako je dati broj neparan
	public static boolean isOdd(int value){
		return value % 2 != 0;
	}
	
	//Vraca true ako je dati broj prost
	public static boolean isPrime(int value){
		for(int i = 2; i < value / 2; i++)
			if(value % i == 0)
				return false;
		return true;
	}
	
	//Vraca true ako je vrijednost objekta parna
	public static boolean isEven(MyInteger integer){
		return isEven(integer.value);
	}
	
	//Vraca true ako je vrijednost objekta neparna
	public static boolean isOdd(MyInteger integer){
		return isOdd(integer.value);
	}
	
	//Vraca true ako je vrijednost objekta prost broj
	public static boolean isPrime(MyInteger integer){
		return isPrime(integer.value);
	}

	//Provjerava jednakost dvije vrijednosti
	public boolean equals(int value){
		return this.value == value;
	}
	
	//Provjerava jednakost dva objekta
	public boolean equals(MyInteger integer){
		return this.value == integer.value;
	}
	
	//Pretvara niz karaktera u broj
	public static int parseInt(char[] numbers){
		String string = "";
		for(int i = 0; i < numbers.length; i++)
			string += numbers[i];
		return Integer.valueOf(string);
	}
	
	//Pretvara string u broj
	public static int parseInt(String string){
		return Integer.valueOf(string);
	}
}
