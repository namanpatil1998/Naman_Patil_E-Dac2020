/*
3) WAP to find sum of n  number using iteration and recursion
 */
package DS.Basic;

/**
 *
 * @author naman
 */
import java.util.*;
public class Sum {
    public static void main(String[] args)
    {
        Sum s=new Sum();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
           System.out.println(s.sum(num));
            System.out.println("+++++++++++++++++++++++++++++++++\n Iteration");
           int sum=0;
           for(int i=0;i<=num;i++)
           {
               sum=sum+i;
           }
           System.out.println(sum);
    }
    int sum(int num)
    {
        if(num==1)
        {
            return 1;
        }
        else
        {
            return(num+(sum(num-1)));
        }
    }
    
}
