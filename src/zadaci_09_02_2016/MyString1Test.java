package zadaci_09_02_2016;

/**
 * Naziv klase: MyStringTest
 * 
 * @author Dejan Mladjenovic
 */

public class MyString1Test {

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj niz karaktera
		char[] chars = {'a', 'B', 'c', 'D'};
		//Kreiraj niz karaktera za provjeru jednakosti
		char[] data = {'a', 'b', 'c'};
		
		//Kreiraj MyString1 objekat
		MyString1 string = new MyString1(chars);
		
		//Ispisi objekat
		System.out.print("Objekat: ");
		System.out.println(string.chars);
		
		//Karakter na poziciji 1
		System.out.println("Na poziciji 1: " + string.charAt(1));
		
		//Duzina objekta
		System.out.println("Duzina: " + string.length());
		
		//Substring objekta (1-3)
		System.out.print("Substring 1-3: ");
		System.out.println(string.substring(1, 3).chars);
		
		//Ispisi objekat malim slovima
		System.out.print("Mala slova: ");
		System.out.println(string.toLowerCase().chars);
		
		//Provjeri da li je jednak drugom objektu
		System.out.println("Jednak drugom objektu: " + string.equals(data));
		
		//Ispisi objekat kao vrijednost datog broja
 		System.out.println(MyString1.valueOf(12).chars);
	}

}
