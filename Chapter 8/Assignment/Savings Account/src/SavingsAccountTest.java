/**
 * @author KyryloO
 *
 * This SavingsAccountTest class creates objects of a class SavingsAccount via overloaded constructor
 * and invokes its methods on those objects while also testing out these methods with different interest rates
 * displaying specific otputs respectfully.
 *
 */


public class SavingsAccountTest {
    public static void main(String[] args) {
        // object 1
        SavingsAccount saver1 = new SavingsAccount(2000);
        // object 2
        SavingsAccount saver2 = new SavingsAccount(3000);
        double interest = 0.04;

        // assigning interest value to the static variable
        saver1.modifyInterestRate(interest);
        System.out.printf("Saver1: ");
        //invoking method to calculate monthly interest
        saver1.calculateMonthlyInterest();
        // assigning interest value to the static variable
        saver2.modifyInterestRate(interest);
        System.out.printf("%nSaver2: ");
        //invoking method to calculate monthly interest
        saver2.calculateMonthlyInterest();

        interest = 0.05;

        // assigning interest value to the static variable
        saver1.modifyInterestRate(interest);
        System.out.printf("%nSaver1: ");
        //invoking method to calculate monthly interest
        saver1.calculateMonthlyInterest();
        // assigning interest value to the static variable
        saver2.modifyInterestRate(interest);
        System.out.printf("%nSaver2: ");
        //invoking method to calculate monthly interest
        saver2.calculateMonthlyInterest();
    }
}