/**
 * @author KyryloO
 *
 * This class throws an exeption into a constructor that involves three different instance variables.
 * If the constructor does not register one of the parts of constructor as it is provided within
 * each conditional statement, the program throws an exceptions for each of the initialized objects, provided as test cases,
 * except the last one.
 *
 *
 */


public class SomeClass {

    private String name;
    private int age;
    private String socialSecurityNumber;

    public SomeClass(String name, int age, String socialSecurityNumber) throws Exception {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name is invalid");
        }
        if (age < 0) {
            throw new Exception("Age must be greater than 0");
        }
        if (socialSecurityNumber.length() != 9) {
            throw new Exception("Social Security number should be 9 digits long");
        }
        this.name = name;
        this.age = age;
        this.socialSecurityNumber = socialSecurityNumber;

    }

    public static void main(String[] args) {
        try {
            SomeClass emp1 = new SomeClass("Kyrylo", 20, "978678898");
            SomeClass emp4 = new SomeClass("", 20, "978678898");

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            SomeClass emp2 = new SomeClass("Josh", -5 , "656337890");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            SomeClass emp3 = new SomeClass("Kate", 21 , "667");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            SomeClass emp4 = new SomeClass("", 20, "978678898");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("New employee is registered");

        }
    }
}
