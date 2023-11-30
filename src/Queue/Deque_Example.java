package Queue;
import java.util.Deque;
import java.util.ArrayDeque;

public class Deque_Example {

	public static void main(String[] args) {
		Deque<Integer>numbers=new ArrayDeque<>();
		numbers.offer(1);
		numbers.offerLast(2);
		numbers.offerFirst(3);
		System.out.println("Deque:"+numbers);
        int firstElement=numbers.peekFirst();
        System.out.println("First Element:"+firstElement);
        int lastElement=numbers.peekLast();
        System.out.println("Last Element:"+lastElement);
        int removedNumber1=numbers.pollFirst();
        System.out.println("Removed First Element:"+removedNumber1);
        int removedNumber2=numbers.pollLast();
        System.out.println("Removed last Element:"+removedNumber2);
        System.out.println("Updated Deque:"+numbers);
	}

}
