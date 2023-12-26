import java.util.Scanner;

/** simple Java program to determine if number is ood or even. The program is interactive
 * @Author: KyryloO
 *
 */

public class OddEven {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number;

        System.out.println("Enter ang integer number: ");
        number = in.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }


        }
    }