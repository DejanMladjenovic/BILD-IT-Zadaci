package zadaci_06_02_2016;

/**
 * naziv klase: StackOfIntegers
 * 
 * @author Dejan Mladjenovic
 */

public class StackOfIntegers {
	
	/*
	 * Design the StackOfIntegers class to store the factors of number (e.g., 2, 2, 2, 3, 5) 
	 * and retrieve and display them in reverse order.
	 */

	//Osobine
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;
	
	//Konstruktor bez argumenata sa uobicajenim kapacitetom 
	public StackOfIntegers(){	
		this(DEFAULT_CAPACITY);
	}

	//Konstruktor sa zadatim kapacitetom
	public StackOfIntegers(int capacity){
		this.elements = new int[capacity];
	}
	
	//Stavlja novi broj na kraj skladista
	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = value;
	}
	
	// Vraca zadnji element u skladistu i brise ga iz skladista
	public int pop() {
		return elements[--size];
	}
	
	//Vraca zadnji element u skladistu
	public int peek() {
		return elements[size - 1];
	}	
	
	// vraca true ako je skladiste prazno
	public boolean empty() {
		return size == 0;
	}
	
	// Vraca broj elemenata u skladistu
	public int getSize() {
		return size;
	}


}
