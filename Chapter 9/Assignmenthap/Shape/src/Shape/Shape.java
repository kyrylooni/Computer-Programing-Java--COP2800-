/**
 * @author KyryloO
 *
 * This Shape class serves as a test for inherrited methods and classes by initializing two objects from ColorSphere and
 * ColorSquare. The program replicates the inherritance tree structure as it is provided in the assignment.
 *
 *
 */


package Shape;

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
        newSquare.showSquareDimensions();
        newSquare.ShowColor();
        System.out.println("Area of Triangle is: " + newSquare.Area());


        ColorSphere newSphere = new ColorSphere();
        System.out.println("Enter the radius: ");
        newSphere.radius = inpt.nextInt();
        System.out.println("Enter color of the sphere: ");
        newSphere.color = inpt.next();

        System.out.println("------------Sphere------------");
        newSphere.showSphereDimensions();
        newSphere.ShowColor();
        System.out.println("Area of Sphere is: " + newSphere.Area());




    }



}
