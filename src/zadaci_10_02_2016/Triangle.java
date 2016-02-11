package zadaci_10_02_2016;

/**
 * Naziv klase: Triangle
 * 
 * @author Dejan Mladjenovic
 */

public class Triangle extends GeometricObject {
	
	/*
	 * Design a class named Triangle that extends GeometricObject. The class contains: 
	 * Three double data fields named side1, side2, and side3 with default
	 * values 1.0 to denote three sides of the triangle
	 * A no-arg constructor that creates a default triangle.
	 * A constructor that creates a triangle with the specified side1, side2, and side3
	 * The accessor methods for all three data fields.
	 * A method named getArea() that returns the area of this triangle
	 * A method named getPerimeter() that returns the perimeter of this triangle
	 * A method named toString() that returns a string description for the triangle
	 */
	
	//Osobine
	private double side1;
	private double side2;
	private double side3;
	
	//Konstruktor bez argumenata
	public Triangle(){
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}
	
	//Konstruktor sa odredjenim stranama
	public Triangle(double a, double b, double c, String color, boolean filled){
		this.side1 = a;
		this.side2 = b;
		this.side3 = c;
		setColor(color);
		setFilled(filled);
	}
	
	/**Vraca prvu stranu trougla*/
	public double getSide1(){
		return side1;
	}
	
	/**Vraca drugu stranu trougla*/
	public double getSide2(){
		return side2;
	}
	
	/**Vraca trecu stranu trougla*/
	public double getSide3(){
		return side3;
	}
	
	/**Vraca obim trougla*/
	public double getPerimeter(){
		return side1 + side2 + side3;
	}
	
	/**Vraca povrsinu trougla*/
	public double getArea(){
		double h = getPerimeter() / 2;
		double area = Math.sqrt(h * (h - side1) * (h - side2) * (h - side3));
		return area;
	}
	
	/**Vraca ispisane vrijednosti trougla*/
	public String toString(){
		return "Trougao: strana1 = " + side1 + ", strana2 = " + side2 + ", strana3 = " + side3;
	}
}
