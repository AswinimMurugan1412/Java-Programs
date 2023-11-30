package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;	
public class Add_RemoveElement2 {

	public static void main(String[] args) {
		List<String> alist =new ArrayList<String>();
		alist.add("Steve");
		alist.add("Tim");
		alist.add("Lucy");
		alist.add("Pat");
		alist.add("Angela");
		alist.add(2,"Tom");
		System.out.println(alist);
		System.out.println("Number of elements in ArrayList: "+alist.size());
		//list.remove(3);
		alist.remove("Steve");
		alist.remove("Angela");
		//Collections.sort(list);
		//list.forEach(System.out.println);
        //for (String str:list)
		System.out.println(alist);
		alist.remove(3);
		System.out.println(alist);
		for (String str:alist)
			System.out.println(str +" ");
		System.out.println("Number of elements in ArrayList: "+alist.size());
	}
	}
