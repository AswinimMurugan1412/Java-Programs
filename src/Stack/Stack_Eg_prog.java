package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Eg_prog {
	static void reversePrint(Stack<Integer>st) {
		if (st.isEmpty())
			return;
		int x=st.peek();
		st.pop();
		System.out.print(x+" ");
		reversePrint(st);
		st.push(x);
	}
	public static void main(String[] args) {
		char ch='y';
		Scanner s = new Scanner(System.in);
		Stack <Integer>st=new Stack<Integer>();
		do {
            System.out.println("Linked Stack Operations");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. size");

            int option=s.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter integer element to push: ");
                    st.push(s.nextInt());
                    break;
                case 2:
                	int x=st.pop();
                	 System.out.print("pop element:"+x);
                	 break;
                case 3:
                 	 System.out.print("peek element:"+st.peek());    	
                     break;
                case 4:
                	if(st.isEmpty())
                     	 System.out.print("Stack is empty");
                	else
                     	 System.out.print("Stack is not empty");
                     break;
                case 5:
                	System.out.print("Size"+ st.size());
                	break;
                	System.out.print("Stack =");
            
            }
		}
	}
	}
