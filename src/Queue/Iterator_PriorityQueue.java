package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Iterator_PriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer>numbers=new PriorityQueue<>();
		numbers.add(4);
		numbers.add(2);
		numbers.add(1);
		 System.out.println("PriorityQueue using iterator");
		 Iterator<Integer>iterate=numbers.iterator();
		 while(iterate.hasNext()) {
			 System.out.print(iterate.next());
			 System.out.print(",");
		 }

	}

}
