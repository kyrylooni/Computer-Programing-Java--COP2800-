/**
 * @author KyryloO
 *
 * @Prompt: Write a tax property calculator for a construction company that will calculate the assessment value of the property
 *  as well as property tax based on the property tax for each $100 of the assessed value and county tax percentage inputted by the user. \
 *  Allow the user to conduct calculations for more than one property. In the end, display the total property tax    Make use
 *  of the object-oriented concepts to make your program maintainable, modular, and scalable. Make your program interactive
 *
 *
 * This propertyTaxCalculatorTest class specifies Welcome and Goodbye methods to produce greet and finish execution messages
 * respectively. It also incorporates the for loop to loop through  the number of properties user has in a city he/she resides
 * At the end, function accumulates total property tax price across all properties.
 */



import java.util.Scanner;

public class propertyTaxCalculatorTest {
    // initialize scanner object
    public static Scanner inpt = new Scanner(System.in);

    public static void main(String[] args) {

        // initializing an object of a class propertyTaxCalculator
        propertyTaxCalculator user1 = new propertyTaxCalculator();
        // ask for user's name input
        System.out.print("Please input your name: ");
        user1.setUserName(inpt.nextLine());
        // calling a static Welcome method by passing a name parameter
        Welcome(user1.getUserName());

        System.out.print("Please enter your city of residence: ");
        // ask for the country of residence
        user1.setCityOfResidence(inpt.nextLine());

        // initialize the counter value of properties to 0
        int numberOfPropertiesOwned = 0;
        System.out.printf("Please input a number of properties you own in %s: ", user1.getCityOfResidence());
        // ask the user for number of properties
        numberOfPropertiesOwned = inpt.nextInt();

        // initialize totalPropertyTax variable to 0
        double totalPropertyTax = 0;

        // while the user own some property (at least 0)
        while (numberOfPropertiesOwned > 0) {
            System.out.printf("Lets calculate the value for property #%d\n", numberOfPropertiesOwned);
            // call the calculatePropertyTax() method on the user1 object (non-static) on each iteration as long as
            // numberOfPropertiesOwned is not 0 and save the result into propTax variable
            double propTax = user1.calculatePropertyTax();
            // calculate the total by accumulating the amount of property tax on each iteration
            totalPropertyTax = totalPropertyTax  +  propTax;
            // decrease numberOfPropertiesOwned -1 on each iteration
            numberOfPropertiesOwned --;
        }
        // display the total
        System.out.printf("\n\nYour total property tax from across all the properties is: $%,.2f", totalPropertyTax );
        // call (static) Goodbye method
        Goodbye(user1.getUserName());
    }
        public static void Welcome (String name){
            System.out.println("Welcome to Silver Breeze Reality Homes multipurpose property tax calculator " + name + "!\n");

        }

        public static void Goodbye (String name) {
            System.out.println("\nFinishing execution...");
            System.out.println("Thank you " + name + " for using our software. Please check out other software and deals available on our website :)");
        }
}


