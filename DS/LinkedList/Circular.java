/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package DS.LinkedList;

/**
 *
 * @author naman
 */
public class Circular {
public static void main(String[] args)
    {
        Dll d=new Dll();
        d.insertBeg(1);
        d.insertBeg(2);
        d.insertBeg(3);
        d.insertBeg(4);
        d.insertBeg(5);
        d.insertEnd(6);
        d.insertPos(23, 5);
       // d.deletePos(7);
        d.display();
        

    }
}
class Nodec
{
    Nodec prev,next;
    int data;
    Nodec(int data)
    {
        this.data=data;
        this.next=this.prev=null;
    }
}
class Dll
{
   Nodec start,end;
   int size;
   Dll()
   {
       this.start=null;
       this.end=null;
       this.size=0;
   }
  void insertBeg(int data)
  {
      Nodec n=new Nodec(data);
      if(start==null)
      {
          n.next=n;
          n.prev=n;
          start=n;
          end=start;
      }
      else
      {
          n.prev=end;
          end.next=n;
          start.prev=n;
          n.next=start;
          start=n;
      }
      size++;
  }
  void insertEnd(int data)
  {
      Nodec n=new Nodec(data);
      if(start==null)
      {
          n.next=n;
          n.prev=n;
          start=n;
          end=start;
      }
      else
      {
          n.prev=end;
          end.next=n;
          n.next=start;
          start.prev=n;
          end=n;
      }
      size++;
  }
  void insertPos(int data, int pos)
  {
      Nodec n=new Nodec(data);
      if(pos==1)
      {
          insertBeg(data);
          return;
      }
      else 
      {
          Nodec temp = start;
          int i=2;
          while(pos!=i)
          {
              i++;
              temp=temp.next;
          }
          n.prev=temp;
          n.next=temp.next;
          temp.next.prev=n;
          temp.next=n;
          size++;
      }
  }
  void deletePos(int pos)
  {
      if(pos==1)
      {
          if(size==1)
          {
              start=null;
              end=null;
              size=0;
              return;
          }
          start=start.next;
          start.prev=end;
          end.next=start;
          size--;
          return;
      }
      if(pos==size)
      {
          end=end.prev;
          end.next=start;
          start.prev=end;
          size--;
          return;
      }
        Nodec n= start.next;
        for (int i = 2; i <= size; i++)
        {
            if (i == pos)
            {
                Nodec p = n.prev;
                Nodec f = n.next;
 
                p.next=f;
                f.prev=p;
                size-- ;
                return;
            }
            n = n.next;
        }        
      
  }
  void display()
  {
      Nodec n=start;
      if(size==0)
      {
          System.out.print("Empty\n");
      }
      if(start.next==start)
      {
          System.out.print(start.data+"--->"+n.data+" ");
          return;
      }
      System.out.print(start.data+" ---> ");
      n=start.next;
      while(n.next!=start)
      {
          System.out.print(n.data+"--->");
          n=n.next;
      }
      System.out.print(n.data+"--->");
      n=n.next;
      System.out.print(n.data);
  }
} 
