package Linked_List;

public class SinglyLinkedList {
	 class Node {
		 int data;
		 Node next;
		 public Node(int data){
			 this.data=data;
			 this.next=null;
		 }
	 }
		 public Node head = null;
		 public Node tail = null;
		 void addNode (int data){
			 Node newNode = new Node(data);
			 if(head==null) {
				 head=newNode;
			     tail=newNode;
	 }
		     else {
		    	 tail.next=newNode;
		    	 tail=newNode;
		 }
   }
		
		 void addFirst(int data) {
			 Node newNode=new Node(data);
			 if(head==null) {
				 head=newNode;
			     tail=newNode;
		 }
			 else {
				 newNode.next=head;
				 head=newNode;
			 }
		 }
		 void addLast(int data) {
			 Node newNode=new Node(data);
			 Node current=head;
			 if(head==null) {
				 head=newNode;
			     tail=newNode;
		 }
			 else {
				 while(current.next!=null) {
	    			 current=current.next;
			 }
				 current.next=newNode;
		 }
		 }
		 void addBetween(int pos,int data) {
			 Node newNode=new Node(data);
			 Node current=head;
			 if(head==null) {
				 head=newNode;
			     tail=newNode;
			 }
			 else {
				 while(current.data!=pos) {
	    			 current=current.next;
			 }
				 newNode.next=current.next;
				 current.next=newNode;
		 }
		 }
			     
		 public void display() {
	    	 Node current =head;
	    	 if(head==null) {
	    		 System.out.println("Linked list is empty");
	    	 }
	    	 else {
	    		 System.out.println("Singly Linked list elements are: ");
	    		 while(current!=null) {
	    			 System.out.print(current.data+" ");
	    			 current=current.next;
	    		 }
	    	 }
	     }
		

	public static void main(String[] args) {
		   SinglyLinkedList sll = new SinglyLinkedList();
		   sll.addNode(10);
		   sll.addNode(5);
		   sll.addNode(20);
		   sll.addFirst(100);
		   sll.addLast(200);
		   sll.addNode(-300);
		   sll.addNode(500);
		   sll.addBetween(20,78);
		   sll.display();
		}

	}



