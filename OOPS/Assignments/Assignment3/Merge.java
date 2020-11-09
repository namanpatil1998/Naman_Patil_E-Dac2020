/*
Write a program to merge two arrays of integers by reading one number at a time from each array
until one of the array is exhausted, and then concatenating the remaining numbers.
 Input: [23,60,94,3,102] and [42,16,74]
 Output: [23,42,60,16,94,74,3,102]
 */
package OOPS.Assignments.Assignment3;
import java.util.*;
public class Merge {
    public static void main(String[] args)
    {
        int arr[]=new int[]{23,60,94,3,102}; //{23,42,60,16,94,74,3,103}
        int arr2[]=new int[]{42,16,74};
        int k=0,i=0,j=0;
        int n=arr.length+arr2.length;
        int arr3[]=new int[n];

       while(i<arr.length && j<arr2.length)
       {
           arr3[k++]=arr[i++];
           arr3[k++]=arr2[j++];

       }
       if(arr.length>arr2.length)
       {
            while(k<arr3.length)
            {
                arr3[k++]=arr[i++];
            }
       }else
       {
           while(k<arr3.length)
           {
               arr3[k++]=arr2[i++];
           }
       }
       for(int a=0;a<arr3.length;a++)
       {
           System.out.print(arr3[a]+" ");
       }
}
    
}
