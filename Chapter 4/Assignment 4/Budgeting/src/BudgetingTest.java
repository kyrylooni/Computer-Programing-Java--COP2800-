/**
 *
 * @author KyryloO
 *
 * @Prompt: Write an interactive application that is supposed to calculate the total amount of monthly expenses and
 * determine whether the user has a healthy spending habit (he/she spends less than earned income per month) or bad
 * spending habits (he/she spends more than earned income per month) based on provide monthly income from the user and
 * inputted expenses.
 * After that display the difference between total monthly spending and total monthly earnings to determine whether
 * the user will have either a positive or a negative amount by the end of the month. In addition, project the statistics
 * to show yearly income vs. yearly spending (based on the monthly amounts respectively). Do not forget to include
 * interactive messages throughout your program as well as creation of object’s class and respective test class.
 *
 *
 * This class is a test class for Budgeting.java and serve to initialize some objects of a class Employee and test out
 *  correctness of setter and getters output while incorporating interactive messages and calculating monthly spendings
 *  as well as perspective outcomes of user's spending habits.
 *
 */


import java.util.Scanner;

public class BudgetingTest {

    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in); // establishing scanner object to take user's input

        Budgeting user1 = new Budgeting(); // establishing new user of a Budgeting class
        System.out.print("Please enter your name: "); // prompt for a username
        user1.setName(inpt.nextLine()); // invoking user1's setname method to take a name as an input
        // welcoming message
        System.out.println("Welcome " + user1.getName() + " to the monthly budgeting app. Let's see whether you have healthy spending habits :)");
        System.out.printf("\nPlease input your monthly salary in dollars $: "); // asking for a double input of user's salary
        user1.setSalary(inpt.nextDouble()); // invoking user1's setname method to take a name as an input

        double totalMonthlySpending = 0; // initializing a variable for total monthly spending as a double and set it equal to 0

        while (user1.getSalary() > 0) { // conditional while loop checks to see if the inputted salary value is greater than 0
            System.out.print("Enter an expense $: "); // asking user for an expense input
            user1.setExpense(inpt.nextDouble()); // invoking user1's setExpense method to obtain an input from the user

            if (user1.getExpense() == 0)  { // if the next inputted expense is 0, we are done with calculations
                System.out.print("Done calculating...\n");
                break; // break down from the loop
            }
            totalMonthlySpending = totalMonthlySpending + user1.getExpense(); // accumulation pattern; add an expense to a total
            // (initially starts with $0) each time as long as next expense is not 0

        }
        if (totalMonthlySpending > user1.getSalary()) { // if total spending is greater than inputted monthly spending
            // you are over your monthly budget
            System.out.println("You are over your monthly budget!");
            System.out.print("If you will continue this trend, you will have: $");
            // depicting future outcomes of such an approach (negative amount by the end of the month).
            System.out.print(user1.getSalary() - totalMonthlySpending + " on your account by the end of the month");
            System.out.println("\nPlease consider spending less");
        } else if (totalMonthlySpending < user1.getSalary()) { // if total spending is less than inputted monthly spending
            // you are under your monthly budget
            System.out.println("You are under your monthly budget");
            System.out.print("If you will continue this trend, you will have: $+");
            // depicting future outcomes of such an approach (positive amount by the end of the month).
            System.out.printf(user1.getSalary() - totalMonthlySpending + " on your account by the end of the month");
            System.out.print("\nYou have good spending habits. Keep doing a great job!\n");

        }
        // calculating yearly income based on monthly income
        double yearlyIncome = user1.getSalary() * 12;
        // calculating yearly spending based on monthly spending.
        double yearlySpending = totalMonthlySpending * 12;

        System.out.printf("\nIn fact, here is some interesting stats for you!\n\n");
        System.out.printf("Your total monthly spending: $%.2f\n", totalMonthlySpending);
        System.out.printf("Your total yearly income: $%,.2f\n", yearlyIncome);
        System.out.printf("Your total yearly spending: $%,.2f\n\n", yearlySpending);
        System.out.println("Thank you for being our customer today!");
        System.out.print("Good luck!\n");




    }
}

