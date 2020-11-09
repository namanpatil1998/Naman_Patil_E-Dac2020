/*
 Sort a ten element array in descending order.
 */
package OOPS.Assignments.Assignment2;

import java.util.*;

public class program7 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int temp=0;
        int[] array=new int[10];
        for(int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int j=0;j<array.length;j++)
        {
            for(int k=j+1;k<array.length;k++)
            {
                if(array[j]>array[k])
                {
                       temp=array[j];
                       array[j]=array[k];
                       array[k]=temp;
                }
            }
        }
        System.out.println();
        
        for(int i=0;i<array.length;i++)
        {
        System.out.print(array[i]+" ");
        }      
        
    }
    
}
