/*
Write a program to reverse the array elements.
 */
package OOPS.Assignments.Assignment2;

import java.util.*;
import java.lang.*;
public class program8 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char[] array=new char[5];
        for(int i=0;i<array.length;i++)
        {
            array[i]=sc.next().charAt(0);
        }
        for(char ele:array)
        {
            System.out.print(ele);
            
        }
         System.out.println();
         System.out.println("----------------------");
        for(int i=array.length-1;i>=0;i--)
        {
            System.out.print(array[i]);
        }     
    }
    
}
