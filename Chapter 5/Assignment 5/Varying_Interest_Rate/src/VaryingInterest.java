/**
 * @author KyryloO
 *
 * This a compound-interest calculator with a nested for itteration. This program is focused on calculating the amount
 * of deposit based on the provided varying interest in %5-10 range within 10 years span.
 *
*/

public class VaryingInterest {
    public static void main(String[] args) {
        double principal = 1000.0;


        for (double rate = 0.05; rate <= 0.1; rate = rate + 0.01) {
            // display headers
            System.out.println("------------------------------------------------------");
            System.out.printf("%s%20s%20s%.2f%n", "Year", "Amount on deposit", "Rate: ", rate);


            for (int year = 1; year <= 10; year++) {
                // calculate the amount
                double amount = principal * Math.pow(1.0 + rate, year);

                // display the year and the amount
                System.out.printf("%4d%,20.2f%n", year, amount);

            }
        }
    }
}
