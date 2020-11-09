
package OOPS.Assignments.Assignment4;

/**
 *
 * @author naman
 */
import java.util.*;

public class StudentProg {
public static void main(String[] args)
{
    Student std1=new Student();
    std1.setData();
    std1.showData();
}
}
class Student 
{
    Student s;
    int rollNo;
    String studentName;
    Scanner sc=new Scanner(System.in);
   void setData()
    {
         rollNo=sc.nextInt();
          sc.nextLine(); 
          studentName=sc.nextLine(); 
    }
    void showData()
    {
        System.out.println("Student rollNO:- "+rollNo+"\nStudent name:- "+studentName);
    }
}
