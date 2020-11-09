/*
Write the program to find the sum of even elements and sum of odd elements 
present in the array of integer type.

 */
package OOPS.Assignments.Assignment2;

import java.util.*;

public class program10 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] i=new int[10];
        for(int j=0;j<i.length;j++)
        {
          i[j]=sc.nextInt();
        }
        int even=0;
        int odd=0;
        for(int j=0;j<i.length;j++)
        {
            if(i[j]%2==0)
            {
                even+=i[j];
               
            }
            else
            {
                odd+=i[j];
                
            }
        } System.out.println("even sum = "+even);
        System.out.print("odd sum = "+odd);
    }
    
}
