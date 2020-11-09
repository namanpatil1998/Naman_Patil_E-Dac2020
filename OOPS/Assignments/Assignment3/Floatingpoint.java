/*
.Write a function which accepts an floating point
number and counts the number of decimal
places in the number without using a string. 
 */
package OOPS.Assignments.Assignment3;

// this program is not right approach to find the no of 
//digits after decimal place
public class Floatingpoint {
    public static void main(String[] args)
    {
        double no=24.16542;
        int count =0;
while(no!=((int)no))
{
    count++;
    no=no*10;
}
System.out.printf("%d",count);
System.out.println("no= "+no);
    }
}
