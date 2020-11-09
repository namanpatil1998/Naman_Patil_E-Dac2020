/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
123
22 12
-9
true
 */
package OOPS.Assignments.Assignment1.Assignment1;

 import java.lang.*;

public class program3 {
   
public static void main(String[] args)
{
  
    int x=10, z=20;
   int y = (int)(Math.pow(x,2)) + 3*x - 7;
    System.out.println(y);
    y = x++ + ++x;
    System.out.println(y+" "+x);
    z = x++ - --y - --x  +  x++;
            System.out.println(z);
            program3 Bool=new program3();
            Boolean Z=Bool.bool();
            
}
boolean bool(){
    boolean x=true, y=true, z;
           z = ((x && y) ||! (x || y));
            System.out.println(z);
            return z;
}
}
