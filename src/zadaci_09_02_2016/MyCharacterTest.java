package zadaci_09_02_2016;

/**Naziv klase: MyCharacterTest
 * 
 * @author Dejan Mladjenovic
 */

public class MyCharacterTest {
	
	/*
	 * Write a test program for class MyCharacter
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj objekat
		MyCharacter ch = new MyCharacter('g');
		
		//Ispisi objekat
		System.out.println("Objekat: " + ch.toString());
		
		//Provjeri da li je slovo
		System.out.println("Da li je slovo: " + MyCharacter.isLetter(ch));
		
		//Provjeri da li je broj
		System.out.println("Da li je broj: " + MyCharacter.isDigit(ch));
		
		//Da li je veliko slovo
		System.out.println("Da li je veliko slovo: " + MyCharacter.isUpperCase(ch));
		
		//Da li je malo slovo
		System.out.println("Da li je malo slovo: " + MyCharacter.isLowerCase(ch));
		
		//Pretvori u veliko slovo
		System.out.println("Veliko slovo: " + ch.toUpperCase().ch);
		

	}

}
