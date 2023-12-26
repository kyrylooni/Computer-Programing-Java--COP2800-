public class MethodDemo {
    public static void main(String[] args) {
        String greeting = "Hello world!";
        System.out.println(greeting);

        int numberOfCharacters = greeting.length();

        System.out.print("numberOfCharacters: ");
        System.out.println(numberOfCharacters);

        System.out.print("greeting.length(): ");
        System.out.println(greeting.length());

        String river = "Mississippi";
        river = river.replace("issipp", "our");
        System.out.print("river:");
        System.out.println(river);
    }
}