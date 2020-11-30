/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package DS.daily;

/**
 *
 * @author naman
 */
import java.util.*;
public class arrayrev {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); 
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        reverse(arr);
         for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
    static int[] reverse(int arr[])
    {
        for(int i=0,j=arr.length-1;i<(arr.length)/2||j>arr.length/2;i++,j--)
            {
               int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        return arr;
    }
}
