/*
Write a program to reverse a given number.
 */
package OOPS.Assignments.Assignment2;

import java.lang.*; 

public class program2 {
    public static void main(String[] args)
    {
       int[] array={1,2,3,4,6};
        for(int i=array.length-1;i>=0;i--)
        {
            System.out.print(array[i]);
        }
        
        
        String number="1345-----";
        StringBuilder st=new StringBuilder();
        st.append(number);
        st=st.reverse();
        System.out.print(st);
        
    }
    
}
