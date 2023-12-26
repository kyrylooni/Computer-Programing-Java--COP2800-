import java.util.Scanner;
public class inclassAge
{// opening of class
  public static void main (String[] args)
  {// opening of the main method
  
     String name;
     int currntYear, yrarBorn;
     int yourAge;
     Scanner in = new Scanner(System.in);
     System.out.println (" What is your name ");
     name = in.nextLine();
     System.out.println (" What is the current year ");
     currntYear = in.nextInt();
     in.nextLine();
      System.out.println (" What year were your born ");
     yrarBorn = in.nextInt();
      in.nextLine();
     yourAge = (currntYear - yrarBorn);
     
     System.out.println ("Hello  " + name+ "Welcome to be age calculator");
     System.out.println ("Your are sooo old " + yourAge + " !! ready for a senior citizen discount !!");
     
     System.out.println ("Thank you for using my program ");     
     
     System.out.print ("Java Programming");
     System.out.println (" \nSo far so good... no complaints");
  }// closing of the main method
}