/*
Write a program to convert temperature from Fahrenheit to Celsius. 
Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]
 */
package OOPS.Assignments.Assignment1.Assignment1;
import java.util.Scanner;

public class program10 {
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     float f=sc.nextFloat();
     float c= 5*(f-32)/9;
     System.out.println("Celcius = "+c);
    }
    
}
