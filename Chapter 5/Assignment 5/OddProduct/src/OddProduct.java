/**
 * @author KyryloO
 *
 * This program calculates the product based on the odd numbers withing a range from 1 to 20
 *
 */
public class OddProduct {
    public static void main(String[] args) {

        int number = 0; // number counter
        int total_product = 1; // total of the product that is initialized to 1
        // counter control iteration
        while (number <= 20) { // while number counter is greater or equal to
            if (number % 2 != 0) { // if the remainder of the number is not 0, meaning that it is an odd number
                System.out.println("Multiplying " + number + " to obtain a product");
                total_product = total_product * number; // accumulate the total
            }
            number++; // increment the number counter by 1
        }
        // display the total product after accumulation
        System.out.printf("The total product of odd numbers is: %,d", total_product);

    }
}
