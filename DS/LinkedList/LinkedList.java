/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package DS.LinkedList;
/**
 *
 * @author naman
 */
public class LinkedList {
    Node head;
    //created static class for accessing in main()
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    //add element at beginning of list
    void push(int new_data)
    {
        Node new_node=new Node(new_data);//new node created
        new_node.next=head;//adress of previous head node at head is assigned to next of new node
        head=new_node;//adress of new node to head
    }
    //insert after element 
    void insertAfter(Node prev_node,int val)
    {
        if(prev_node==null)
        {
            System.out.println("invalid");
        }
        Node new_node=new Node(val);//new node created
        new_node.next=prev_node.next;//adress at next of prev node to next of new node
        prev_node.next=new_node;//adress of new node to next of new node
    }
    void insertLast(int val)
    {
        Node last_node=new Node(val);//new node created
        //if list is empty
        if(head==null)
        {
            head=new Node(val);
            return;
        }
        //next of last node made null
        last_node.next=null;
        Node last=head;//adress at head is given to new refernce created as last
        int count=0;//for counting while loop rotation
        while(last.next!=null)//for traversing utill next of last is null
        {
            last=last.next;//assigning adress at next of last is assigned to last  
            count++;
            System.out.println("count is "+count);
        }
        last.next=last_node;//assigning adress of last_node to next of last 
    }
  void deleteNode(int key) 
    { 
        // Store head node 
        Node temp = head, prev = null; 
  
        if (temp != null && temp.data == key) //compare adress and data at temp (Head)
        { 
            head = temp.next; // Changed head adress
            return; 
        } 
        //when data is not at head
        while (temp != null && temp.data != key) 
        { 
            prev = temp; 
            temp = temp.next; 
        }     
  
        // If key was not present in linked list 
        if (temp == null) return; 
  
        // Unlink the node from linked list 
        prev.next = temp.next; 
    } 
    
    void printList()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
    }
    public static void main(String[] args)
    {
        LinkedList ll=new LinkedList();
        //normal linked list
        Node first=new Node(1);//node created
        Node second=new Node(2);
        Node third=new Node(3);
        
        ll.head=first;//ref of first node assigned to head
        first.next=second;//ref of second assigned to next of first node
        second.next=third;
        
        //insert at beginning
        ll.push(8);
        
        //insert at mid
        ll.insertAfter(second,33);
        
        //insert last
        ll.insertLast(234);
        
         System.out.println("Print List");
        //printing list
        ll.printList();
        
        //remove
        ll.deleteNode(2); 
         System.out.println("Print List after removal");
        
        //printing list after removal
        ll.printList();
    }
}
