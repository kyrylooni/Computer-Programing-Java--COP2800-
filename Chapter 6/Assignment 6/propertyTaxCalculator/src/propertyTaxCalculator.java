/**
 * @author KyryloO
 *
 * @Prompt: Write a tax property calculator for a construction company that will calculate the assessment value of the property
 *  as well as property tax based on the property tax for each $100 of the assessed value and county tax percentage inputted by the user. \
 *  Allow the user to conduct calculations for more than one property. In the end, display the total property tax    Make use
 *  of the object-oriented concepts to make your program maintainable, modular, and scalable. Make your program interactive
 *
 *
 * This propertyTaxCalculator class  specifies getter and setters as well as calculateAssessmentValue as well as
 * calculatePropertyTax classes to calculate
 *
 */


import java.util.Scanner;

public class propertyTaxCalculator {

    static Scanner inpt = new Scanner(System.in);
    // getter
    public String getCityOfResidence() {
        return cityOfResidence;
    }
    // setter
    public void setCityOfResidence(String cityOfResidence) {
        this.cityOfResidence = cityOfResidence;
    }
    // establishing the private value for city the user reside in
    private String cityOfResidence;
    // variable for userName
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double calculateAssessmentValue() {

        System.out.print("Enter your property value in dollars: ");
        // ask the user for a property value input
        double propertyValue = inpt.nextDouble();
        System.out.print("Enter county tax rate as a percentage (%): ");
        // ask the user for county tax rate input as a percentage
        double countyTaxRate = inpt.nextDouble();

        // value to store the resulted value
        double assessmentValue = 0;

        // if the inputted value for property is not 0
        if (propertyValue > 0) {
            // convert percentage into a decimal point number
            double countyTaxRatePercent = (countyTaxRate / 100);
            // multiply property value by the decimal tax rate value to obtain the result and store it in the assessment value
            assessmentValue = propertyValue * countyTaxRatePercent;

        }
        System.out.printf("The assessment value for your property is: $%,.2f\n", assessmentValue);
        // return the value to method invocation and store the value within an invocation
        return assessmentValue;
    }

    public double calculatePropertyTax() {

        System.out.print("Please provide a property tax rate for each $100 worth of property: ");
        // ask the user for a property tax rate for 100 dollars of the property
        double property_tax = inpt.nextDouble();
        // invoke calculateAssessmentValue method and save the results in assesVal variable
        double assesVal = calculateAssessmentValue();
        // calculate property tax by multiplying assessment value of the property and property tax
        double taxForProperty = assesVal * (property_tax /100);
        // calculate totalPropertyTax by adding tax for property and assessment value
        double totalPropertyTax = taxForProperty + assesVal;
        System.out.printf("\nYour total property tax is: $%,.2f\n\n", totalPropertyTax);
        // return the value to method invocation and store the value within an invocation
        return totalPropertyTax;


    }



    }

