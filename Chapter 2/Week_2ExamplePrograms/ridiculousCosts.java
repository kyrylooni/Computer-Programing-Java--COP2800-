/**
 * 
 */

/**
 * @author acompsci
 * Anindya Paul
 * Inclass program
 * Attempting to write a cost breakdown program to show how much 
 * it would cost for completing a degree program at my 
 * Institution
 */
import java.util.Scanner;
public class ridiculousCosts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String yourName;
		String className1;
		String className2, className3, className4;
		double bookforClass1, bookforClass2, bookforClass3, bookforClass4;
		double totalCostBooks;
		Scanner in = new Scanner (System.in);
		System.out.println("Please input your name: \n");
		yourName = in.nextLine();
		System.out.println("Please input your first class: \n ");
		className1 = in.nextLine();
		System.out.println("Please input your bookcost for class1 \n ");
		bookforClass1 = in.nextDouble();
		in.nextLine();
		System.out.println("Please input your second class: \n");
		className2 = in.nextLine();
		System.out.println("Please input your bookcost for class1 ");
		bookforClass2 = in.nextDouble();
		in.nextLine();
		
		totalCostBooks = (bookforClass1 + bookforClass2);
		
		System.out.println("Hello " + yourName );
		System.out.println("Your total cost of books are " + totalCostBooks );
		System.out.println("It is NOT funny ");
		
		System.out.println("Thank you for using my simple program ");

	}

}
