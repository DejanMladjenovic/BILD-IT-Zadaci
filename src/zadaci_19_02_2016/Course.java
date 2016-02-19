package zadaci_19_02_2016;

/**Naziv klase: Course
 * 
 * @author Dejan Mladjenovic
 */

public class Course implements Cloneable {
	
	/*
	 * Rewrite the Course class in Listing 10.6 to add 
	 * a clone method to perform a deep copy on the students field.
	 */

	//Osobine
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	//Konstruktor bez argumenata
	public Course(){
	}
	
	//Konstruktor sa odredjenom vrijednoscu
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	/**Dodaje studenta u niz*/
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	/**Vraca sve studente*/
	public String[] getStudents() {
		return students;
	}
	
	/**Vrac broj studenata*/
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	/**Vraca naziv kursa*/
	public String getCourseName() {
		return courseName;
	}
	/**Vraca kloniran objekat*/
	public Object clone() {
		Course clone = new Course(this.courseName);
		for (int i = 0; i < this.students.length; i++) {
			clone.students[i] = this.students[i];
		}
		return clone;
	}	
}
