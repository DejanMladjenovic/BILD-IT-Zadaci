package zadaci_12_02_2016;

/**
 * Naziv klase: IllegalArgument
 * 
 * @author Dejan Mladjenovic
 */

public class IllegalArgument {
	
	/*
	 * Write a test program for Loan class
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj objekat
		Loan loan = new Loan(0, 1, 1000);
		
		//Ispisi vrijednost objekta
		System.out.println(loan.toString());
	}

}
