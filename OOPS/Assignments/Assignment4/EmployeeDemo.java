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
public class EmployeeDemo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int empNo=sc.nextInt();
        EmployeeD ed1[]=new EmployeeD[3];
        for(int i=0;i<3;i++)
        {
            double salary=sc.nextDouble();
            ed1[i]=new EmployeeD(empNo,salary);
            ed1[i].display();
        }
     EmployeeD ed=new EmployeeD();
     //ed.display();
    }
}
class EmployeeD
{
    int empNo;
    double salary;
    double totalSalary=0;
    EmployeeD(){};
    EmployeeD(int empNo1, double salary)
    {
        empNo=empNo1;
        this.salary=salary;
        totalSalary+=salary;        
    }
    int allEmp()
    {
        for(int i=0;i<3;i++)
        {
            empNo+=1;
        }
        return empNo;
    }
    void display()
    {
        System.out.println("total emp="+3+"total salary="+totalSalary+" salr="+salary+" empno "+empNo);
    }
}
