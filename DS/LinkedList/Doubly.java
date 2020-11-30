/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package DS.LinkedList;

/**
 *
 * @author naman
 */

public class Doubly {
    public static void main(String[] args)
    {
        DoubleLinkList dll=new DoubleLinkList();
        dll.insertBeg(10);
        dll.insertBeg(5);
        dll.insertEnd(15);
        dll.insertEnd(9);
        dll.displayFwd();
        //dll.insertPos(23, 2);
       // dll.displayBwd();
        dll.deletePos(3);
        //dll.deleteBeg();
        //dll.deleteEnd();
        dll.displayFwd();
    }
}
class Node
{
    int data;
    Node prev,next;
    Node(int data)
    {
        this.data=data;
        this.next=this.prev=null;
    }
}
class DoubleLinkList
{
    private Node start;
    private int length;
    
    DoubleLinkList()
    {
        this.start=null;
        this.length=0;
    }
    public void insertBeg(int data)
    {
        Node newNode =new Node(data);//new node created
        if(start==null)//if start is empty
        {
            start = newNode;//point start pointer to new node
        }else{
            start.prev=newNode;//connecting bwd link of start to new node
            newNode.next=start;//connecting fwd link of new node to fwd link
            start=newNode;//assigning new node refernce to start
        }
        length++;   
    }
    public void insertEnd(int data)
    {
        Node newNode=new Node(data);
        if(start==null)//if start is empty
        {
            start=newNode;//point start pointer to new node
        }else
        {
            Node n=start;//created a temperory new node n
            while(n.next!=null)//while next of n is not null then
            {
                n=n.next;//assign adress of next of n to n 
            }
            n.next=newNode;//when next of n is null then assign new node to next of n
            newNode.prev=n;//assign n to prev of new node
        }
        length++;
    }
    public void insertPos(int data,int pos)
    {
        if(pos==1)//if position is 1 then
        {
            insertBeg(data);//insert data at begining
        }else if(pos>length)//if pos is greater than length
        {
            insertEnd(data);//insert data at end
        }else{//if position is in between we will reach the 
              //position by traversing
            int i=1;//start traversing from position 1
            Node n=start;//creating node n and assigning start to n for preserving start 
            while(n.next!=null)//while next of n is not null then
            {
                i++;//increment i
                if(i==pos)break;//break if i reaches position where we want to add
                n=n.next;//assign next of n to n
            }
            Node newNode=new Node(data);//created new node
            newNode.prev=n;//assigned n to prev of new node
            newNode.next=n.next;//assigned next of n to next of new node
            n.next.prev=newNode;//assigned new node adress to previous of next of n
            n.next=newNode;//assigned newnode adress to next of n
            length++;
        }
    }
    
    public void deleteBeg()
    {
        Node n=start;//to preserve adress of start
        if(start==null)//check for list is empty 
        {
            System.out.println("list empty");
        }else{
            start=n.next;//assign adress at next of n to start
            start.prev=null;//make previous of start null
        }
        length--;
    }
     public void deleteEnd()
     {
         if(start==null)//check for list is empty
         {
             System.out.println("list empty");
         }else{
             Node n=start;//preserving adress of start
         while(n.next.next!=null)//traverse the list
         {
             n=n.next;//assign the adress of next of n to n
         }
         n.next.prev=null;//break the backward link by nullifying prev of next of n
         n.next=null;//break the forward link by nullifying next of n
         length--;
         }
     }
    public void deletePos(int pos)
    {
        if(pos<0)//pos less than zero then no element for delete
        {
            System.out.println("No element present to delete");
            return;
        }
        if(pos==1)//pos is 1 then delete the first element
        {
            deleteBeg();
        }else if(pos>length)//if pos id greater than length then delete end
        {
            deleteEnd();
        }else{
        int i=1;
        Node p=start;
        while(p.next!=null)//traverse the list for reaching desired location
        {
            i++;
            if(i==pos)
                break;
             p=p.next;
        }
        p.next.next.prev=p;//assign adress of p to prev of next of next of p
        p.prev=p.next.next;//assign adress of next of next of p to prev
        length--;
        }
    }
    
    public void displayFwd()
    {
        Node n=start;//preserve start
        while(n.next!=null)//traverse till last and display
        {
            System.out.print(n.data+" ---> ");
            n=n.next;
        }
            System.out.print(n.data+" ---> ");
            System.out.println();
    }
    public void displayBwd()
    {
        Node n= start;//preserve start
        while(n.next!=null)//traverse till last and 
        {
            n=n.next;//assign next of n to n so that n contains adress of last
        }
        while(n.prev!=null)//traverse till first 
        {
            System.out.print(n.data+" <--- ");//print value at n
            n=n.prev;//assign prev of n to n untill first element
        }
        System.out.print(n.data+" ");//print value at n
        System.out.println();
    }
}
