/*
 Print the third-largest number 
in an array without sorting it 
 */
package OOPS.Assignments.Assignment3;

import java.util.*;

public class Thirdlarge {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
           // for(int j=1;j<arr.length;j++)
          //  {
                if(arr[i]>max)
                {
                  max=arr[i];  
                }
               // else
               //{
               //     max=arr[i];
               // }
           // }
        }
        System.out.println(max);
    }
}
