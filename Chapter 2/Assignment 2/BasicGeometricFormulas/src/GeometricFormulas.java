/**
 *
 * @author KyryloO
 */

import java.util.Scanner;

public class GeometricFormulas {
    public static void main(String[] args) {
        System.out.println("Welcome to the circle formulas calculator"); // welcoming message
        int RADIUS; // Declare a radius integer variable

        Scanner in = new Scanner(System.in); // declare a scanner variable
        System.out.println("Please input the radius of a circle as an integer: "); // Print the message prompt
        RADIUS = in.nextInt();  // Assign the inputted integer to the radius variable

        int diameter; // Declare a diameter integer variable
        diameter = 2 * RADIUS; // Calculate the diameter and assigning result to the variable
        System.out.printf("\nThe diameter of a circle is: "); // Print the result
        System.out.println(diameter);

        double PI = 3.14159; // Assign the value of pi to be a floating point number

        double circumference = 2 * (PI * RADIUS); // Calculate the circumference and assigning result to the variable
        System.out.print("The circumference of a circle is: "); // Print the result
        System.out.println(circumference);

        double area = PI * (RADIUS * RADIUS); // Calculate the area and assigning result to the variable
        System.out.print("The area of a circle is: "); // Print the result
        System.out.println(area);

        System.out.printf("\nThank you for using my program :) "); // thank you message
    }
}
