package zadaci_29_01_2016;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak1 {
	
	/*
	 * Napisati program koji nasumièno generiše cijeli broj izmeðu 1 i 12 
	 * te ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Generisi nasumicni broj od 1 do 12
		int broj = (int)(1 + Math.random() * 12);
		
		//Ispisi mjesece u godini
		String[] mjeseci = {"", "Januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul", "Avgust", 
				"Septembar", "Oktobar", "Novembar", "Decembar"};
		
		//Ispisi rezultat
		System.out.println(broj + " za " + mjeseci[broj]);
		
	}

}
