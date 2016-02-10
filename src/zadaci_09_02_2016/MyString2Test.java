package zadaci_09_02_2016;

/**
* Naziv klase: MyString2Test
* 
* @author Dejan Mladjenovic
*/

public class MyString2Test {

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj MyString2 objekat
		MyString2 string = new MyString2("Dobar dan");
		
		System.out.println("Objekat: " + string.s);
		
		//Uporedi objekat sa novim stringom
		System.out.println("Uporedi sa stringom: " + string.compare(new String("Dobar dan")));
		
		//Novi objekat kao substring datog objekta
		System.out.println("Subsring (6-8): " + string.substring(6).s);
		
		//Objekat velikim slovima
		System.out.println("Velika slova: " + string.toUpperCase().s);
		
		//Objekat kao niz karaktera
		System.out.print("Niz karaktera: ");
		System.out.println(string.toChars());
		
		//Provjeri tacnost vrijednosti objekta
		boolean da = true;
		System.out.println("Tacno: " + MyString2.valueOf(da).s);
	}

}
