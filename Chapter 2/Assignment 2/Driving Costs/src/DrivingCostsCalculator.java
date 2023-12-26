/**
 *
 * @author KyryloO
 */


import java.util.Scanner;

public class DrivingCostsCalculator {
    public static void main(String[] args) {

        System.out.println("Welcome to the driving cost calculator"); // welcoming message
        Scanner in = new Scanner(System.in); // establishing scanner object

        System.out.printf("\n%s", "Please input your daily millage: "); // users' prompt for daily millage
        double dailyMillage = in.nextDouble(); // getting input from the user and assigning it to the floating-point value

        System.out.print("Please input miles per gallon (MPG): "); // users' prompt for MPG
        double milesPerGallon = in.nextDouble(); // getting input from the user and assigning it to the floating-point value

        System.out.print("Please input price per gallon $: "); // users' prompt for price per gallon
        double gasPrice = in.nextDouble(); // getting input from the user and assigning it to the floating-point value

        double weeklyPrice = ((dailyMillage / milesPerGallon) * gasPrice) * 7; // compute weekly price of driving and assign the result to the value
        double monthlyPrice = ((dailyMillage / milesPerGallon) * gasPrice) * 30; // compute monthly price of driving and assign the result to the value
        double yearlyPrice = ((dailyMillage / milesPerGallon) * gasPrice) * 365; // compute yearly price of driving and assign the result to the value

        System.out.printf("\n%s\t\t%s\t\t%s%n", "weekly", "monthly", "yearly"); // print out "weekly", "monthly", "yearly" headers
        System.out.printf("$%1.2f  ",weeklyPrice); // print out weekly price with two decimal points
        System.out.printf("\t$%1.2f  ",monthlyPrice); // print out monthly price with two decimal points
        System.out.printf("\t$%1.2f  ",yearlyPrice); // print out yearly price with two decimal points

        System.out.printf("\n\nThank you for using my application. Drive safely!"); // ending message
    }
}
