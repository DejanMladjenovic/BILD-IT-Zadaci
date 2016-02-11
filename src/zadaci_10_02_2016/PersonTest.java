package zadaci_10_02_2016;

/**
 * Naziv klase: PersonTest
 * 
 * @author Dejan Mladjenovic
 */

public class PersonTest {
	
	/*
	 * Write a test program that creates a Person, Student, Employee, Faculty, and Staff, 
	 * and invokes their toString() methods to display the class name and the person’s name.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj objekte
		Person person = new Person("Person");
		Student student  = new Student("Student");
		Person employee  = new Employee("Employee");
		Person faculty  = new Faculty("Faculty");
		Person staff  = new Staff("Staff");
		
		//Pozovi metodu toString za svakog objekta
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}

}
