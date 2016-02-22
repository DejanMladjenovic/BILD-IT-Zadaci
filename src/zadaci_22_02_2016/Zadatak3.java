package zadaci_22_02_2016;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak3 {
	
	/*
	 * Write a recursive method to compute the following series:
	 * m(i) = 1 + (1/2) + (1/3)+..+(1/i)
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
		
		if (i == 1)
			return 1;
		else
			return 1 / i + m(i - 1);
	}

}
