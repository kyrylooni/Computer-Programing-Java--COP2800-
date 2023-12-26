import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);

        ColorSquare newSquare = new ColorSquare();
        System.out.println("Enter the side measurements of the square: ");
        newSquare.side = inpt.nextInt();
        System.out.println("Enter color of the square: ");
        newSquare.color = inpt.next();

        System.out.println("------------Square------------");
        newSquare.showDimensions();
        newSquare.ShowColor();
        System.out.println("Area of Triangle is: " + newSquare.Area());


    }



}
