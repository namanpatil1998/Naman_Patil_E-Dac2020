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
public class Accenture {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Manager m1=new Manager();
        m1.title();
        System.out.println("Select Employee\n1.Manager\n2.worker");
        int option=sc.nextInt();
        if(option==1)
        {
            System.out.println("\tDetails of Manager");
            System.out.println("Enter Salary :- ");
            int manSalary=sc.nextInt();
            System.out.println("Enter ID :- ");
            int manId=sc.nextInt();
            System.out.println("Enter Name :- ");
            sc.nextLine();
            String manName=sc.nextLine();
            Manager m=new Manager(manSalary,manId,manName);
            m.displayDetails();
        }else
        {
        System.out.println("\tDetails of Worker");
        Worker w=new Worker();
        w.displayDetails();
        }
    }
}
abstract class Employee
{
    Scanner sc=new Scanner(System.in);
    String title="\t\t\tDetails of Accenture Workforce";
    void title()
    {
    System.out.println(title);
    }
    abstract int displayDetails();
}
class Manager extends Employee
{
    int salary;
    int id;
    String name;
    Manager(){}
    Manager(int x,int y,String s)
    {
     salary=x;
     id=y;
     name=s;
    }
    @Override
    int displayDetails()
    {
        System.out.println("\nManager Name :- "+name+"\nManager ID :- "+id+"\nManger Salary :- "+salary);
       return 1; 
    }
}
class Worker extends Employee
{
    Employee x;
    int salary;
    int id;
    String name;
    Worker()
    {
     System.out.println("Enter Salary :- ");
     salary=sc.nextInt();
     System.out.println("Enter ID :- ");
     id=sc.nextInt();
     System.out.println("Enter Name :- ");
     name=sc.nextLine(); 
     sc.nextLine();
    }
    @Override
    int displayDetails()
    {
        System.out.println("\nWorker Name :- "+name+"\nWorker ID :- "+id+"\nWorker Salary :- "+salary);
        return 1;
    }
}