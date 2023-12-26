/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalculation;

import java.util.Scanner;

public class MyCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number, first, result, second;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please input a three digit number");
        number = in.nextInt();
        //System.out.printf("my number is %d%n", number);
        System.out.println("Please input another three digit number");
        first = in.nextInt();
        
        result = (number * first);
        System.out.printf("my result is %d%n", result);
        
        
        
    }
    
}
