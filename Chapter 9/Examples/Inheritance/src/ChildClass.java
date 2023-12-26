public class ChildClass extends ParentClass {

    int age = 15;

    public void showMyInfo() {
        System.out.println("I am the child");
        System.out.println("My age is: " + age);
    }

    public void my_method() {
        // Instantiating subclass object
        ChildClass first = new ChildClass();

        // Invoking the display() method of sub-class object
        first.showMyInfo();

        // Invoking the display() method of superclass
        super.showMyInfo();

        // Printing the value of the variable num of subclass
        System.out.println("Value of the variable named age in child class: "+ first.age);

        System.out.println("Value of the variable named age in parent class: "+ super.age);
    }
}
