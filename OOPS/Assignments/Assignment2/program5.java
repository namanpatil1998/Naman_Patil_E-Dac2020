/*
Print all prime numbers between two given numbers. [ break continue ]
 */
package OOPS.Assignments.Assignment2;

import java.util.*;

public class program5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int status;
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        for(int j=a;j<=b;j++)
        {
          
           if( j==1 || j==0 )
          continue;
           status=1;
           
        for(int i=2;i<j;++i)
        {
            if(j%i==0)
            {
                status=0;
                break;
            }
        }
         if(status==1)
            { System.out.println(j);
            }
        }
    }
    
}
