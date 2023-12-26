public class DemoVariables {
    public static void main(String[] args) {
        int width = 10; // Declares the variable and initializes it with the value 10
        System.out.print("Width: ");
        System.out.println(width);

        width = 58; // Change my memory allocation of width to the new variable of 33
        System.out.print("Width: ");
        System.out.println(width);

        int height = 55; // Declares the variable height and initializes it with the value 55
        width = height + 15; /** The right-hand side of the expression is 55 + 15,
                            after the execution the value 70 is assigned to the left-hand side  */
        System.out.print("Width: ");
        System.out.println(width);
    }
}
