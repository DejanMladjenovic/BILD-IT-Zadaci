package zadaci_18_02_2016;

/**
 * Naziv klase: ComparableCircle
 * 
 * @author Dejan Mladjenovic
 */

public class ComparableCircle extends Circle implements Comparable<GeometricObject>{
	
	/*
	 * Define a class named ComparableCircle that extends Circle and implements Comparable.
	 */
	
	//Konstruktor
	public ComparableCircle(double radius){
		super(radius);
	}
	
	/**Metoda uporedjuje dva objekta*/
	@Override
	public int compareTo(GeometricObject o) {
		if(this.getArea() > o.getArea()){
			return 1;
		}
		else if(getArea() < o.getArea()){
			return -1;
		}else{
			return 0;
		}
	}
}
