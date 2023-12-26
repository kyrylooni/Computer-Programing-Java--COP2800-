/**
 *
 */



/**
 * @author KyryloO
 *
 * This class is a test class for Employee.java and serve to initialize some objects of a class Employee and test out
 * correctness of setter and getters output while incorporating interactive messages that simulate database behavior
 */

public class EmployeeTest {

    public static void main(String[] args) {

        System.out.print("\nWelcome to Daytona State College employees database");

        Employee employee1 = new Employee();
        System.out.print("\n\nPlease provide an information for first employee below\n");

        employee1.setEmployeeName("Kyrylo Onishchenko");
        employee1.setEmployeeClassification("Professional & Career"); // (Faculty, Adjunct, Professional & Career)
        employee1.setEmployeeID(940129);
        employee1.setEmployeeGender("Male");
        employee1.setEmployeeBaseSalary(130000);
        System.out.println("Saving results...");

        System.out.printf("Employee #1:\nName: %s\tClassification: %s\tID: %d\tGender: %s\tBase Salary: $%,d\n", employee1.getEmployeeName(), employee1.getEmployeeClassification(),
                employee1.getEmployeeID(), employee1.getEmployeeGender(), employee1.getEmployeeBaseSalary());
        System.out.println("---------------------------------------------------------------------------------");


        Employee employee2 = new Employee();
        System.out.print("\n\nPlease provide an information for second employee below\n");

        employee2.setEmployeeName("Adam Smith");
        employee2.setEmployeeClassification("Faculty"); // (Faculty, Adjunct, Professional & Career)
        employee2.setEmployeeID(459421);
        employee2.setEmployeeGender("Male");
        employee2.setEmployeeBaseSalary(90000);
        System.out.println("Saving results...");

        System.out.printf("Employee #2:\nName: %s\tClassification: %s\tID: %d\tGender: %s\tBase Salary: $%,d\n", employee2.getEmployeeName(), employee2.getEmployeeClassification(),
                employee2.getEmployeeID(), employee2.getEmployeeGender(), employee2.getEmployeeBaseSalary());
        System.out.println("---------------------------------------------------------------------------------");



        Employee employee3 = new Employee();
        System.out.print("\n\nPlease provide an information for third employee below\n");

        employee3.setEmployeeName("Alicia Garcia");
        employee3.setEmployeeClassification("Adjunct"); // (Faculty, Adjunct, Professional & Career)
        employee3.setEmployeeID(678462);
        employee3.setEmployeeGender("Female");
        employee3.setEmployeeBaseSalary(73000);
        System.out.println("Saving results...");

        System.out.printf("Employee #3:\nName: %s\tClassification: %s\tID: %d\tGender: %s\tBase Salary: $%,d\n", employee3.getEmployeeName(), employee3.getEmployeeClassification(),
                employee3.getEmployeeID(), employee3.getEmployeeGender(), employee3.getEmployeeBaseSalary());
        System.out.println("---------------------------------------------------------------------------------");



        Employee employee4 = new Employee();
        System.out.print("\n\nPlease provide an information for forth employee below\n");

        employee4.setEmployeeName("Brian Johnson");
        employee4.setEmployeeClassification("Professional & Career"); // (Faculty, Adjunct, Professional & Career)
        employee4.setEmployeeID(358987);
        employee4.setEmployeeGender("Male");
        employee4.setEmployeeBaseSalary(110000);
        System.out.println("Saving results...");

        System.out.printf("Employee #4:\nName: %s\tClassification: %s\tID: %d\tGender: %s\tBase Salary: $%,d\n", employee4.getEmployeeName(), employee4.getEmployeeClassification(),
                employee4.getEmployeeID(), employee4.getEmployeeGender(), employee4.getEmployeeBaseSalary());
        System.out.println("---------------------------------------------------------------------------------");


        Employee employee5 = new Employee();
        System.out.print("\n\nPlease provide an information for fifth employee below\n");

        employee5.setEmployeeName("Elizabeth Adams");
        employee5.setEmployeeClassification("Adjunct"); // (Faculty, Adjunct, Professional & Career)
        employee5.setEmployeeID(569043);
        employee5.setEmployeeGender("Female");
        employee5.setEmployeeBaseSalary(75000);
        System.out.println("Saving results...");


        System.out.printf("Employee #5:\nName: %s\tClassification: %s\tID: %d\tGender: %s\tBase Salary: $%,d\n", employee5.getEmployeeName(), employee5.getEmployeeClassification(),
                employee5.getEmployeeID(), employee5.getEmployeeGender(), employee5.getEmployeeBaseSalary());
        System.out.println("---------------------------------------------------------------------------------");

        System.out.print("All  changes have been saved successfully\n");
        System.out.println("Finishing the execution now......");

    }
}
