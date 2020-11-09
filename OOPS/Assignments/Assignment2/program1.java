/*
  Write a program to print table of any entered number using loop.
 */
package OOPS.Assignments.Assignment2;

import java.util.Scanner;

public class program1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
           int table=a*i;
           System.out.println(a+ " x " +i +" = " +table);
        }
    }
           
    
}
