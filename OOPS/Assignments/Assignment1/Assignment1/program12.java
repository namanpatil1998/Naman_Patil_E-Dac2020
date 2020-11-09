/*
In a company an employee is paid as under: If his basic salary is less than Rs. 
10000, then HRA = 10% of basic salary and DA = 90% of basic salary.
If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary.
If the employee's salary is input by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]
 */
package OOPS.Assignments.Assignment1.Assignment1;
import java.util.Scanner;
public class program12 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter Basic Salary = ");
        double basicSalary=sc.nextDouble();
        if(basicSalary<10000.00)
        {
            double hra=(basicSalary*(10.00/100.00));
            double da=(basicSalary*(90.00/100.00));
             System.out.println("Gross Salary of Employee = "+(basicSalary+hra+da));
        }
         if(basicSalary>=10000.00)
        {
            double hra=2000.00;
            double da=(basicSalary*(98.00/100.00));
            System.out.println("Gross Salary of Employee = "+(basicSalary+hra+da));
        }
    }
    
}
