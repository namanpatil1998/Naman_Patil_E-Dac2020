/*
Write a program to swap two numbers without using third variable. 
 */
package OOPS.Assignments.Assignment1.Assignment1;

public class program11 {
    public static void main(String[] args)
    {
        int x=10, y=30;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x+" "+y);
    }
    
}
