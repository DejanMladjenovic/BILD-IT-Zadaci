package zadaci_10_02_2016;

/**
 * Naziv klase: GeometricObject
 * 
 * @author Dejan Mladjenovic
 */

public class GeometricObject {
	
	/*
	 * Design class GeometricObject with data fields: color(String) and filled(boolean).
	 * A no-arg constructor that creates a default geometricObject.
	 * A constructor with specified color and filled.
	 * Getters and setters for all data fields
	 * 
	 */
	
	//Osobine
	private String color;
	private boolean filled;
	
	//Konstruktor bez argumenata
	public GeometricObject(){	
	}
	
	//Konstruktor sa odredjenom bojom i popunom
	public GeometricObject(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}

	/**Vraca boju objekta*/
	public String getColor() {
		return color;
	}

	/**Postavlja boju datom objektu*/
	public void setColor(String color) {
		this.color = color;
	}

	/**Provjerava da li je objekat popunjen*/
	public boolean isFilled() {
		return filled;
	}

	/**Postavlja istinitost popune objekta*/
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	/**Vraca ispisane vrijednosti objekta*/
	public String toString(){
		return "Boja: " + color + "\n i popunjen: " + filled;
	}
}
