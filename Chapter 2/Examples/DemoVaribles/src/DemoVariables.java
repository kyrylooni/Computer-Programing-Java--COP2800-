public class DemoVariables {
    public static void main(String[] args) {

        int width = 10; // Declares the variable width and initializes it with the value of 10

        System.out.print("Width: ");
        System.out.println(width);

        width = 33; // change my memory allocation of width to the new value of 33
        System.out.print("Width: ");
        System.out.println(width);

        int height = 25; // Declares the variable width and initializes it with the value of 25
        width = height + 33; // the right hand side can be an assignment/expression
        System.out.print("Width: ");
        System.out.println(width);

        width = width + 20; // adding constants
        System.out.print("Width (added): ");
        System.out.println(width);
    }
}