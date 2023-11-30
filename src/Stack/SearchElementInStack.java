package Stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class SearchElementInStack {

	public static void main(String[] args) {
		Stack<String>stk=new Stack<>();
		 System.out.println(stk.isEmpty());
		stk.push("Mac Book");
		stk.push("HP");
		stk.push("Dell");
		stk.push("Asus");
		System.out.println("Stack:"+stk);
	    int location=stk.search("HP");
	    System.out.println(stk.search("Test"));
		System.out.println("Location of HP:"+location);
		 System.out.println("Size of the Stack: "+stk.size());
		 Iterator iterator=stk.iterator();
		 while(iterator.hasNext())
		 {
		Object values=iterator.next();
		System.out.println(values);
		 }
		 System.out.println("\nFor Each");
		 stk.forEach(n-> System.out.println(n));
		 ListIterator<String>ListIterator=stk.listIterator(stk.size());
		 System.out.println("\nIteration over the stack from top to "+"bottom:");
		 while(ListIterator.hasPrevious())
		 {
			 String avg=ListIterator.previous();
			 System.out.println(avg);
		 }

	}

}
