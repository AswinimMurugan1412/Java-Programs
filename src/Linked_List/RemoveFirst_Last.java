package Linked_List;

import java.util.Iterator;
import java.util.LinkedList;

public class RemoveFirst_Last {

	public static void main(String[] args) {
		LinkedList<String> list =new LinkedList<String>();
		list.add("Steve");
		list.add("Carl");
		list.add("raj");
		list.add("Ash");
		list.removeFirst();
		list.removeLast();
		list.remove(1);
		//list.add(2,"Glenn");
		Iterator<String> iter=list.iterator();
        while(iter.hasNext()){
        	System.out.println(iter.next());
        }
	}
}