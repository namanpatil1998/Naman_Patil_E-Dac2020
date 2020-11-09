
package OOPS.Assignments.Inheritance_Interface;

/**
 *
 * @author naman
 */
import java.util.*;
public class ZpSchool {
    ZpSchool(){}
  
    public static void main(String[] args)
    {
         Teacher teach1=new Teacher();
         Student std=new Student();
         System.out.println("Zilha Parishad Shaala");
         teach1.enterDetails();
         std.enterDetails();
    }
}

interface School
{
    //String School="Zilha Parishad Shaala";
    void displayDetail();
    String enterDetails();
}
class Teacher implements School
{
    Teacher(){}
    String name;
    char Class;
    String Subject;
    Teacher(String name,char Class,String Subject)
    {
        this.name=name;
        this.Class=Class;
        this.Subject=Subject;
    }
    Scanner sc=new Scanner(System.in);
    Teacher teach[]=new Teacher[3];
    @Override
    public String enterDetails()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter Teacher Name :- ");
            String name=sc.nextLine();
            sc.nextLine();
            System.out.println("Enter Teacher Subject :- ");
            String subject=sc.next();
            System.out.println("Enter Teacher Class :- ");
            char Class=sc.next().charAt(0);
            //sc.nextLine();
            teach[i]=new Teacher(name,Class,subject);     
        }
        for(int i=0;i<3;i++)
        {
            teach[i].displayDetail();
        }
        return "true";
    }
    @Override
    public void displayDetail()
    {
       System.out.println("\nname"+name+"\nClass"+Class);
       System.out.println(Subject);
    }
    
}
class Student implements School
{
    String name;
    int id;
    String Class;
    Student(){}
    Student(String name, int id,String Class)
    {
       this.Class=Class;
       this.id=id;
       this.name=name;
    }
    Student std[]=new Student[5];
    @Override
    public String enterDetails()
    {
        Scanner sc=new Scanner(System.in);
         for(int i=0;i<3;i++)
        {
            System.out.println("Enter Student Name :- ");
            String name=sc.nextLine();
            sc.nextLine();
            System.out.println("Enter Student Class :- ");
            String Class=sc.next();
            System.out.println("Enter Student ID :- ");
            int id=sc.nextInt();
            //sc.nextLine();
            std[i]=new Student(name,id,Class);     
        }
        for(int i=0;i<3;i++)
        {
            std[i].displayDetail();
        }
        return "true";
    }
    @Override
    public void displayDetail()
    {
         System.out.println("\n"+name+"\n"+id+"\n"+std);
    }
    
}
