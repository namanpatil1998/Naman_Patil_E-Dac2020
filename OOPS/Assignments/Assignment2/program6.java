/*
 Program to show sum and average of 10 element 
array. Accept array elements from user. 
 */
package OOPS.Assignments.Assignment2;

import java.util.*;
public class program6 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double[] array=new double[10]; 
        for(int i=0;i<array.length;i++)
        {
        array[i]=sc.nextDouble();
        }
        double sum=0;
        double average=0;
        double remainder=0;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
            average=(sum/array.length);    
        }
        System.out.println("Total = " + sum);
        System.out.println("Average = " + average);
    }
    
}

