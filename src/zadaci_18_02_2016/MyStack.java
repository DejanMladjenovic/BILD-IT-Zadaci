package zadaci_18_02_2016;

import java.util.ArrayList;

/**Naziv klase: MyStack
 * 
 * @author Dejan Mladjenovic
 */

public class MyStack implements Cloneable {
	
	/*
	 * Rewrite the MyStack class in Listing 11.10 to perform 
	 * a deep copy of the list field.
	 */	
	
	//Kreiraj listu
	private ArrayList<Object> list = new ArrayList<>();
	
	//Konstruktor
	public MyStack(){
	}
	
	/**Provjerava da li je lista prazna*/
	public boolean isEmpty() {
		return list.isEmpty();
	}
	/**Vraca velicinu liste*/
	public int getSize() {
		return list.size();
	}
	/**Vraca poslednji clan liste*/
	public Object peek() {
		return list.get(getSize() - 1);
	}
	/**Vraca poslednji clan i brise ga iz liste*/
	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}
	/**Dodaje novi element u listu*/
	public void push(Object o) {
		list.add(o);
	}
	/**Ispisuje listu*/
	public String toString() {
		return list.toString();
	}
	/**Klonira podatke iz jednog objekta u drugi*/
	public MyStack clone() { 
		MyStack clone = new MyStack();
		for (int i = 0; i < this.getSize(); i++) {
			clone.push(this.list.get(i));
		}
		return clone;
	}
}
