/*Write a program that takes radius of a circle as input. Read the entered radius using Scanner class.
Then calculate and print the area and circumference of the circle.
 */
package OOPS.Assignments.Assignment1.Assignment1;

import java.util.Scanner;

public class program6 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double  radius=sc.nextInt();
        double area=(3.14*(double)(Math.pow(radius,2)));
         System.out.println(area);
        
        
    }
    
}
