/**
 * @author KyryloO
 *
 * This MonthlyBillTest class creates an object of a class Monthly bill and passes newly invoked array for the user to input
 * double values inside after that it performs calculations provided processBills() methods as well as outputs some interactive
 * welcome and goodbye messages.
 */


import java.util.Scanner;

public class MonthlyBillTest {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int month;
        System.out.print("Please input the number of months you want to get a statement for (at least 6): ");
        month = inpt.nextInt();
        if (month >= 6) {
            double[] bills = new double[month];
            int monthCount;
            MonthlyBill newBill = new MonthlyBill(bills);
            newBill.Welcome();
            for (monthCount = 0; monthCount < bills.length; monthCount++)
            {
                System.out.printf("Please input amount for month %d into an array $: ", monthCount + 1);
                bills[monthCount] = inpt.nextDouble();
            }

            newBill.processBills();
            newBill.outputBarChart();
            newBill.Goodbye();
        }
        else {
            System.out.println("ERROR! Please input value greater than or equal 6");
            System.out.println("Exiting...");

        }


    }
}
