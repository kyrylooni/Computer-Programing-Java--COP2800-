/**
 *
 */

/**
 * This class "Employee" presents a users with an ability to establish objects with methods of the class itself which
 * includes information like employeeName, employeeClassification, employeeID, employeeGender, and employeeBaseSalary
 *
 * @author KyryloO
 *
 */


public class Employee {

    // setting up private variable (that means that they are accessible only within an Employee class
    private String employeeName;
    private String employeeClassification; // (Faculty, Adjunct, Professional & Career)
    private int employeeID;
    private String employeeGender;
    private int employeeBaseSalary; // P.S: may be also set as a float, decided to go with an integer

    public Employee() // first constructor; does not have any parameters, serve as an object initializer
    {

    }

    // an alternative way of an object's constructor, this time with 5 distinct parameter; Even though it is not executed throughout
    // test class, I just left it here for practice
    public Employee(String name, String classification, int id, String gender, int salary) {

        // object's variables that get assigned to private class variables in the beginning of the object invocation
        employeeName = name; // name variable gets assigned to private employeeName
        employeeClassification = classification; // classification variable gets assigned to private employeeClassification
        employeeID = id; // id variable gets assigned to private employeeID
        employeeGender = gender; // gender variable gets assigned to private employeeGender
        employeeBaseSalary = salary; // salary variable gets assigned to private employeeBaseSalary
    }
        // Name getter method
        public String getEmployeeName() {
            return employeeName;
        }

        // Name setter method
        public void setEmployeeName (String name){
            this.employeeName = name;
        }
        // Classification getter method
        public String getEmployeeClassification () {
            return employeeClassification;
        }
        // Classification setter method
        public void setEmployeeClassification (String employeeClassification){
            this.employeeClassification = employeeClassification;
        }

        // Salary getter method
        public int getEmployeeBaseSalary () {
            return employeeBaseSalary;
        }
        // Salary setter method
        public void setEmployeeBaseSalary( int employeeBaseSalary){
            this.employeeBaseSalary = employeeBaseSalary;
        }
        // Gender getter method
        public String getEmployeeGender () {
            return employeeGender;
        }
        // Gender setter method
        public void setEmployeeGender (String employeeGender){
            this.employeeGender = employeeGender;
        }
        // ID getter method
        public int getEmployeeID () {
            return employeeID;
        }
        // ID setter method
        public void setEmployeeID ( int employeeID){
            this.employeeID = employeeID;
        }
    }







