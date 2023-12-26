import java.util.Scanner;

public class SimpleArrays {
    public static void main(String[] args) {

        Welcome();
        manualArray();
        ArrayWithLoops();
        Goodbye();

    }

    public static void Welcome() {
        System.out.println("This is my simple array demonstration program");
        System.out.println("I hope this will clarify your array concepts");

    }

    public static void manualArray() {
        Scanner uGrade = new Scanner(System.in);
        char[] letterGrades = new char[3];
        System.out.println("This program allows you to store your 3 letter grades for 3 classes: ");

        System.out.println("Please input the letter grade for Class 1: ");
        letterGrades[0] = uGrade.next().charAt(0);
        System.out.println("Please input the letter grade for Class 2: ");
        letterGrades[1] = uGrade.next().charAt(0);
        System.out.println("Please input the letter grade for Class 3: ");
        letterGrades[2] = uGrade.next().charAt(0);

        System.out.println("Grade for Class 1:  " + letterGrades[0]);
        System.out.println("Grade for Class 2:  " + letterGrades[1]);
        System.out.println("Grade for Class 3:  " + letterGrades[2]);
    }

    public static void ArrayWithLoops() {

        Scanner uTemp = new Scanner(System.in);
        int count = 0;

        double sumTemp = 0.0;
        double average = 0.0;
        System.out.println("How many temperatures you want to input: ");
        count = uTemp.nextInt();

        double[] temperature = new double[count];

        System.out.println("You will be inputting temperatures for " + count + "days");
        for (int i = 0; i < temperature.length; i++) {
            System.out.println("Please input your temperature for: " + (i + 1) + "day: ");
            temperature[i] = uTemp.nextDouble();
            sumTemp = sumTemp + temperature[i];
        }
        // display
        for (double temp : temperature)
        {
            System.out.println(temp);
        }
        average = sumTemp/count;
        System.out.println("The average temperature for all " + count + "days is: " + average);
        int aboveAverage = 0;
        int belowAverage = 0;
        for (int tempElem = 0; tempElem < temperature.length; tempElem++)
        {
            if (temperature[tempElem] > average)
            {
            aboveAverage++;

            }
            else if (temperature[tempElem] < average)
            {
                belowAverage++;
            }
        }
        System.out.println();
        System.out.println("There were " + aboveAverage + "days");
        System.out.println("There were " + belowAverage + "days");
    }
    public static void Goodbye()
    {
        System.out.println("Thank you for using my program!");
    }
}
