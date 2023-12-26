/**
 * 
 */

/**
 * @author acompsci
 *
 */
import java.util.Scanner;
public class Conversion {

	/**
	 * Simple program to see some inputs and simple math
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valueInFeet;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value in feet");
		
		valueInFeet = input.nextDouble();
		
		double valaueInMeter = (valueInFeet * 0.305);
		
        System.out.println("The entered value is " + valueInFeet);
		System.out.println("The converted value is " + valaueInMeter);
	}

}
