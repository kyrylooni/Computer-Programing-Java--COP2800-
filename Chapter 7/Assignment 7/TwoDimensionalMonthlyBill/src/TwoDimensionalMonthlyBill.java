import java.util.Scanner;

/**
 * @author KyryloO
 *
 * This TwoDimensionalMonthlyBill class incorporate two-dimensional array mechanics (rows/columns) as a part of monthly bill calculator application
 * Essentially, it is the same application as in 7.1, but with two-dimensional arrays mechanics, which allows to display multiple accounts for multiple months. The program incorporate limited version of
 * interactive interface, since it is inconvinient to include user-inputted price numbers on every execution, therefore I decided to go with
 * provided array of bills. The program calculte average of all of the bills, displays each bill with respect to it's month
 * and displays minimum and maximum values from the array.
 *
 *
 *
 * @P.S I wanted to play with outputBarChart method a little bit and produce a chart, but then I figured out that I spent a lot of time hitting the wall
 * and not going anywhere.Google search did not give me any sufficient solution either (maybe I haven't researched StackOverflow enough)
 * I will spend time learning about two-dimensional array and implement the solution later.
 * This version of the program will not have outputBarChart method active
 *
 *
 */
public class TwoDimensionalMonthlyBill {
    public Scanner inpt = new Scanner(System.in);

    // variable for storing user's name
    private String userName;

    // two-dimensional array for storing bills
    private double[][] bills;

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

    //two-argument constructor initializes bills array
    public TwoDimensionalMonthlyBill(double[][] bills) {
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
        // output bills array
        outputBills();

        // call method getBillsAverage, to calculate an average amount on all bills;

        //call methods getMinBill and getMaxBill
        System.out.printf("%n%nLowest amount on the bill is $%.2f%nHighest amount on the bill is $%.2f%n%n", getMinBill(), getMaxBill());

    }

    // find minimum bill
    public double getMinBill() {
        double minBill = bills[0][0]; // assume that the first bill is the smallest

        // loop through rows of grades array
        for (double[] amounts : bills) {
            //loop through columns of current row
            for (double amount : amounts) {
                // if bill amount is lower than minBill, assign it to minBill
                if (amount < minBill) {
                    minBill = amount; // new minimal amount on a bill
                }
            }
        }
        return minBill;
    }
    // find maximum bill
    public double getMaxBill() {
        double maxBill = bills[0][0]; // assume that the first bill is the largest

        // loop through rows of grades array
        for (double[] amounts : bills)
        {
            //loop through columns of current row
            for (double amount: amounts)
            {
                // // if bill amount is greater than maxBill, assign it to maxBill
                if (amount > maxBill) {
                    maxBill = amount;
                }
            }

        }
        return maxBill;
    }

    // determine average bill amount for particular set of bills
    public double getBillsAverage(double[] setOfAmounts) {
        double total = 0;

        // sum of bills for one user
        for (double amount : setOfAmounts) {
            total += amount;
        }
        //System.out.printf("%nTotal of all your bills is $%.2f", total);
        return  total / setOfAmounts.length;
    }

/*
    // output bar chart displaying amounts distribution
    public void outputBarChart() {
        System.out.println("Amounts distribution: ");
        // output bar labels
        for (int row = 0; row < bills[row].length; row++) {
            System.out.printf("Month %d: ", (row + 1));
            // print bar of asterisks per every $50 on the amount
            for (int column = 0; column < bills[column].length; bills[row][column]+= 50) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
*/
    // output the contents of the bills array
    public void outputBills() {
        System.out.printf("Monthly bills amounts:%n%n");
        System.out.print("            "); // align column heading


        // create a column heading for each month
        for (int month = 0; month < bills[0].length; month++) {
            System.out.printf(" Month %d  ", month + 1);
        }

        System.out.println(" Average"); // student average column heading

        //create rows/columns of text representing array amounts
        for (int account = 0; account < bills.length; account++) {
            System.out.printf("Account %2d  ", account + 1);

            for (double amount : bills[account]) // output accounts amounts
            {
                System.out.printf("%8.2f  ", amount);
            }

            // call method getAverage to calculate account's average amount;
            // pass row of amounts as the argument to getBillsAverage
            double average = getBillsAverage(bills[account]);
            System.out.printf("%9.2f%n", average);

        }
    }
}


