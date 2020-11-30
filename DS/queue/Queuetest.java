/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package DS.queue;

//import java.util.*;
public class Queuetest {
    public static void main(String[] args)
    {
        Queue queue =new Queue(1000);
        queue.enqueue(15);
        queue.enqueue(25);
        queue.enqueue(35);
        queue.enqueue(45);
        queue.enqueue(85);
    
        System.out.println("Front item is "+ queue.front());
        System.out.println("Rear item is "+ queue.rear()); 
        System.out.println(queue.dequeue()+ " dequeued from queue\n");
    }
}
class Queue
{
    int front ,rear, size;
    int capacity;
    int arr[];
    
    public Queue(int capacity)
    {
        this.capacity=capacity;
        front=this.size=0;
        rear = capacity-1;
        arr=new int[this.capacity];
    }
    boolean isFull(Queue queue)
    {
        return (queue.size==queue.capacity);
    }
    boolean isEmpty(Queue queue)
    {
        return(queue.size==0);
    }
    void enqueue(int item)
    {
        if(isFull(this))
        {
            return;
        }
        this.rear=(this.rear+1)%(this.capacity);
        this.arr[this.rear]=item;
        this.size=this.size+1;
        System.out.println(item + " Enqueued to queue");
    }
    int dequeue()
    {
        if(isEmpty(this))
        {
            return Integer.MIN_VALUE;
        }
        int item = this.arr[this.front];
        this.front=(this.front+1)%this.capacity;
        this.size=this.size-1;
        return item;
    }
    int front()
    {
        if(isEmpty(this))
        {
            return Integer.MIN_VALUE;
        }
        return this.arr[this.front];
    }
    int rear()
    {
       if(isEmpty(this))
       {
           return Integer.MIN_VALUE;
       }
       return this.arr[this.rear];
    }
}
