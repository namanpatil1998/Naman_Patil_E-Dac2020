/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package DS.Basic;

import java.util.Scanner;

/**
 *
 * @author naman
 */
public class Factorial {
    public static void main(String[] args)
    {
        Factorial f=new Factorial();
         Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
           System.out.println(f.mul(num));
            System.out.println("+++++++++++++++++++++++++++++++++\n Iteration");
        int mul=1;
           for(int i=1;i<=num;i++)
           {
               mul=mul*i;
           }
           System.out.println(mul);
           
    }
    int mul(int num)
    {
        if(num==1)
        {
            return 1;
        }
        else
        {
            return (num*(mul(num-1)));
        }
    }
}
