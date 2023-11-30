package Example2;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;
import java.util.ArrayDeque;

public class Deque_exp {
	public static void main(String[] args) {
		Deque<String>numbers=new ArrayDeque<>();
		numbers.offer("One");
		numbers.offer("Two");
		numbers.offer("Three");
		numbers.offer("Four");
		numbers.offer("Five");
		System.out.println("Elements in Deque"+numbers);
		numbers.offerFirst("Red");
		numbers.offerLast("Blue");
		System.out.println("Elements:"+numbers);
		System.out.println("Peek Element:"+numbers.peek());
		numbers.remove("Red");
		numbers.remove("Blue");
		System.out.println("Elements:"+numbers);
		numbers.remove("Three");
		System.out.println("Elements:"+numbers);
		
		System.out.println("Element in reverse: ");
		Iterator<String> desIterate=numbers.descendingIterator();
		while(desIterate.hasNext()) {
			System.out.print(desIterate.next());
			System.out.print(",");
	}
		

	}

}