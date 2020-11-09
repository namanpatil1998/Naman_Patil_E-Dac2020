/*
Program to check whether number is prime or not.
 */
package OOPS.Assignments.Assignment2;

import java.util.Scanner;

public class program3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int prime=sc.nextInt();
     boolean status=true;
      for(int i=2;prime>i;i++)
        {
         if(prime%i == 0)
         {status=false;
             break;}
        }  
      if(status)
        {
            System.out.print("prime no");
        }
         else
        {
            System.out.print(" not prime no");
        }
        
    }
    
}
