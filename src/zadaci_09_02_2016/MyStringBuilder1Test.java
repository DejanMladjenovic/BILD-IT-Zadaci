package zadaci_09_02_2016;

/**
* Naziv klase: MyStringBuilder1Test
* 
* @author Dejan Mladjenovic
*/

public class MyStringBuilder1Test {
	
	/*
	 * Write a test program for class MyStringBuilder1
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj objekat
		MyStringBuilder1 str = new MyStringBuilder1("String");

		//Ispisi objekat
		System.out.println("Objekat: " + str.toString());
		
		//Dodaj novi objekat postojecem objektu
		System.out.println("Dodavanje objekta: " + str.append(new MyStringBuilder1("Builder")));
		
		//Dodaj broj objektu
		System.out.println("Dodavanje broja: " + str.append(1));

		//Duzina objekta
		System.out.println("Duzina: " + str.length());
		
		//Ispisi karakter na datom indeksu
		System.out.println("Karakter na indeksu 2: " + str.charAt(2));
		
		//Ispisi objekat malim slovima
		System.out.println("Mala slova: " + str.toLowerCase());
		
		//Ispisi substring objekta u datom okviru
		System.out.println("Substring (2-6): " + str.substring(2, 6));
	}

}
