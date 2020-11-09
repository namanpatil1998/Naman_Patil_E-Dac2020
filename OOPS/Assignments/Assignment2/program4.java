/*
Calculate  series : 12+22+32+42+.........+n2
 */
package OOPS.Assignments.Assignment2;

import java.util.*;
import java.io.*;
public class program4
{
public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
    System.out.print("Enter upper bound = ");
   int n=sc.nextInt();
	for(int i=12;i<n;i++)
	{
            if(i%10==2)
		{
		  System.out.print(i+"+");
		}
	}
}
}