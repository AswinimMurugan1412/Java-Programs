package Queue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Iterete_Deque {

	public static void main(String[] args) {
		ArrayDeque<String> animals=new ArrayDeque<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		animals.add("Horse");
		animals.add("Hen");
		animals.add("Tiger");
		animals.add("Lion");
		System.out.println("ArrayDeque: ");
		Iterator<String>iterate=animals.iterator();
		while(iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(",");
		}
		System.out.println("\nArrayDeque in reverse order: ");
		Iterator<String> desIterate=animals.descendingIterator();
		while(desIterate.hasNext()) {
			System.out.print(desIterate.next());
			System.out.print(",");
	}

}
}