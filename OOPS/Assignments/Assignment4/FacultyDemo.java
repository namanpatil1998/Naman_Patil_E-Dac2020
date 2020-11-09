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
public class FacultyDemo {
    public static void main(String[] args)
    {
        Faculty f=new Faculty();
        FullTimeFaculty ff=new FullTimeFaculty();
        PartTimeFaculty pf=new PartTimeFaculty();
        f.input();
        ff.input();
        pf.input();
        f.printSalary();
        ff.printSalary();
        pf.printSalary();
    }
    
}
class Faculty
{
    Scanner sc=new Scanner(System.in);
   int facultyId,Salary;
   void input()
   {
       facultyId=sc.nextInt();
       Salary=sc.nextInt();
   }
   void printSalary()
   {
       System.out.println(Salary);
   }
}
class FullTimeFaculty extends Faculty
{
    int basicSalary,allowance;
    @Override
    void input()
   {
       allowance=sc.nextInt();
       basicSalary=sc.nextInt();
       Salary=basicSalary+allowance;
   }
     void printSalary()
   {
       System.out.println(Salary);
   }
}
class PartTimeFaculty extends Faculty
{
    int workingHours,ratePerHour;
    @Override
    void input()
   {
       workingHours=sc.nextInt();
       ratePerHour=sc.nextInt();
       Salary=workingHours*ratePerHour;
   }
     void printSalary()
   {
       System.out.println(Salary);
   }
}