import java.util.Random;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author PaulA
 *
 */
public class GameTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random compRandom = new Random();
		Scanner in = new Scanner(System.in);
		
		int compNum = compRandom.nextInt(20);
		//System.out.println("Computer generated: " + compNum);
		
		System.out.println("Bob, please input your number: ");
		int Bob = in.nextInt();
		
		System.out.println("Ella, please input your number: ");
		int Ella = in.nextInt();
		
		if ((compNum -Bob ) < (compNum - Ella))
		{
			System.out.println ("Bob is the winner and his number is :" + Bob);
		}
		else 
		{
			System.out.println("Ella is the winner and her number is:"  + Ella);
			
		}
		System.out.println("We want to show that we didn't cheat, because the random number was:" + compNum);

	}

}
