/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package DS.sorting;

/**
 *
 * @author naman
 */
import java.util.*;
public class Bubble {
     int count=0;
    int[] bubbleSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                }
            }
        }
        return arr;
    }
    
    public static void main(String[] args)
    {
        Bubble b=new Bubble();
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter size of array :- ");
          int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements of array :- ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        b.bubbleSort(arr);
        System.out.println("Sorted Elements of array :- ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Count "+b.count);
    }
}
