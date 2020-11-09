/*Write a program that takes user’s name as command 
line argument and prints Welcome <entered user name>.*/

package OOPS.Assignments.Assignment1.Assignment1;
import java.util.*;

public class program5 {
     public static void main(String[] args)
    {
       if(args.length>0)
       {System.out.println("Welcome ");}
       for(String name:args)
           {System.out.println(name);}
    }
   
}