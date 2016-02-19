package zadaci_19_02_2016;

/**
 * Naziv klase: Octagon
 * 
 * @author Dejan Mladjenovic
 */

public class Octagon extends GeometricObject implements Comparable<GeometricObject>, Cloneable{
	
	/*
	 * Write a class named Octagon that extends GeometricObject 
	 * and implements the Comparable and Cloneable interfaces. 
	 * Assume that all eight sides of the octagon are of equal length. 
	 * The area canbe computed using the following formula:
	 *  area = (2 + 4/ korijen2)* side * side
	 */

	//Osobine
	private double side;
	
	//Konstruktor bez argumenata
	public Octagon(){
	}
	
	//Konstruktor sa odredjenom vrijednoscu
	public Octagon(double side){
		this.side =side;
	}
	
	/**Vraca povrsinu*/
	public double getArea(){
		return (2 + 4 / Math.sqrt(2)) * side * side;		
	}
	
	/**Vraca obim*/
	public double getPerimeter(){
		return side * 8;
	}
	
	/**Uporedjuje dva objekta*/
	public int compareTo(Octagon oct) {
		if (this.getArea() > oct.getArea())
			return 1;
		else if (this.getArea() == oct.getArea())
			return 0;
		else
			return -1;
	}
	
	/**Vraca kloniran objekat*/
	public Octagon clone() {
		Octagon clone = new Octagon(this.side);
		return clone;
	}	
	
}
