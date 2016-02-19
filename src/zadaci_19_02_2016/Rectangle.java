package zadaci_19_02_2016;

/**
 * Naziv klase: Rectangle
 * 
 * @author Dejan Mladjenovic
 */

public class Rectangle extends GeometricObject implements Comparable<GeometricObject> {
	
	/*
	 * Rewrite the Rectangle class in Listing 13.3 to extend GeometricObject 
	 * and implement the Comparable interface. Override the equals method in the Object class. 
	 * Two Rectangle objects are equal if their areas are the same.
	 */

	//Osobine
	double width;
	double height;

	//Konstruktor bez argumenata
	public Rectangle() {
	}

	//konstruktor sa odredjenim vrijednostima
	public Rectangle(double Width, double Height) {
		this.width = Width;
		this.height = Height;
	}
	
	/**Vraca povrsinu*/
	public double getArea() {
		return width * height;
	}
	
	/**Vraca ispis objekta*/
	public String toString() {
		return "Pravougaonik stranica " + this.height + " i " + this.width;
	}
	
	/**Provjerava da li su dva pravougaonika ista*/
	public boolean equals(Object rectangle) {
		if (this.getArea() == ((GeometricObject) rectangle).getArea())
			return true;
		return false;
	}	
}
