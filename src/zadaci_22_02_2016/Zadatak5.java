package zadaci_22_02_2016;

/**
 * Naziv klase: Zadatak5
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak5 {
	
	/*
	 * Write a recursive method to compute the following series:
	 * m(i)=1/2 + 2/3 + ... + i/(i+1) 
	 * Write a test program that displays m(i) for i = 1, 2, . . ., 10. 
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Ispisi rezultat
		System.out.println("i    m(i)");
		for(int i = 1; i <= 10; i++){
			System.out.println(i + "    " + m(i));
		}		
	}
	
	/**Vraca zbir u datoj seriji*/
	public static double m(double i){
		
		if(i == 1)
			return i / 2;
		else
			return i / (i + 1) + m(i -1);
	}

}
