package zadaci_12_02_2016;

/**
 * Naziv klase: Loan
 * 
 * @author Dejan Mladjenovic
 */

public class Loan {
	
	/*
	* Modify the Loan class in Listing 10.2 to throw IllegalArgumentException 
	* if the loan amount, interest rate, or number of years is less than or equal to zero.	
	*/
	
	//Osobine
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	//Konstruktor bez argumenata
	public Loan() {
		this(2.5, 1, 1000);
	}

	//Konstruktor sa odredjenim vrijednostima
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		//Uhvati izuzetke u konstruktoru
		if (annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0)
			throw new IllegalArgumentException("Greska u unosu!");
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/** Set a new annualInterestRate */
	public void setAnnualInterestRate(double annualInterestRate) {
		//Baci gresku ako je godina manja ili jednaka 0
		if (annualInterestRate <= 0)
			throw new IllegalArgumentException("Greska u unosu!");
		this.annualInterestRate = annualInterestRate;
	}

	/**Vraca broj godina*/
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/**Postavi broj godina*/
	public void setNumberOfYears(int numberOfYears) {
		//Baci gresku ako je godina manja ili jednaka 0
		if (numberOfYears <= 0)
			throw new IllegalArgumentException("Greska u unosu!");
		this.numberOfYears = numberOfYears;
	}

	/**Vraca iznos zajma*/
	public double getLoanAmount() {
		return loanAmount;
	}

	/**Vraca iznos zajma*/
	public void setLoanAmount(double loanAmount) {
		//Baci gresku ako je iznos manji ili jednak 0
		if (loanAmount <= 0)
			throw new IllegalArgumentException("Greska u unosu!");
		this.loanAmount = loanAmount;
	}

	/**Vraca mjesecnu ratu*/
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount
				* monthlyInterestRate
				/ (1 - (1 / Math.pow(1 + monthlyInterestRate,
						numberOfYears * 12)));
		return monthlyPayment;
	}

	/**Vraca ukupan dug*/
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

	/**Vraca datum*/
	public java.util.Date getLoanDate() {
		return loanDate;
	}

	/**Vraca ispisan objekat*/
	@Override
	public String toString() {
		return "Iznos zajma: " + loanAmount + "\nGodusnja kamatna stopa: "
				+ annualInterestRate + "\nBroj godina: " + numberOfYears;
	}

}