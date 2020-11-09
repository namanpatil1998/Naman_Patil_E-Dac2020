/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package OOPS.Assignments.Assignment3;

import java.util.*;

public class SeriesSqCu {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter upper limit = ");
        int in=sc.nextInt();
        System.out.println("Here is the series!!!");
        for(int i=1;i<=in;i++)
        {
            if(i%2==0)
            {
                System.out.println((int)Math.pow((double)i,2));
            }
            else
            {
                System.out.println((int)Math.pow((double)i,3));
            }
        }
        
    }
    
}
