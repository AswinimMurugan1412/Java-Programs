package Queue;
import java.util.*;

public class Queue_Example {

	public static void main(String[] args) {
		Queue<String> q=new LinkedList<String>();
		q.add("Rick");
		q.add("Maggie");
		q.add("Glenn");
		q.add("Negan");
		q.add("Daryl");
        System.out.println("Element in Queue:"+ q);
        System.out.println("Removed element:"+ q.remove());
        System.out.println("Head:"+ q.element());
        System.out.println("poll():"+ q.poll());
        System.out.println("peek():"+ q.peek());
        System.out.println("Element in Queue:"+ q);
	}

}
