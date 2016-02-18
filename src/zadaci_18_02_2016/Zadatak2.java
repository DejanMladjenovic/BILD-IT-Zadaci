package zadaci_18_02_2016;

/**
 * Naziv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak2 {
	
	/*
	 * Write a test program that uses the max method to find the larger 
	 * of two circles and the larger of two rectangles.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj dva kruga
		GeometricObject circle1 = new Circle(3);
		GeometricObject circle2 = new Circle(4);
		
		//Kreiraj dva pravougaonika
		GeometricObject rectangle1 = new Rectangle(2,3);
		GeometricObject rectangle2 = new Rectangle(4,2);
 		
		//Ispisi rezultat
		System.out.println(GeometricObject.max(circle1,circle2).toString());
		System.out.println();
		System.out.println(GeometricObject.max(rectangle1, rectangle2));
	}
}