/**
 * @author KyryloO
 *
 * This MonthlyBill class incorporate one-dimensional array mechanics ( as a part of monthly bill calculator application
 * It asks  users to input the number of months they want to calculate bill amounts for and then prmpts them to input those numbers
 * The program calculte average of all of the bills, displays each bill with respect to its month
 * and displays minimum and maximum, as well as total values from the array.
 */

import java.util.Scanner;

public class MonthlyBill {
    public Scanner inpt = new Scanner(System.in);

    // variable for storing user's name
    private String userName;

    // array for storing bills
    private double[] bills;

    // welcoming message
    public void Welcome() {
        System.out.print("Please enter your name: ");
        String name = inpt.nextLine();
        setUserName(name);
        System.out.printf("Hello %s. %nWelcome to Bank of America monthly bills statement utility%n", getUserName());
    }


    // Goodbye message
    public void Goodbye() {
        System.out.printf("%n%nDone calculating...%nThank you for using Bank Of America bill statement utility%n" +
                "Please make sure to check out other BofA online services%nGoodbye :)");
    }
    //constructor
    public MonthlyBill(double[] bills) {
        this.bills = bills;

    }
    // getters and setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;

    }

    public void processBills() {
        // output bills
        outputBills();

        // call method getBillsAverage, to calculate an average amount on all bills
        System.out.printf("%nAverage amount from all of the bills is $%.2f%n", getBillsAverage());

        //call methods getMinBill and getMaxBill
        System.out.printf("Lowest amount on the bill is $%.2f%nHighest amount on the bill is $%.2f%n%n", getMinBill(), getMaxBill());

    }

    // find minimum bill
    public double getMinBill() {
        double minBill = bills[0]; // assume that the first bill is the smallest

        // loop through bills array
        for (double bill : bills )
        {
            // if bill amount is lower than minBill, assign it to minBill
            if (bill < minBill) {
                minBill = bill; // new minimal amount on a bill
            }
        }
        return minBill;
    }

    // find maximum bill
    public double getMaxBill() {
        double maxBill = bills[0]; // assume that the first bill is the largest

        // loop through grades array
        for (double bill : bills )
        {
            // if bill is greater than maxBill, assign it to maxBill
            if (bill > maxBill) {
                maxBill = bill; // new maximum amount on the bill
            }
        }
        return maxBill;
    }


    public double getBillsAverage() {
        double total = 0;

        // sum of bills for one user
        for (double bill: bills) {
            total += bill;
        }
        System.out.printf("%nTotal of all your bills is $%.2f", total);
        return total / bills.length;
    }

    // output bar chart displaying amounts distribution
    public void outputBarChart() {
        System.out.println("Amounts distribution: ");
        // output bar labels
        for (int month = 0; month < bills.length; month++) {
            System.out.printf("Month %d: ", (month + 1));
            // print bar of asterisks per every $50 on the amount
            for (int amount = 0; amount < bills[month]; amount+= 50) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // output the contents of the bills array
    public void outputBills() {
        System.out.printf("%n%nHere is all your monthly bills amounts:%n%n");

        // output each month's bill amount
        for (int month = 0; month < bills.length; month++)
        {
            System.out.printf("Month %2d: $%3.2f%n", month + 1, bills[month]);
        }


    }
}
