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

public class Demo {
public static void main(String[] args)
{
      Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       MathOperation mo=new MathOperation(a,b);
      System.out.println( MathOperation.add());
         System.out.println( MathOperation.multiply());
         System.out.println( MathOperation.power());
          System.out.println(MathOperation.substract());
}
}
class MathOperation
{
    static int a;
    static int b;
    MathOperation(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    static int add()
    {
        int sum=a + b;
        return sum;
    }
    static int substract()
    {
        int sub=a-b;
        return sub;
    }
    static int multiply()
    {
        int mul=a*b;
        return mul;
    }
    static int power()
    {
        int pow=(int)Math.pow(a,b);
        return pow;
    }
}
