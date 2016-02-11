package zadaci_10_02_2016;

import java.util.ArrayList;
import java.util.Date;
import javafx.scene.shape.Circle;

/**
 * Naziv klase: ArrayListObjects
 * 
 * @author Dejan Mladjenovic
 */

public class ArrayListObjects {
	
	/*
	 * Write a program that creates an ArrayList and adds a Loan
	 * object, a Date object, a string, and a Circle object to the list, and use a loop
	 * to display all the elements in the list by invoking the object’s toString() method.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj listu objekata
		ArrayList<Object> lista = new ArrayList<>();
		lista.add(new Loan(2000));
		lista.add(new Date());
		lista.add(new String("String"));
		lista.add(new Circle(5));
		
		//ispisi objekte
		for(int i = 0; i < lista.size(); i++){
			System.out.println(lista.get(i).toString());
		}
	}

}
