
public class StudentTest {
    
    public static void main (String[] args)
    {
        //display(Joe);
        Student Joe = new Student();
        display(Joe);
        Student Jake = new Student();
        
        Jake.setID(25487);
        Jake.setClassNumber("COP 2800");
        Jake.setGrade(87.96);
        display(Jake);
        //display(Joe);
        
    }
    
    public static void display (Student s)
    {
        System.out.println("\nStudent Id:" + s.getID() + "\nClass: " + s.getClassNumber() + "\nGrade: " +s.getGrade());
    }
    
}
