package zadaci_19_02_2016;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak3 {
	
	/*
	 * Write a test program that creates an Octagon object with side value 5 
	 * and displays its area and perimeter. Create a new object using 
	 * the clone method and compare the two objects using the compareTo method.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj objekat
		Octagon oct1 = new Octagon(5);
		System.out.println("Objekat1");
		System.out.println("Povrsina: " + oct1.getArea());
		System.out.println("Obim: " + oct1.getPerimeter());
		
		//Kreiraj clone objekat
		Octagon oct2 = new Octagon();
		oct2 = oct1.clone();
		System.out.println("\nObjekat2");
		System.out.println("Povrsina: " + oct2.getArea());
		System.out.println("Obim: " + oct2.getPerimeter());
		
		//Ispisi rezultat
		if(oct1.compareTo(oct2) > 0)
			System.out.println("Prvi objekat je veci!");
		else if(oct1.compareTo(oct2) < 0)
			System.out.println("Drugi objekat je veci!");
		else
			System.out.println("Objekti su jednaki!");
	}

}
