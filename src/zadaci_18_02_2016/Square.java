package zadaci_18_02_2016;

/**
 * Naziv klase: Square
 * 
 * @author Dejan Mladjenovic
 */

public class Square extends GeometricObject implements Colorable{
	
	/*
	 * Design a class named Square that extends GeometricObject and implements Colorable.
	 * Implement howToColor to display the message Color all four sides. 
	 */

	//Osobine
	private double side;
	
	//Konstruktor bez argumenata
	public Square(){
	}
	
	//Konstruktor sa odredjenim vrijednostima
	public Square(String color, boolean filled, double side) {
		super(color, filled);
		this.side = side;
	}
	/**Vraca povrsinu*/
	public double getArea() {
		return side * side;
	}	
	/**poziva interfejs*/
	@Override
	public void howToColor() {
		System.out.println("Color all four sides.");
	}
}