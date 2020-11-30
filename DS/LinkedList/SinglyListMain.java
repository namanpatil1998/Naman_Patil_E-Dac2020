package DS.LinkedList;

 class SinglyList {
	static class Node {
		private int data;
		private Node next;
		
		public Node() {
			data = 0;
			next = null;
		}
		public Node(int val) {
			data = val;
			next = null;
		}
	}

	private Node head;
	
	public SinglyList() {
		head = null;
	}


	public void addFirst(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
	}
	void add mid(int val)
        {
            Node newNode=new Node(val);
            newNode
        }
	
	public void addLast(int val) {
		Node newNode = new Node(val);
	
		if(head == null)
			head = newNode; 
		else { 
			
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
			
			trav.next = newNode;
		}
	}
	

	public void display() {
		System.out.print("List: ");
		Node trav = head;
		while(trav != null) {
			System.out.print(trav.data + ", ");
			trav = trav.next;
		}
		System.out.println();
	}
}

public class SinglyListMain {
	public static void main(String[] args) {
		SinglyList l1 = new SinglyList();
		l1.addLast(11);
		l1.addLast(22);
		l1.addLast(33);
		l1.addFirst(44);
		l1.display();
	}
}