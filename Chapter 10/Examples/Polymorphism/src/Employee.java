/*
* Polymorphism in Java with examples
 */


public class Employee {
    // set private class variables
    private String name;
    private String address;
    private int number;
    private double salary;


    // constructor
    public Employee(String name, String address, int number) {
        System.out.println("Employee Information: ");
        this.name = name;
        this.address = address;
        this.number = number;

    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary / 52;
    }
}
