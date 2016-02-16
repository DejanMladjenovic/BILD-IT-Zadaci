package zadaci_15_02_2016;

/**
 * Naziv klase Zadatak2
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak2 {
	
	/*
	 * Write a program that causes the JVM to throw 
	 * an OutOfMemoryError and catches and handles this error.
	 */

	/**Glavna metoda*/
	public static void main(String[] args){

		//Kreiraj string objekat
		String string = "Memory";
		
		try{
			while(true){
				//Dupliraj Vrijednost stringa dok ima memorije
				string += string;//
			}
		//Uhvati i ispisi gresku	
		}catch(OutOfMemoryError e){
			System.out.println(e);
			System.out.println("Out of memory!");
		}
	}
}
