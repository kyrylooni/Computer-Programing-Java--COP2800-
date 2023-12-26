import java.util.Scanner;

/**
 * 
 */

/**
 * Simple java program to use decisions
 *
 */
import java.util.*;
public class SimpleDecisions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 int CURRENT_YEAR = 2017;
	 Scanner in = new Scanner(System.in);
	 int yearBorn, maturity;
	 System.out.println("What year were you born");
	 yearBorn = in.nextInt();
	 
	 int gender;
	 System.out.println("Please input your gender, 1 or male ");
	 gender = in.nextInt();
	 
	 maturity = (CURRENT_YEAR - yearBorn);
	 System.out.println("My age is " + maturity);
	 
	 switch (gender)
	 {
	 case 1:
		 if (maturity == 73)
			  System.out.println("You are really wise");
			 
			 else if (maturity >50)
			 {
				 System.out.println("You are ok");
			     System.out.println("& You are goodlooking!");
			     break;
			 }
			 
			 else if (maturity >30 && maturity < 40)
			 {
				 System.out.println("You are a kid");
		         break;
			 }

			 else if (maturity <20)
			 {
				 System.out.println("You haven't see a lot if things yet");
		         break;
			 }
			 else 
				 System.out.println("Are you alive!");
			     break;
			
	 case 0:
		
		 System.out.println("You are beautiful, matured and wise");
		 break;
	 }
	
	System.out.println("Thank you for using my decision program");
	
	}	 

}
