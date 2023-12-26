public class Event {
    
    private String name;
    private int numOfPeople;
    private double costOfEvent;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public double getCostOfEvent() {
        return costOfEvent;
    }

    public void setCostOfEvent(double costOfEvent) {
        this.costOfEvent = costOfEvent;
    }
    
    
    
}
-----------
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PaulA
 */
public class UsingEventClass {
    
    public static void main (String[] args)
    {
        String EventName;
        int guests;
        double cost;
        double totalcost;
        final double guestCost = 10.99;
        
        Scanner in = new Scanner(System.in);
       
        Event FirstEvent = new Event();
        Event SecondEvent = new Event();
        
        System.out.println("Plese enter the name of your event:");
        EventName = in.nextLine();
        System.out.println("Plese enter the number of guests: ");
        guests = in.nextInt();
        
        FirstEvent.setName(EventName);
        FirstEvent.setNumOfPeople(guests);
        
        System.out.println("The name of your event is : " + FirstEvent.getName()+ "\n the number of guests: " + FirstEvent.getNumOfPeople());
        totalcost = guestCost * FirstEvent.getNumOfPeople();
        System.out.println("Total cost of:  "+ FirstEvent.getName() + " "+ totalcost );
        in.nextLine();
        System.out.println("Plese enter the name of your event:");
        EventName = in.nextLine();
        
        SecondEvent.setName(EventName);
        
        System.out.println("The name of your event is : " + SecondEvent.getName());
        
        
    }
    
   
    
}
--------------

--------------
class Event
{
   public final static double GUEST_PRICE = 35.00;
   public final static int LARGE_EVENT = 50;
   private String eventNumber;
   private int guests;
   private double price;
   public Event()
   {
      this("A000", 0);
   }
   public Event(String num, int guests)
   {
      setEventNumber(num);
      setGuests(guests);
   }
   public void setEventNumber(String num)
   {
      eventNumber = num;
   }
   public void setGuests(int gsts)
   {
      guests = gsts;
      price = guests * GUEST_PRICE;
   }
   public String getEventNumber()
   {
      return eventNumber;
   }
   public int getGuests()
   {
      return guests;
   }
   public double getPrice()
   {
      return price;
   }
}
-----------------------

import java.util.Scanner;
public class EventDemo
{
   public static void main(String[] args)
   {
      String eventNum;
      int guests;
      Event e1 = new Event();
      eventNum = getEventNumber();
      guests = getGuests();
      Event e2 = new Event(eventNum, guests);
      displayDetails(e1);
      displayDetails(e2);
   }
   public static String getEventNumber()
   {
      String num;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter event number >> ");
      num = input.nextLine();
      return num;
   }  
   public static int getGuests()
   {
      int guests;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of guests >> ");
      guests = input.nextInt();
      input.nextLine();
      return guests;
   }
   public static void displayDetails(Event e)
   {
      System.out.println("\nEvent #" + e.getEventNumber());
      System.out.println("The price for an event with " + e.getGuests() +
         " guests at $" + e.GUEST_PRICE + " per guest is $" + e.getPrice());
      System.out.println("Whether this is a large event is " +
         (e.getGuests() >= e.LARGE_EVENT));
   }
}
-----------------------
