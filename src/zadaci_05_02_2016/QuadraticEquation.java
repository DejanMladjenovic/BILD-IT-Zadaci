package zadaci_05_02_2016;

/**Naziv klase: QuadraticEquation
 * 
 * @author Dejan Mladjenovic
 */

public class QuadraticEquation {
	
	/*
	 * Design a class named QuadraticEquation for a quadratic equation
	 * axx + bx + x = 0. The class contains:
	 * Private data fields a, b, and c that represent three coefficients.
	 * A constructor for the arguments for a, b, and c.
	 * Three getter methods for a, b, and c.
	 * A method named getDiscriminant() that returns the discriminant, which is bb - 4ac.
	 * The methods named getRoot1() and getRoot2() for returning two roots of the equation:
	 * 
	 * These methods are useful only if the discriminant is nonnegative. Let these methods return 0 
	 * if the discriminant is negative.
	 */
	
	//Osobine
	private double a;
	private double b;
	private double c;
	
	
	//Konstruktor
	public QuadraticEquation(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	//Geteri
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	//Vraca vrijednost diskriminante
	public double getDiscriminant(){
		return b * b - 4 * a * c;
	}
	
	//Vraca vrijednost prve tacke
	public double getRoot1(){
		return ((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
	}
	
	//Vraca vrijednost druge tacke
	public double getRoot2(){
		return ((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
	}
}
