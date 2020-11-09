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

public class ProcessorDemo {
    public static void main(String[] args)
    {
        Factorial f=new Factorial();
        f.showData();
        System.out.println(f.process());
    }
}
abstract class Processor
{
 int data;
 int showData()
 {
    System.out.println(data);
    return 1;
 }
 abstract int process();
 
}
class Factorial extends Processor
{
    Scanner sc=new Scanner(System.in);
    @Override
    int process()
    {
       int factorial=1;
       data=sc.nextInt(); 
       for(int i=1;i<=data;i++)
       {
            factorial=factorial*i;   
       }
       return factorial;
    }
}