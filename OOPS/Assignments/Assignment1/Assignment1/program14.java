/*
Program to check that entered year is a leap year or not.
 */
package OOPS.Assignments.Assignment1.Assignment1;

import java.util.Scanner;

public class program14 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if((year%4 == 0) && (year%100 != 0) || (year%400 == 0))
        {
            System.out.println("leap year = "+year);
        }
        else
        {System.out.println("Not a leap year = "+year);}
    }
    
}
