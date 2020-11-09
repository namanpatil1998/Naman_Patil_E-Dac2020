/*
 13.	Program to find greatest in 3 numbers. 
[ once using if else statement and then using ternary operator ( logical operator) ]  
 */
package OOPS.Assignments.Assignment1.Assignment1;
import java.util.Scanner;

public class program13 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         System.out.print("X ");
        int x=sc.nextInt();
         System.out.print("Y ");
        int y=sc.nextInt();
         System.out.print("Z ");
        int z=sc.nextInt();
        if(x>y && x>z)
        {
            System.out.println("X is greatest");
        }
        else if(y>x && y>z)
        {
            System.out.println("Y is greatest");
        }
        else if(z>x && z>y)
        {
            System.out.println("Z is greatest");
        }
        else if(z==x || x==y || y==z)
        {
            System.out.println("all are same");
            
        }
        
    }
    
}
