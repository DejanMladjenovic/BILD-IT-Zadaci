package zadaci_10_02_2016;

/**
 * Naziv klase: Employee
 * 
 * @author Dejan Mladjenovic
 */

public class Employee extends Person {
	
	/*
	 * Design class Employee as subclass of class Person.
	 * An employee has an office, salary, and date hired
	 */
	
	//Osobine
	private String office;
	private double salary;
	private MyDate dateHired;
	
	//Konstruktor sa imenom objekta
	public Employee(String name){
		super(name);
	}
	
	//konstruktor sa odredjenim vrijednostima
	public Employee(String name, String address, String phone, String email, 
			String office, double salary, MyDate dateHired) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	/**Vraca duznost objekta*/
	public String getOffice() {
		return office;
	}

	/**Postavlja duznost objektu*/
	public void setOffice(String office) {
		this.office = office;
	}

	/**Vraca platu objekta*/
	public double getSalary() {
		return salary;
	}

	/**Postavlja platu objektu*/
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/**Vraca datum zaposlenja objekta*/
	public MyDate getDateHired() {
		return dateHired;
	}

	/**Postavlja datum zaposlenja objektu*/
	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}
	
	/**Vraca ispisan objekat*/
	public String toString(){
		return super.toString();
	}
}
