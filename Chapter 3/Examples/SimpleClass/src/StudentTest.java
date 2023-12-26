/**
 * 
 */

import java.util.Scanner;

/**
 * @author PaulA
 *
 */
public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inpt = new Scanner(System.in);

		Student student1 = new Student();
		System.out.println("Please provide student first name: ");
		student1.setFname("Juan");
		student1.setLname("Benitez");
		student1.setsNum(458752);
		
		System.out.printf("Student name: %s\t%s\t%d", student1.getFname(), student1.getLname(), student1.getsNum());
		System.out.println("\nThank you for using my first program");
		System.out.println();
		
		Student student2 = new Student();
		student2.setFname("Jonas");
		student2.setLname("Tom");
		student2.setsNum(87452);
		student2.setsCountry("USA");
		
		Student diffStudent = new Student ("Robert" , "Balzan", 76534, "Brazil");
		
		Student aStudent = new Student ("Kristy" , 8457);
		
		System.out.printf("Student name: %s\t%s\t%d", student2.getFname(), student2.getLname(), student2.getsNum());
		
		
		System.out.printf("Student name: %s\t%s\t%d", diffStudent.getFname(), diffStudent.getLname(), diffStudent.getsNum());
        System.out.println();
		System.out.printf("Student name: %s\t%d", aStudent.getFname(),  aStudent.getsNum());	
		
		System.out.println("\nThank you for using my first program");

		Student UkrainianStudent = new Student();
		System.out.println("Input student first name: ");
		UkrainianStudent.setFname(inpt.next());
		System.out.println("Input student last name: ");
		UkrainianStudent.setLname(inpt.next());
		System.out.println("Input student ID: ");
		UkrainianStudent.setsNum(inpt.nextInt());
		System.out.println("Input student country of residence: ");
		UkrainianStudent.setsCountry(inpt.next());
		System.out.printf("Student name: %s\t%s\t%d\t%s", UkrainianStudent.getFname(), UkrainianStudent.getLname(), UkrainianStudent.getsNum(),UkrainianStudent.getsCountry());
	}

}
