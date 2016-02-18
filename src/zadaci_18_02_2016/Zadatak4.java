package zadaci_18_02_2016;

/**
 * Naziv klase: Zadatak4
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak4 extends Square {
	
	/*
	 * Write a test program that creates an array of five GeometricObjects. For each object 
	 * in the array, display its area and invoke its howToColor method if it is colorable.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//kreiraj objekte
		GeometricObject object1 = new Square("green", true, 2);
		GeometricObject object2 = new Square("white", true, 5);
		GeometricObject object3 = new Circle(2);
		GeometricObject object4 = new Square("", false, 3);
		GeometricObject object5 = new Circle(3);
		
		//Kreiraj niz objekata
		GeometricObject[] list = {object1, object2, object3, object4, object5};

		//Ispisi rezultat
		for(int i = 0; i < list.length; i++) {
			if(list[i] instanceof Colorable) {
				System.out.print("Object" + (i + 1) + " area is: " + list[i].getArea() + " ");
				((Colorable) list[i]).howToColor();
			}else
				System.out.println("Object" + (i + 1) + " area is: " + list[i].getArea() + " ");
		}
	}
}

