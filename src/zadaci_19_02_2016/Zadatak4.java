package zadaci_19_02_2016;

/**
 * Naziv klase: Zadatak4
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak4 {
	
	/*
	 * Write a method that sums the areas of all the geometric objects in an array. 
	 * The method signature is: public static double sumArea(GeometricObject[] a)
	 * Write a test program that creates an array of four objects (two circles and two rectangles) 
	 * and computes their total area using the sumArea method.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj objekte
		GeometricObject circle1 = new Circle(6);
		GeometricObject circle2 = new Circle(4);
		GeometricObject rectangle1 = new Rectangle(4, 6);
		GeometricObject rectangle2 = new Rectangle(3, 5);
		
		//Ubaci objekte u niz
		GeometricObject[] a = {circle1, circle2, rectangle1, rectangle2};
		//Ispisi rezultat
		System.out.println(sumArea(a));
	}
	
	/**Vraca sumu povrsina datih objekata*/
	public static double sumArea(GeometricObject[] a){
		
		double sum = 0;
		for(int i = 0; i < a.length; i++){
			sum += a[i].getArea();
		}
		return sum;
	}
}
