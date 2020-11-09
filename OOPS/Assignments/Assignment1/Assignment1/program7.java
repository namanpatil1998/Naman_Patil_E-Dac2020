/*
Write a program to calculate sum of 5 subject’s marks & find percentage.
Take the obtained marks from user using Scanner class. Output should be in this format [ percentage marks = 99 % ].
Use concatenation operator here.
 */
package OOPS.Assignments.Assignment1.Assignment1;

import java.util.Scanner;
public class program7 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] x=new int[5];
        for(int i=0;i<=4;i++){
        x[i]=sc.nextInt();
        }
        for(int element:x)
        {
        System.out.println(element);
        }
        
        int sum=0;
                for(int i=0; i < x.length; i++)
        {
            sum += x[i];
        }
        
        double percent= ((double)sum/200)*100;
        System.out.println("Total is " + sum);
        System.out.println("percent is " + percent + "%");
        
    }
}
