package zadaci_18_02_2016;

/**
 * Naziv klase: Rectangle
 * 
 * @author Dejan Mladjenovic
 */

public class Rectangle extends GeometricObject{

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
		return "Veci je pravougaonik sa stranicama " + this.height
				+ " i " + this.width;
	}
}