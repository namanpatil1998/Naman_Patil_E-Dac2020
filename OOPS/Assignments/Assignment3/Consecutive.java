/*
2.Write a program which takes an array of integers and
prints the running average of 3 consecutive
integers. In case the array has fewer than 3 integers, 
there should be no output.
Input: [5,14,35,89,140]
Output: [18, 46, 88] 
 */
package OOPS.Assignments.Assignment3;

import java.util.*;
public class Consecutive {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[6];
        int min=3;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr.length> min)
            {
                if(i+2<arr.length)
                {
                    sum=(arr[i]+arr[i+1]+arr[i+2])/3;
                System.out.println(sum+" ");
                }
            }
        }
        
    }
           
    
}
