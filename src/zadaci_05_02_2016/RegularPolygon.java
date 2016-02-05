package zadaci_05_02_2016;

/**
 * Naziv klase: RegularPolygon
 * 
 * @author Dejan Mladjenovic
 */

public class RegularPolygon {
	
	/*
	 * Design a class named regularPolygon that contains:
	 * A private int data field named n that defines the number of sides in the polygon with default value 3.
	 * A private double data field named side that stores the length of the side with default value 1.
	 * A private double data field named x that defines the x-coordinate of the polygon’s center with default value 0.
	 * A private double data field named y that defines the y-coordinate of the polygon’s center with default value 0.
	 * A no-arg constructor that creates a regular polygon with default values.
	 * A constructor that creates a regular polygon with the specified number of sides and length of side, centred at (0, 0).
	 * A constructor that creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates.
	 * The accessor and mutator methods for all data fields.
	 * The method getPerimeter() that returns the perimeter of the polygon.
	 * The method getArea() that returns the area of the polygon. 
	 * The formula for computing the area of a regular polygon is:
	 * Area = (n*s*s) / 4*tan(PI/n)
	 */
	
	//Osobine
	private int n;
	private double side;
	private double x;
	private double y;
	
	//Konstruktori
	public RegularPolygon(){
		this.n = 3;
		this.side = 1;
		this.x = 0;
		this.y = 0;
	}
	
	public RegularPolygon(int n, double side){
		this.n = n;
		this.side = side;
		this.x = 0;
		this.y = 0;
	}
	
	public RegularPolygon(int n, double side, double x, double y){
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	//Geteri i seteri
	public int getN(){
		return n;
	}
	
	public void setN(int n){
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	//Vraca vrijednost obima
	public double getPerimeter(){
		return n * side;
	}
	
	//Vraca vrijednost povrsine
	public double getArea(){
		return (n * side * side) / (4 * Math.tan(Math.PI / n));
	}

	//Ispisuje povrsinu i obim za svaki objekat
	public String toString(){
		return "Perimeter: " + (int)(getPerimeter() * 100) / 100.0 
				+ "\nArea: " + (int)(getArea() * 100) / 100.0;
	}

}