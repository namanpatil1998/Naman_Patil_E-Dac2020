/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package DS.stack;

/**
 *
 * @author naman
 */
public class Stackpractise {
    public static void main(String[] args)
    {
        Stack s=new Stack();
        s.isEmpty();
        for(int i=0;i<s.max;i++)
        {
            s.push(i);
        }
        s.pop();
        System.out.println(s.peek());
    }
}
class Stack
{
    int top,max=5;;
    int[] arr=new int[max];
    Stack()
    {
        this.top=-1;   
    }
    boolean isEmpty()
    {
        return (top==-1);
    }
    void push(int data)
    {
        if(top==max-1)
        {
            System.out.println("array is full");
        }
        else
        {
             arr[++top]=data;
              System.out.println(data);
             return;
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("array is empty");
        }
        else
        {
            int x=arr[top--];
            System.out.println(x);
        }
    }
    int peek()
    {
        if(top==-1)
        {
            System.out.println("array is empty");
        }
        int y=arr[top];
        return y;
    }
}
