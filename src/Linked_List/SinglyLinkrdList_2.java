package Linked_List;

import Linked_List.SinglyLinkedList.Node;

public class SinglyLinkrdList_2 {
	class Node{
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
	
	 void addNodeBeginning(int data) {
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
	 public void deleteNodeFirst() {
			Node temp = head;
			if(head == null)
				 System.out.println("Linked list is empty");
			else {
				head=head.next;
			}
	 }
			public void deleteNodeLast() {
				Node temp = head;
				if(head == null)
					 System.out.println("Linked list is empty");	
			else {
				while(temp.next!=tail) {
					temp=temp.next;
				}
			}
			temp.next=null;
			tail=temp;
		}
	 public void display() {
    	 Node current =head;
    	 if(head==null) {
    		 System.out.println("Linked list is empty");
    	 }
    	 else {
    		 System.out.println("Singly Linked list elements are: ");
    		 while(current!=null) {
    			 System.out.println(current.data+" ");
    			 current=current.next;
    		 }
    	 }
     }
	

	
	public static void main(String[] args) {
		SinglyLinkrdList_2 sl=new SinglyLinkrdList_2();
		  sl.addNode(2);
		   sl.addNode(4);
		   sl.addNodeBeginning(6);
		   sl.addLast(10);
		   sl.addNode(12);
		   sl.display();
		   sl.deleteNodeFirst();
		   sl.deleteNodeLast();
		   sl.display();
		}
}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

