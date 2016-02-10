package zadaci_09_02_2016;

/**
 * Naziv klase: MyString1
 * 
 * @author Dejan Mladjenovic
 */

public class MyString1 {
	
	/*
	 * The String class is provided in the Java library.
	 * Provide your own implementation for the following methods 
	 * (name the new class MyString1):
	 * -public MyString1(char[] chars);
	 * -public char charAt(int index);
	 * -public int length();
	 * -public MyString1 substring(int begin, int end);
	 * -public MyString1 toLowerCase();
	 * -public boolean equals(MyString1 s);
	 * -public static MyString1 valueOf(int i);
	 */

	//Osobine
	char[] chars;
	
	//Konstruktor
	public MyString1(char[] chars){
		this.chars = chars;
	}
	
	/**Vraca karakter na datoj poziciji*/
	public char charAt(int index){
		return this.chars[index];
	}
	
	/**Vraca duzinu niza*/
	public int length(){
		return this.chars.length;
	}
	
	/**Vraca objekat kao substring prethodnog u datom okviru*/
	public MyString1 substring(int begin, int end){
		char[] string = new char[end - begin];
		for(int i = 0; i < string.length; i++){
			string[i] = this.charAt(begin + i);
		}
		return new MyString1(string);
	}
	
	/**Vraca objekat sa malim slovima*/
	public MyString1 toLowerCase(){
		char[] string = new char[length()];
		for(int i = 0; i < string.length; i++){
			string[i] = Character.toLowerCase(this.charAt(i));
		}
		return new MyString1(string);
	}
	
	/**Provjerava jednakost dva objekta*/
	public boolean equals(MyString1 s){
		for(int i = 0; i < s.length(); i++)
			if(s.chars[i] != this.chars[i])
				return false;
		return true;
	}
	
	/**Vraca objekat kao vrijednost datog broja*/
	public static MyString1 valueOf(int i){
		String string = Integer.toString(i);
		
		return new MyString1(string.toCharArray());
	}
}
