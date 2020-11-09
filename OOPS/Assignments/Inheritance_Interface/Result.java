/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package OOPS.Assignments.Inheritance_Interface;

/**
 *
 * @author naman
 */
import java.util.*;
public class Result {
    public static void main(String[] args)
    {
     Student1 std=new Student1();
     std.collegeName();
     std.marks();
    }  
}
interface College
{
    int a=7;
    void collegeName();
}
interface Exam
{
    Scanner sc=new Scanner(System.in);
    //System.out.println("Enter Maths Marks:- ");
    int math=sc.nextInt();
    int phy=sc.nextInt();
    void marks();
}

class Student1 implements College,Exam
{
    int j=College.a;
    @Override
    public void collegeName()
    {
        System.out.println("Ramrao Adik Institude Of Technology,Sector"+a+",Nerul,Navi Mumbai");
    }
    @Override
    public void marks()
    {
        int math=Exam.math;
        int phy=Exam.phy;
        System.out.println("\nMath="+math+"\nPhysics="+phy);
    }
}