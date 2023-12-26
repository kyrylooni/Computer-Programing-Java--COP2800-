import java.util.Scanner;

/**
 * 
 */

/**
 * @author a0001r0212-bkr
 *
 */
public class PopulationGrowth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please input USA's population");
		int population  = input.nextInt();
		System.out.println("Please input the current growth rate, 1.2% should be .012");
		double growthRate = input.nextDouble();
		System.out.printf("After first year, population = %.0f%n", population * (1 + growthRate));
	}

}
