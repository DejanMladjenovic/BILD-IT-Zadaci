package zadaci_10_02_2016;

/**Naziv klase: Loan
 * 
 * @author Dejan Mladjenovic
 */

public class Loan {
	
	/*
	 * Design class Loan with amount data field
	 */

	//osobine
	double amount;

	//Konstruktor sa odredjenim iznosom
	Loan(double amount) {
		this.amount = amount;
	}
	
	/**Vraca stanje zajma*/
	public double getAmount() {
		return amount;
	}
	
	/**Postavlja stanje zajma*/
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**Vraca ispisan objekat*/
	public String toString() {
		return "Loan: " + amount;
	}

}
