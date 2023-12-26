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
 * This class "Budgeting" presents a users with an ability to establish objects with methods of the class itself which
 * includes information like name, expense, and salary.
 *
 */

public class Budgeting {

    // setting up private variable (that means that they are accessible only within an Employee class
    private  String name;

    private double expense;


    private double salary;

    // first constructor; does not have any parameters, serve as an object initializer
    public Budgeting() {

    }

    // an alternative way of an object's constructor with a name parameter
    public Budgeting(String accName) {
        name = accName;

    }
    // getter for a name variable
    public String getName() {
        return name;
    }
    // setter for a name variable
    public void setName(String name) {
        this.name = name;
    }
    // getter a for a salary variable
    public double getSalary() {
        return salary;
    }
    // setter for a salary variable
    public void setSalary(double salary) {
        this.salary = salary;
    }
    // getter for an expense variable
    public double getExpense() {
        return expense;
    }
    // setter for an expense variable
    public void setExpense(double expense) {
        this.expense = expense;


    }


}
