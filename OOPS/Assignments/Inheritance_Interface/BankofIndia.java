/*

 */
package OOPS.Assignments.Inheritance_Interface;

/**
 *
 * @author naman
 */
import java.util.*;
public class BankofIndia {
    public static void main(String[] args)
    {
        Customer customer=new Customer();
        Scanner sc=new Scanner(System.in);
        customer.display();
        System.out.println("\n\tEnter Your Name:- ");
        String name=sc.nextLine();
        System.out.println("\n\tEnter Your Account No.:- ");
        int accNo=sc.nextInt();
        System.out.println("\n\tEnter Your IFSC code:- ");
        int ifsc=sc.nextInt();
        customer.customerDetails(name,accNo,ifsc);
        
    }
}

class Bank1
{
    void display()
    {
        System.out.println("\t\t\tBank Of India Welcomes You");
    }
}
class Customer extends Bank1
{   
    int customerDetails(String name,int accNo,int ifsc)
    {
        int acNo,ifsccode;
        String custname;
        acNo=accNo;
        ifsccode=ifsc;
        custname=name;
        System.out.println("\n\tName :- "+custname+"\n\tAccount No. :- "+acNo+"\n\tIFSC No. :- "+ifsccode);
        return 1;
    }

}
