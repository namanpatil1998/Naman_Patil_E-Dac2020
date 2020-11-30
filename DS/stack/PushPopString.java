/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package DS.stack;

/**
 *
 * @author naman
 */
import java.util.*;

public class PushPopString {
    public static void main(String[] args)
    {
        Stack2 s1=new Stack2();
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++)
        {
            s1.push(s.charAt(i));
        }
        System.out.println("char at peek = "+s1.peek()+"\nis Empty = "+s1.isEmpty());
        for(int i=0;i<s.length();i++)
        {
            s1.pop();
        }
    }
}
class Stack2
{
    int top;
    static int max=1000;
    char[] arr1=new char[max];
    Stack2()
    {
        top=-1;
    }
    boolean isEmpty()
    {
        return top<0;
    }
    boolean isFull()
    {
        return top>=(max-1);
    }
    boolean push(char st)
    {
        if(top >= (max-1))
        {
            System.out.println("Stack OverFlow");
            return false;
        }
        else
        {
            arr1[++top]=st;
            System.out.println(st+" Pushed to stack"+"\n after push top moved to = "+top);
            return true;
        }
    }
    char pop()
    {
        if(top<0)
        {
            System.out.println("Stack UnderFlow");
            return ' ';
        }
        else
        {
            char st=arr1[top--];
             System.out.println(st+" Poped to stack"+"\n after Pop top moved to = "+top);
             return st;
        }         
    }
    char peek()
    {
        if(top<0)
        {
            System.out.println("Stack UnderFlow");
            return ' ';
        }
        else
        {
            char x=arr1[top];
            return x;
        }
        
    }
}
