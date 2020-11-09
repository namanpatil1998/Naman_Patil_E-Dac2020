/*
Write a program to find the simple interest. Take the principle amount,
rate of interest and time from user using Scanner class.
 */
package OOPS.Assignments.Assignment1.Assignment1;

import java.util.Scanner;
public class program8 {
    
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter interest");
                double i=sc.nextDouble();
                System.out.println("enter time");
                double n=sc.nextDouble();
                System.out.println("enter principle");
                double p=sc.nextDouble();
                double SI=(p*n*i)/100;
                System.out.println("Simple Interest "+ SI);
                
     }
    
}
