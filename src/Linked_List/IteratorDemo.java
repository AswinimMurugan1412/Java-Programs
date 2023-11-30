package Linked_List;
import java.util.*;

public class IteratorDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList al=new ArrayList();
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
        System.out.print("Original content of al: ");
        @SuppressWarnings("rawtypes")
		Iterator itr=al.iterator();
        while(itr.hasNext()) {
        	Object element=itr.next();
        	System.out.print(element +" ");
        }
        System.out.println();
        @SuppressWarnings("rawtypes")
		ListIterator litr=al.listIterator();
        while (litr.hasNext()) {
        	Object element=litr.next();
        	System.out.print(element +" ");
        }
        System.out.print("Modified content of al: ");   
        itr=al.iterator();
        while (itr.hasNext()) {
        	Object element=itr.next();
        	System.out.print(element +" ");
        }
        System.out.println();
        
        System.out.print("Modified list Bcakwards: ");
        while (litr.hasPrevious()) {
        	Object element=litr.previous();
        	System.out.print(element +" ");
        }
        System.out.println();
        
	}

}