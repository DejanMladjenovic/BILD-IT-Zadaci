package zadaci_09_02_2016;

/**
 * Naziv klase: MyString2
 * 
 * @author Dejan Mladjenovic
 */

public class MyString2 {
	
	/*
	 * The String class is provided in the Java library.
	 * Provide your own implementation for the following methods 
	 * (name the newclass MyString2):
	 * -public MyString2(String s);
	 * -public int compare(String s);
	 * -public MyString2 substring(int begin);
	 * -public MyString2 toUpperCase();
	 * -public char[] toChars();
	 * -public static MyString2 valueOf(boolean b);
	 */
	
	//Osobine
	String s;
	
	//Konstruktor
	public MyString2(String s){
		this.s = s;
	}
	
	/**Uporedjuje velicine dva objekta*/
	public int compare(String string){
		if(this.s.length() > string.length())
			return 1;
		else if(this.s.length() == string.length())
			return 0;
		else 
			return -1;
	}
	
	/**Vraca substring objekta od datog indeksa do kraja*/
	public MyString2 substring(int begin){
		String string = "";
		for(int i = begin; i < this.s.length(); i++)
			string += this.s.charAt(i);
		return new MyString2(string);
	}
	
	/**Vraca objekat sa velikim slovima*/
	public MyString2 toUpperCase(){
		String string = "";
		for(int i = 0; i < s.length(); i++)
			string += Character.toUpperCase(s.charAt(i));
		return new MyString2 (string);
	}
	
	/**Vraca niz karaktera datog stringa*/
	public char[] toChars(){
		char[] niz = new char[s.length()];
		for(int i = 0; i < s.length(); i++)
			niz[i] = s.charAt(i);
		return niz;
	}

	/**Provjerava istinitost vrijednosti objekta*/
	public static MyString2 valueOf(boolean b){
		if(b)
			return new MyString2("true");
		return new MyString2("false");
	}
}
