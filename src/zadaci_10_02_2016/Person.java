package zadaci_10_02_2016;

/**
 * Naziv klase: Person
 * 
 * @author Dejan Mladjenovic
 */

public class Person {
	
	/*
	 * Design a class named Person.
	 * A person has a name, address, phone number, and email address
	 */

	//Osobine
	private String name;
	private String address;
	private String phone;
	private String email;
	
	//Konstruktor sa imenom objekta
	public Person(String name){
		this.name = name;;
	}
	
	//Konstruktor sa odredjenim vrijednostima
	Person(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	/**Vraca ime objekta*/
	public String getName() {
		return name;
	}

	/**Postavlja ime za objekat*/
	public void setName(String name) {
		this.name = name;
	}

	/**Vraca adresu objekta*/
	public String getAddress() {
		return address;
	}

	/**Postavlja adresu za objekat*/
	public void setAddress(String address) {
		this.address = address;
	}

	/**Vraca broj telefona objekta*/
	public String getPhone() {
		return phone;
	}

	/**Postavlja broj telefona objekta*/
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**Vraca adresu e-poste objekta*/
	public String getEmail() {
		return email;
	}

	/**Postavlja adresu e-poste objekta*/
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**Vraca ispisan objekat*/
	@Override
	public String toString() {
		return getClass().getSimpleName() + " " + getName();
	}
}
