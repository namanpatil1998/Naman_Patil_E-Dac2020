/*
Accept person’s gender (character m for male and f for female), age (integer), 
as input and then check whether person is eligible for marriage or not.
 */
package OOPS.Assignments.Assignment1.Assignment1;

import java .util.*;
public class program15 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Gender = ");
      char gender=sc.next().charAt(0);
      System.out.println("Enter Age = ");
      int age=sc.nextInt();
      if((gender=='M' ||gender=='m')&&(age>=21)){
      System.out.println("Congratulations man you are elegibale for marriage");}
      else if((gender=='F' ||gender=='f')&&(age>=18))
      {System.out.println("Congratulations girl you are elegibale for marriage");}
      else
        {System.out.println("sorry you are not elegibale for marriage");}
       
    }
    
}
