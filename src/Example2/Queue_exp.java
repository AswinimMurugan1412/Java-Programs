package Example2;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_exp {

	public static void main(String[] args) {
		LinkedList<Integer>num=new LinkedList<>();
		num.offer(11);
		num.offer(5);
		num.offer(25);
		num.offer(34);
		num.offer(96);
		num.offer(112);
	    System.out.println("Queue:"+num);
	         int accessedNumber=num.peek();
	         System.out.println("Assesed Number:"+accessedNumber);
        int removedNumber=num.poll();
        System.out.println("Removed Element:"+removedNumber);
        System.out.println("Updated Queue:"+num);
        
        num.remove(34);
        System.out.println("Updated Queue:"+num);

	}

}
