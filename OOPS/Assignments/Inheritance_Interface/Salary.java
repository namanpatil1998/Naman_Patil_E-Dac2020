/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package OOPS.Assignments.Inheritance_Interface;

/**
 *
 * @author naman
 */
public class Salary {
    public static void main(String[] args)
    {
        Payment pay=new Payment();
        pay.displayCompany();
        pay.displaySalary();
    }
}
interface Company
{
    void displaySalary();
}
class Employee1
{
    void displayCompany()
    {
        System.out.println("Morgan Stanely");
    }
}
class Payment extends Employee1 implements Company
{
    Company ant;
    Employee1 xmen;
    @Override
    public void displaySalary()
    {
        System.out.println("100000");
    }
}
