
package DS.queue;

/**
 *
 * @author naman
 */
import java.util.*;
public class Queue1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Queue = ");
        //int size=sc.nextInt();
        Queue12 q12=new Queue12(5);
        for(int i=0;i<3;i++)
        {
            q12.enqueue(i);
        }
       // System.out.println("Queue is empty = "+q12.isEmpty());
        for(int i=0;i<5;i++)
        {
            if(i<4)
            {
                q12.dequeue();
            }
            else
            {
                q12.enqueue(i);
            }
        }
        //System.out.println("Queue is full = "+q12.isFull());
       q12.traverse();
    }
}
class Queue12
{
    Queue1 q1=new Queue1();
    int rear,front,size;
    int[] arr;
    Queue12(int size)
    {
        rear=front=-1;
        this.size=size;
        arr=new int[size];
    }
    boolean isEmpty()
    {
        return (front==rear);
    }
    boolean isFull()
    {
        return ((front == 0 && rear == size-1)||(rear == (front -1)%(size-1)));
    }
    boolean enqueue(int item)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return false;
        }
        else
        {
            if((rear == size-1)&&(front!= 0))
            {
                rear=-1;
            }
            rear++;
            arr[rear]=item;
            System.out.println("Item enqueued to Queue = "+item);
            return true;
        }
    }
    boolean dequeue()
    {
        if(front==rear)
        {
            System.out.println("Queue is empty");
            return false;
        }
        else
        {
            int item=arr[++front];
            System.out.println("Item Dequeued from Queue = "+item);
            return true;
        }
    }
    void traverse()
    {
         for(int x : arr)
        {
            System.out.println("Queue " + x);
        }
    }
}
