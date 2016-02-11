package zadaci_10_02_2016;

/**
 * Naziv klase: Staff
 * 
 * @author Dejan Mladjenovic
 */

public class Staff extends Employee {
	
	/*
	 * Design class as subclass of class Employee
	 * A staff member has a title
	 */
	
	//Osobine
	private String title;
	
	//Konstruktor sa imenom objekta
	public Staff(String name) {
		super(name);
	}

	//Konstruktor sa odredjenim vrijednostima
	public Staff(String name, String address, String phone, String email, 
			String office, double salary,MyDate dateHired, String title) {
		super(name, address, phone, email, office, salary, dateHired);
		this.title = title;
	}
	
	/**Vraca poziciju objekta*/
	public String getTitle() {
		return title;
	}
	
	/**Postavlja poziciju objektu*/
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**Vraca ispisan objekat*/
	public String toString() {
		return super.toString();
	}

}
