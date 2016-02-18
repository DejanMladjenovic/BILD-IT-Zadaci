package zadaci_18_02_2016;

import java.util.ArrayList;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak5 {
	
	/*
	 * Rewrite the MyStack class in Listing 11.10 to perform 
	 * a deep copy of the list field.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj objekat
		MyStack stack1 = new MyStack();
		stack1.push(5);
		stack1.push(4.2);
		
		//Kreiraj objekat za kloniranje
		MyStack stack2 = new MyStack();
		stack2 = stack1.clone();
		
		//Ispisi rezultat
		System.out.println("Stack: " + stack1);
		System.out.println("Clone Stack: " + stack2);
	}
}