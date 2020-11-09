/*
Write a program to search an element in the array.
 */
package OOPS.Assignments.Assignment2;

import java.util.*;

public class program9 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char[] ch=new char[5];
        for(int i=0;i<ch.length;i++)
        {
            ch[i]=sc.next().charAt(0);            
        }
        for(char element : ch)
        {
            System.out.print(element+" ");
        }
            
    }
            
}
