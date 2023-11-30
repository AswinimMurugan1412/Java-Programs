package Stack_Queue_example_prog;

import java.util.NoSuchElementException;
import java.util.Scanner;

class Node{
	protected int data;
	protected Node link;
	public Node() {
		link=null;
		data=0;
	}
		public Node(int d,Node n) {
			data=d;
			link=n;
		}
		public void setLink(Node n) {
			link=n;
	}
		public void setdata(int d) {
			data=d;
		}
		public Node getLink() {
			return link;
		}
		public int getdata() {
			return data;
		}
}
class linkedQueue{
	protected Node front,rear;
	public int size;
	public linkedQueue() {
		front=null;
		rear=null;
		size=0;
	}
	public boolean isEmpty() {
		return front==null;
	}
	public int getSize() {
		return size;
	}
	public void insert(int data) {
		Node nptr=new Node(data,null);
		if(rear==null)
		{
			front=nptr;
			rear=nptr;
		}
		else {
			rear.setLink(nptr);
			rear=rear.getLink();
		}
		size++;
		}
	public int remove() {
		if(isEmpty()) throw new NoSuchElementException("Underflow Exception:");
		Node ptr=front;
		front=ptr.getLink();
		if(front==null)
			rear=null;
		size--;
		return ptr.getdata();
	}
	public int peek() {
		if(isEmpty())throw new NoSuchElementException("UnderFlow EXception:");
		return front.getdata();
	}
	public void display() {
		System.out.print("\nQueue=");
		if(size==0) {
			System.out.print("Empty\n");
			return;
		}
		Node ptr=front;
		while(ptr!=rear.getLink()) {
			System.out.print(ptr.getdata()+" ");
			ptr=ptr.getLink();
		}
		System.out.println();
	}
}

public class Queue_prog_exp {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);   
        /* Creating object of class linkedStack */   
	  linkedQueue lq = new linkedQueue();          
        /* Perform Stack Operations */  
        System.out.println("Linked Stack Test\n");  
        char ch;     
        do 
        {
            System.out.println("\nQueue Operations");
            System.out.println("1. insert");
            System.out.println("2. remove");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. size");            
            int choice = scan.nextInt();
            switch (choice) 
            {
            case 1 :
                System.out.println("Enter integer element to insert");
                lq.insert( scan.nextInt() ); 
                break;                         
            case 2 : 
                try
                {
                    System.out.println("Remove Element = "+ lq.remove());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 : 
                try
                {
                    System.out.println("Peek Element = "+ lq.peek());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;                         
            case 4 : 
                System.out.println("Empty status = "+ lq.isEmpty());
                break;                
            case 5 : 
                System.out.println("Size = "+ lq.getSize()); 
                break;                
            case 6 : 
                System.out.println("Stack = "); 
                lq.display();
                break;                        
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }           
            /* display stack */    
            lq.display();            
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);       
     } while (ch == 'Y'|| ch == 'y');
	}
}