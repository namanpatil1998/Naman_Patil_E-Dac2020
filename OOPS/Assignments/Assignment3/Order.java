/*
4.Given an array of integers, print whether the numbers are in ascending order or in descending
order or in random order without sorting
 Input: [5,14,35,90,139] Output: Ascending
 Input: [88,67,35,14,-12] Output: Descending
Input: [65,14,129,34,7] Output: Random 
 */
package OOPS.Assignments.Assignment3;

import java.util.*;

public class Order {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        //descending
         System.out.println("descending=");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
        }
        for(int k:arr)
        {
            System.out.println(k+" ");
        }
        //ascending
        System.out.println("ascending=");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
        }
        for(int k:arr)
        {
            System.out.println(k+" ");
        }
    }
    
}
