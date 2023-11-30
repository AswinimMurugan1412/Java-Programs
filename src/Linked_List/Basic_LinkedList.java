package Linked_List;

import java.util.*;
public class Basic_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> list =new LinkedList<String>();
		list.add("Steve");
		list.add("Carl");
		list.add("raj");
		list.addFirst("Negan");
		list.addLast("Rick");
		list.add(2,"Glenn");
		Iterator<String> iter=list.iterator();
        while(iter.hasNext()){
        	System.out.println(iter.next());
        }
	}

}
