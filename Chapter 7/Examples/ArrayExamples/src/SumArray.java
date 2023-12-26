import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter into an array?: ");
        int num = inpt.nextInt();

        int[] array = new int[num];
        int total = 0;
        for (int count = 0; count < array.length; count++) {
            System.out.printf("Please input value %d to calculate the total: ", count);
            array[count] = inpt.nextInt();

        }
        for (int count = 0; count < array.length; count++) {
            total += array[count];
        }
        System.out.printf("Total of the numbers in an array is %d", total);
    }
}