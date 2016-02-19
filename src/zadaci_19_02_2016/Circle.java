package zadaci_19_02_2016;

/**
 * Naziv klase: Circle
 * 
 * @author Dejan Mladjenovic
 */

public class Circle extends GeometricObject implements Comparable<GeometricObject> {
	
	/*
	 * Rewrite the Circle class in Listing 13.2 to extend GeometricObject 
	 * and implement the Comparable interface. Override the equals method in the Object class. 
	 * Two Circle objects are equal if their radii are the same.
	 */
	
	//Osobine
	double radius;
	
	//Konstruktor bez argumenata
	public Circle(){
	}
	
	//Konstruktor sa poluprecnikom
	public Circle(double radius){
		this.radius = radius;
	}
	
	//Konstruktor sa odredjenim vrijednostima
	public Circle(String color, boolean filled, double radius){
		super(color, filled);
		this.radius = radius;
	}
	/**Vraca radius*/
	public double getRadius(){
		return radius;
	}
	/**Vraca povrsinu kruga*/
	public double getArea(){
		return radius * radius * Math.PI;
	}
	/**Vraca ispis kruga*/
	public String toString(){
		return "Krug poluprecnika " + radius;
	}	
	/**Provjerava da li su dva kruga ista*/
	public boolean equals(Object c1) {
		if (this.getRadius() == ((Circle) c1).getRadius())
			return true;
		return false;
	}
}
