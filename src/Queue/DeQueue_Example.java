package Queue;
import java.util.*;

public class DeQueue_Example {

	public static void main(String[] args) {
		Deque <String> dq=new ArrayDeque<String>();
		dq.add("Gelenn");
		dq.add("Negan");
		dq.addLast("Maggie");
		dq.addFirst("Rick");
		dq.add("Daeyl");
		System.out.println("Element in Deque:"+dq);
		System.out.println("Removed Element in Deque:"+dq.removeLast());
		System.out.println("Head:"+dq.element());
		System.out.println("Poll:"+dq.pollLast());
		System.out.println("Peek:"+dq.peek());
		System.out.println("Element in Deque:"+dq);
	}

}
