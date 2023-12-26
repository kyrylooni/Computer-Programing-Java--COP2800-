import java.util.Scanner;

public class SquareCube {
     public static void main(String[] args) {

         int choice;
         Scanner in = new Scanner(System.in);

         System.out.println("Please enter an integer value: ");
         choice = in.nextInt();

         System.out.printf("%s\t%s\t%s%n", "number", "square", "cube");
         System.out.printf("%d\t%d\t%d%n", choice, (choice * choice),(choice * choice * choice));
         System.out.println("Thank you for using my program");


    }
}
