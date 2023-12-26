/**
 * @author KyryloO
 *
 * This SavingsAccount class initiates two types of constructors (no-argument and overloaded). annualInterestRate is a static
 * variable that can be accessed by other methods of the same class, and also initializes private savingsBalance variable.
 * SavingsAccount takes one argument in the overloaded constructor which takes savingsBalance parameter as a double and assign it
 * to the method variable. calculateMonthlyInterest method calculate monthly interest based on the provided savingsBalance
 * value and assigns the result to the savingsBalance value and prints out the resulted value. modifyInterestRate method
 * takes one interest parameter witch then gets assigned to the static variable of annualInterestRate.
 *
 *
 */



public class SavingsAccount {
    // static class variable to store the annual interest rate for all account holder
    private static double annualInterestRate;

    // the amount the saver currently has on deposit
    private double savingsBalance;
    // no-argument constructor
    public SavingsAccount() {
        // initialize savingsBalance instance variable and set it equal to 0;
        savingsBalance = 0;
        // initialize annualInterestRate instance variable and set it equal to 0;
        annualInterestRate = 0;

    }
    // overloaded constructor
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
        // initialize annualInterestRate instance variable and set it equal to 0;
        annualInterestRate = 0;
    }

    public void calculateMonthlyInterest() {
        // class variable
        double monthlyInterest;
        // calculating monthly interest
        monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        // assigning the calculated result to the savingsBalance instance variable
        savingsBalance = monthlyInterest;
        System.out.printf("New savings balance: %.2f ", savingsBalance);
     }

        public static void modifyInterestRate(double interest) {
        // assigning the static variable to have a value of the local method variable
            annualInterestRate = interest;

        }
    }

