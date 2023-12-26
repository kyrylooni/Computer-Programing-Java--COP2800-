/**
 * @author KyryloO
 *
 * This TwoDimensionalMonthlyBillTest class serves as a test of TwoDimensionalMonthlyBill. It creates an object of class
 * TwoDimensionalMonthlyBill and passes a two-dimensional array while also calling other methods of a TwoDimensionalMonthlyBill
 * class to produce a welcome message, process bill values of an array, and display a goodbye message.
 *
 *
 * @P.S I wanted to play with outputBarChart method a little bit and produce a chart, but then I figured out that I spent a lot of time hitting the wall
 * and not going anywhere.Google search did not give me any sufficient solution either (maybe I haven't researched StackOverflow enough)
 * I will spend time learning about two-dimensional array and implement the solution later.
 * This version of the program will not have outputBarChart method active
 *
 *
 */




public class TwoDimensionalMonthlyBillTest {
    // main method begins program execution
    public static void main(String[] args) {
        double [][] bills = {{125.26, 245.93, 534.86, 237.88, 897.43, 756.99},
                             {789.54, 968.98, 386.98, 986.22, 486.34, 142.99},
                             {432.32, 237.98, 679.09, 156.88, 789.99, 133.33}};

        TwoDimensionalMonthlyBill newBills = new TwoDimensionalMonthlyBill(bills);
        newBills.Welcome();
        newBills.processBills();
        //newBills.outputBarChart();
        newBills.Goodbye();
    }
}
