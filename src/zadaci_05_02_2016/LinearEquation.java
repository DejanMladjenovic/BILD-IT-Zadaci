package zadaci_05_02_2016;

/**
 * Naziv klase: LinearEquation
 * 
 * @author Dejan Mladjenovic
 */

public class LinearEquation {
	
	/*
	 * Design a class named LinearEquation for a 2 * 2 system of linear equations:
	 * ax + by = e 
	 * cx + dy = f 
	 * x = (ed - bf) / (ad - bc)
	 * y = (af - ec) / (ad - bc)
	 * The class contains:
	 * Private data fields a, b, c, d,e, and f.
	 * A constructor with the arguments for a, b, c, d,e, and f.
	 * Six getter methods for a,b, c,d,e, and f.
	 * A method named isSolvable() that returns true if ad - bc is not 0.
	 * MethodsgetX() and getY() that return the solution for the equation.
	 */
	
	//Osobine
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	//Konstruktor
	public LinearEquation(double a, double b, double c, double d, double e, double f){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
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

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}
	
	//Vraca true ako rezultat nije 0
	public boolean isSolvable(){
		if(a * d - b * c != 0){
			return true;
		}
		return false;
	}
	
	//Vraca x vrijednost
	public double getX(){
		double x = (e * d - b * f) / (a * d - b * c);
		return x;
	}
	
	//Vraca y vrijednost
	public double getY(){
		double y = (a * f - e * c) / (a * d - b * c);
		return y;
	}

}
