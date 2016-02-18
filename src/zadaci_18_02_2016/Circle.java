package zadaci_18_02_2016;

/**
 * Naziv klase: Circle
 * 
 * @author Dejan Mladjenovic
 */

public class Circle extends GeometricObject {
	
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
	
	/**Vraca povrsinu kruga*/
	public double getArea(){
		return radius * radius * Math.PI;
	}
	/**Vraca ispis kruga*/
	public String toString(){
		return "Veci je krug sa poluprecnikom " + radius;
	}	
}
