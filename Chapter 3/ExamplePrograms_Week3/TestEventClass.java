
import java.util.Scanner;

/**
 * creating objects
 * @author PaulA
 */
public class TestEventClass {
    
    public static void main (String[] args)
    {
        String name;
        int guest;
        double cost;
        
        Scanner in = new Scanner (System.in);
        
        //creating objects
        EventClass FirstEvent = new EventClass(); 
        EventClass SecondEvent = new EventClass();
        
        System.out.println("Please input event name: ");
        name = in.nextLine();
        System.out.println("Plese input the number of guest: ");
        guest = in.nextInt();
        
        FirstEvent.setName(name);
        FirstEvent.setNumPeople(guest);
        
        System.out.println("\nEvent Name: " + FirstEvent.getName());
        System.out.println("Number of guests: " + FirstEvent.getNumPeople());
        
        // inputting values for the second object
        in.nextLine();
        System.out.println("Please input event name: ");
        name = in.nextLine();
        System.out.println("Plese input the number of guest: ");
        guest = in.nextInt();
        
        SecondEvent.setName(name);
        SecondEvent.setNumPeople(guest);
        
        System.out.println("\nEvent Name: " + SecondEvent.getName());
        System.out.println("Number of guests: " + SecondEvent.getNumPeople());
    }
    
}
