package Example2;

import java.util.Iterator;
import java.util.Stack;

public class AddElement_InStack {
	static void reversePrint(Stack<Integer> s) {
		if(s.isEmpty())
			return;
		int x=s.peek();
		s.pop();
		System.out.print(x+" ");
		reversePrint(s);
		s.push(x);
	}


	public static void main(String[] args) {
		Stack<Integer> stk =new Stack<>(); 
		stk.push(24);
		stk.push(5);
		stk.push(11);
		stk.push(36);
		stk.push(65);
        System.out.println("Stack Element:"+stk);
        System.out.print("Removed Last Element ");
    	Integer x =(Integer)stk.pop();
    			System.out.println("Stack: "+stk);
    			Iterator<Integer>iterate=stk.iterator();
    			System.out.println("Stack Element in forward: ");
    			System.out.println(stk);
    				System.out.println("Stack Element in reverse: ");
    				reversePrint(stk);
    				System.out.println();
    			}
    			}
