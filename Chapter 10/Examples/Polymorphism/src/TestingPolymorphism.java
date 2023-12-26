public class TestingPolymorphism {
    public static void main(String[] args) {
        Salary s = new Salary("Gabrielle Rossado", "31 Martin Avenue, DeBary, FL", 1, 3600.00);

        // polymorphism occurs here
        Employee e = new Salary("Adams Cameron", "44 Devon Street, Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("Call mailCheck using Employee reference --");
        e.mailCheck();

        System.out.println(s.computePay());
        System.out.println(e.computePay());


    }

}
