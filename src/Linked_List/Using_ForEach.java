package Linked_List;
import java.util.*;

public class Using_ForEach {

			public static void main(String[] args) {
				List<String> list =new ArrayList<String>();
				//convert array list into linked list
				LinkedList<String>llistobj=new LinkedList<String>();
				ArrayList<String>arraylist=new ArrayList<String>();
				arraylist.add("String1");
				arraylist.add("String2");
				llistobj.addAll(arraylist);
				System.out.println(llistobj);
				list.add("HCL");
				list.add("DELL");
				list.add("CTS");
				list.add("TCS");
				list.add("Tech mehindra");
				list.add(2,"Zoho");
				list.set(1,"Imarticus");
		       // list.forEach(System.out::println);
		        list.remove(2);
		        //list.addFirst("Negan");
		       // list.addLast("Ash");
		        System.out.println(list.indexOf("Imarticus"));
		        System.out.println(list.get(3));
		        System.out.println(list.size());
		        System.out.println(list.contains("Hello"));
		        //System.out.println(list.getFirst());
		        for (String str:list)
		        	System.out.println(str);
			list.clear();
			System.out.println();
	}

}
