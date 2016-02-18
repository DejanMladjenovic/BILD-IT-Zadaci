package zadaci_18_02_2016;

public abstract class GeometricObject implements Comparable<GeometricObject>{

	/*
	 *Modify the GeometricObject class to implement the Comparable interface, 
	 *and define a static max method in the GeometricObject class 
	 *for finding the larger of two GeometricObject objects.
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
	/**Vraca povrsinu*/
	public abstract double getArea();
	
	/**Uporedjuje dva objekta*/
	public int compareTo(GeometricObject object) {
		if (this.getArea() > object.getArea())
			return 1;
		else if (this.getArea() < object.getArea())
			return -1;
		else
			return 0;
	}
	/**Vraca najveci objekat*/
	public static GeometricObject max(GeometricObject object1, GeometricObject object2) {
		if (object1.compareTo(object2) == 1)
			return object1;
		else
			return object2;
	}
}
