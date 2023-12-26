import java.util.Scanner;

public class SimpleMaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int firstNumber = in.nextInt(); // read first integer

        System.out.println("Enter second integer: ");
        int secondNumber = in.nextInt(); //read second number

        System.out.printf("%nSum is %d%n", (firstNumber + secondNumber));
        System.out.printf("Difference is %d%n", (firstNumber - secondNumber));
        System.out.printf("Product is %d%n", (firstNumber * secondNumber));
        System.out.printf("Quotient is %d%n", (firstNumber / secondNumber));
    }
}
