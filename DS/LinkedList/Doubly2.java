/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package DS.LinkedList;

/**
 *
 * @author naman
 */
public class Doubly2 {
    public static void main(String[] args)
    {
        DoublyLinkList2 dll2=new DoublyLinkList2();
        dll2.insertBeg(12);
        dll2.insertBeg(22);
        dll2.insertBeg(11);
        dll2.insertBeg(44);                             
        dll2.insertBeg(8);
        dll2.insertEnd(48);
        dll2.insertPos(111,2);
        dll2.displayFwd();
        dll2.deletePos(2);
        dll2.deleteBeg();
        dll2.deleteEnd();
        dll2.displayFwd();
        dll2.displayBwd();
    }
}
class Node2
{
    int data;
    Node2 prev,next;
    Node2(int data)
    {
        this.data=data;
        this.next=this.prev=null;
    }
}
class DoublyLinkList2
{
    private Node2 start;
    private int length;
   DoublyLinkList2()
   {
       this.start=null;
       this.length=0;
   }
   void insertBeg(int data)
   {
       Node2 n2=new Node2(data);
       if(start==null)
       {
           start=n2;
       }
       else
       {
           start.prev=n2;
           n2.next=start;
           start=n2;
       }
       length++;
   }
   void insertEnd(int data)
   {
       Node2 n2=new Node2(data);
       if(start==null)
       {
           start=n2;
       }
       else
       {
           Node2 n=start;
           while(n.next!=null)
           {
               n=n.next;
           }
           n.next=n2;
           n2.prev=n;
       }
       length++;
   }
   void insertPos(int data,int pos)
   {
       if(pos==1)
       {
           insertBeg(data);
       }
       else if(pos>length)
       {
           insertEnd(data);
       }
       else
       {
           int i=1;
           Node2 n=start;
           while(n.next!=null)
           {
               i++;
               if(i==pos)
               {
                   break;
               }
               n=n.next;
           }
           Node2 n2=new Node2(data);
           n2.prev=n;
           n2.next=n.next;
           n.next.prev=n2;
           n.next=n2; 
       }
       length++;
   }
   void deleteBeg()
   {
      Node2 n=start;
      if(start==null)
      {
          System.out.println("list empty");
      }
      else
      {
          start=n.next;
          start.prev=null;
          length--;
      }
   }
   void deleteEnd()
   {
       Node2 n=start;
       if(start==null)
       {
           System.out.println("List is Empty");
       }
       else
       {
           while(n.next.next!=null)
           {
               n=n.next;
           }
           n.next.prev=null;
           n.next=null; 
           length--;
       }
   }
   void deletePos(int pos)
   {
       Node2 n=start;
        if(start==null)
        {
            System.out.println("List is Empty"); 
        }
        else if(pos==1)
        {
            deleteBeg();
        }
        else
        {
            int i=1;
            while(n.next!=null)
            {
                i++;
                if(i==pos)
                {
                    break;
                }
                n=n.next;
            }
            n.next.next.prev=n;
            n.next=n.next.next;
        }
        length--;
   }
     public void displayFwd()
    {
        Node2 n=start;//preserve start
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
         Node2 n=start;
         while(n.next!=null)
         {
             n=n.next;
         }
         System.out.print(n.data+" <--- ");
         while(n.prev!=null)
         {
             n=n.prev;
             System.out.print(n.data+" <--- ");
         }
         System.out.println();
     }
}
