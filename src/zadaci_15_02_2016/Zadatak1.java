package zadaci_15_02_2016;

/**
 * Naziv klase Zadatak1
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak1 {
	
	/*
	 * Write the bin2Dec(String binaryString) method 
	 * to convert a binary string into a decimal number. 
	 * Implement the bin2Dec method to throw a NumberFormatException 
	 * if the string is not a binary string.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj string objekat
		String binary = "10120";
		
		//Ispisi rezultat
		try{
			System.out.println(bin2Dec(binary));
		//Uhvati izuzetak	
		}catch(NumberFormatException e){
			System.out.println(e);
			System.out.println(binary + " isn't a binary!");
		}
		
	}
	
	/**Metoda pretvara binarni string u integer*/
	public static int bin2Dec(String binaryString) throws NumberFormatException{
		if(!binaryString.matches("[0-1]+"))
			throw new NumberFormatException();
		
		return Integer.parseInt(binaryString, 2);
	}
}
