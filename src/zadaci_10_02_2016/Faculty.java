package zadaci_10_02_2016;

/**
 * Naziv klase: Faculty
 * 
 * @author Dejan Mladjenovic
 */

public class Faculty extends Employee {
	
	/*
	 * Dwsitn class Faculty as subclass of class Employee
	 * A faculty member has office hours and a rank.
	 */
	
	//Osobine
	private int officeHours;
	private String rank;
	
	//Konstruktor sa imenom objekta
	public Faculty(String name){
		super(name);
	}
	
	//Konstruktor sa odredjenim vrijednostima
	public Faculty(String name, String address, String phone, String email, String office, double salary, MyDate dateHired, int officeHours, String rank) {
		super(name, address, phone, email, office, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	/**Vraca radno vrijeme objekta*/
	public int getOfficeHours() {
		return officeHours;
	}

	/**Postavlja radno vrijeme objektu*/
	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}

	/**Vraca polozaj objekta*/
	public String getRank() {
		return rank;
	}

	/**postavlja polozaj objektu*/
	public void setRank(String rank) {
		this.rank = rank;
	}
	/**Vraca ispisan objekat*/
	public String toString(){
		return super.toString();
	}

}
