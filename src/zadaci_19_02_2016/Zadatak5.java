package zadaci_19_02_2016;

/**
 * Naziv klase Zadatak5
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak5 {
	
	/*
	 * Write a test program for Course class
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj objekat
		Course course1 = new Course("Data Structures");
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		
		//Kreiraj clone objekat
		Course course2 = new Course();		
		course2 = (Course) course1.clone();
		
		//Ispisi studente iz prvog objekta
		String[] students1 = course1.getStudents();
		System.out.println("Course: ");
		for(int i = 0; i < students1.length; i++){
			if(students1[i] != null)
			System.out.println(students1[i]);
		}
		
		//Ispisi studente iz drugog objekta
		String[] students2 = course2.getStudents();
		System.out.println("\nCourse clone:");
		for(int i = 0; i < students2.length; i++){
			if(students2[i] != null)
				System.out.println(students2[i]);
		}
	}
}
