import java.util.Scanner;

public class EightInts {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int num = 8;

        int[] numbers = new int[num];
        int i;
        int count;
        for (count = 0; count < numbers.length; count++) {
            System.out.printf("Please input value %d into an array: ", count+1);
            numbers[count] = inpt.nextInt();
        }

        for (i = 0; i  < numbers.length; i++)
        {
            System.out.print(numbers[i] + "  ");
        }
        System.out.println();
        for (i = numbers.length - 1; i >= 0; i--)
        {
            System.out.print("" + numbers[i] + "  ");
        }
        System.out.println();
    }
}
