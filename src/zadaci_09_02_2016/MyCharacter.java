package zadaci_09_02_2016;

/**
 * Naziv klase: MyCharacter
 * 
 * @author Dejan Mladjenovic
 */

public class MyCharacter {
	
	/*
	 * The Character class is provided in the Java library.
	 *  Provide your own implementation for this class. 
	 *  Name the new class MyCharacter.
	 */
	
	//Osobine
	char ch;
	
	//Konstruktor
	public MyCharacter(char ch){
		this.ch = ch;
	}
	
	/**Provjerava da li je objekat slovo*/
	public static boolean isLetter(MyCharacter c){
		if(c.ch >= 'a' && c.ch <= 'z')
			return true;
		if(c.ch >= 'A' && c.ch <= 'Z')
			return true;
		return false;
	}
	
	/**Provjerava da li je objekat broj*/
	public static boolean isDigit(MyCharacter c){
		if(c.ch >= '0' && c.ch <= '9')
			return true;
		return false;
	}
	
	/**Provjerava da li je objekat veliko slovo*/
	public static boolean isUpperCase(MyCharacter c){
		if(c.ch >= 'A' && c.ch <= 'Z')
			return true;
		return false;
	}
	
	/**Provjerava da li je objekat malo slovo*/
	public static boolean isLowerCase(MyCharacter c){
		if(c.ch >= 'a' && c.ch <= 'z')
			return true;
		return false;
	}
	
	/**Vraca objekat kao malo slovo*/
	public MyCharacter toLowerCase(){
		if(this.ch >= 'A' && this.ch <= 'Z')
			return new MyCharacter((char)((int)this.ch + 32));
		return new MyCharacter(this.ch);
	}
	
	/**Vraca objekat kao veliko slovo*/
	public MyCharacter toUpperCase(){
		if(this.ch >= 'a' && this.ch <= 'z')
			return new MyCharacter((char)((int)(this.ch) - 32));
		return new MyCharacter(this.ch);
	}

	/**Vraca karakter kao string*/
	public String toString(){
		String s = "";
		s += this.ch;
		return s;
	}
}
