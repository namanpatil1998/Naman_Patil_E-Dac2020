/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
traverse,bracket,reverse string,
 */
package DS.stack;
/**
 *
 * @author naman
 */
import java.util.*;

public class PushPopInt {
    public static void main(String[] args)
    {
        Stack1 s1=new Stack1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements pushed to stack ");
        int no=sc.nextInt();
        for(int i=1;i<=no;i++)
        {
            s1.push(i);
        }
        System.out.println("\n"+s1.peek()+" peek\n"+s1.isEmpty()+"is Empty");
        for(int i=0;i<no;i++)
        {
            System.out.println("\n"+s1.pop() + " Popped from stack");
            System.out.println("\ntop after pop "+s1.top);
        }
    }
}
class Stack1
{
    static final int MAX = 1000;
    int top;
    int a[]=new int[MAX];
    
     Stack1()
    {
        top = -1;
    }
    boolean isEmpty()
    {
        return (top < 0);
    }
    boolean push(int x)
    {
        if(top >= (MAX -1))
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            a[++top]=x;
            System.out.println(x+" Pushed into stack");
            return true;
        }
    }
    int pop()
    {
        if(top <0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int x=a[top--];
            return x;
        }
    }
        int peek()
        {
            if(top <0)
            {
                System.out.println("Stack Underflow");
                return 0;
            }
            else
            {
                int x=a[top];
                return x;
            }
        }
    }


