package zadaci_06_02_2016;

/**
 * Naziv klase: MyPoint
 * 
 * @author Dejan Mladjenovic
 */

public class MyPoint {
	
	/*
	 * Design a class named MyPoint to represent a point with x- and y-coordinates. The class contains:
	 * The data fields x and y that represent the coordinates with getter methods.
	 * A no-arg constructor that creates a point (0, 0).
	 * A constructor that constructs a point with specified coordinates.
	 * A method named distance that returns the distance from this point to a 
	 * specified point of the MyPoint type.
	 * A method named distance that returns the distance from this point to 
	 * another point with specified x- and y-coordinates.
	 */
	
	//Osobine
	double x;
	double y;
	
	//Konstruktor bez argumenata sa koordinatama (0, 0)
	MyPoint(){
		this.x = 0;
		this.y = 0;
	}
	
	//Konstruktor sa odredjenim koordinatama
	MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	//Geteri
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	//Vraca udaljenost izmedju dvije tacke
	public double distance(MyPoint point){
		double distance = Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
		return distance;
	}

}
