package zadaci_09_02_2016;

/**
 * Naziv klase: MyStringBuilder1
 * 
 * @author Dejan Mladjenovic
 */

public class MyStringBuilder1 {
	
	/*
	 * The StringBuilder class is provided in the Java library. 
	 * Provide your own implementation for the following methods
	 * (name the new class MyStringBuilder1):
	 * public MyStringBuilder1(String s);
	 * public MyStringBuilder1 append(MyStringBuilder1 s);
	 * public MyStringBuilder1 append(int i);
	 * public int length();
	 * public char charAt(int index);
	 * public MyStringBuilder1 toLowerCase();
	 * public MyStringBuilder1 substring(int begin, int end);
	 * public String toString();
	 */
	
	//Osobine
	String s;
	
	//Konstruktor
	public MyStringBuilder1(String s){
		this.s = s;
	}
	
	/**Vraca novi objekat kao zbir dva objekta*/
	public MyStringBuilder1 append(MyStringBuilder1 string){
		String str = this.s + string.s;
		return new MyStringBuilder1(str);
	}
	
	/**Vraca novi objekat kao zbir objekta i broja*/
	public MyStringBuilder1 append(int i){
		String string = this.s + i;
		return new MyStringBuilder1(string);
	}
	
	/**Vraca duzinu stringa*/
	public int length(){
		return this.s.length();
	}

	/**Vraca karakter na datom indeksu*/
	public char charAt(int index){
		return this.s.charAt(index);
	}
	
	/**Vraca objekat sa malim slovima*/
	public MyStringBuilder1 toLowerCase(){
		String string = "";
		for(int i = 0; i < s.length(); i++)
			string += Character.toLowerCase(s.charAt(i));
		return new MyStringBuilder1(string);
	}
	
	/**Vraca novi objekat kao substring datog objekta*/
	public MyStringBuilder1 substring(int begin, int end){
		String string = "";
		for(int i = begin; i < s.length(); i++)
			string += s.charAt(i);
		return new MyStringBuilder1(string);
	}
	
	/**Vraca vrijednost objekta*/
	public String toString(){
		return this.s;
	}
}
