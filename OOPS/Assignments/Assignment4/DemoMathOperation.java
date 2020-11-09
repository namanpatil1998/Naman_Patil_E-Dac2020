/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPS.Assignments.Assignment4;

/**
 *
 * @author naman
 */
import java.util.*;

public class DemoMathOperation {
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        float c=sc.nextFloat();
        float d=sc.nextFloat();
        float e=sc.nextFloat();
        int arr[]=new int[3];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        double f=sc.nextDouble();
        MathOperation1 mo=new MathOperation1();
        System.out.println(mo.multiply(a, b));
        System.out.println(mo.multiply(arr));
        System.out.println(mo.multiply(a, f));
        System.out.println(mo.multipy(c, d, e));
    }
}
class MathOperation1
{
    int multiply(int a, int b)
    {
        return a*b;
    }
    float multipy(float c, float d, float e)
    {
        return c*d*e;
    }
    int multiply(int[] arr)
    {
        int mul=arr[0];
        for(int i=1;i<3;i++)
        {
           mul*=arr[i];
        }
        return mul;
    }
    double multiply(int a, double f)
    {
        return a*f;
    } 
}