package zadaci_10_02_2016;

/**
 * Naziv klase: Student
 * 
 * @author Dejan Mladjenovic
 */

public class Student extends Person {
	
	/*
	 * Design class Student as subclass of class Person.
	 * A student has a class status (freshman, sophomore, junior, or senior). 
	 * Define the status as a constant.
	 */

	//Osobine
	final static String FRESHMAN = "Freshman";
	final static String SOPHOMORE = "Sophomore";
	final static String JUNIOR = "Junior";
	final static String SENIOR = "Senior";
	private String status;

	
	//Konstruktor sa imenom objekta
	public Student(String name){
		super(name);
	}
	
	//Konstruktor sa odredjenim vrijednostima
	public Student(String name, String address, String phoneNumber, String email, String status) {
		super(name, address, phoneNumber, email);
		this.status = status;
	}
	
	/**Vraca status objekta*/
	public String getStatus() {
		return status;
	}

	/**Postavlja status objektu*/
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**Vraca ispisan objekat*/
	public String toString(){
		return super.toString();
	}
}
