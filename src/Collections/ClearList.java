package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;	

public class ClearList {

	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		list.add("HCL");
		list.add("DELL");
		list.add("CTS");
		list.add("TCS");
		list.add("Tech mehindra");
		list.add(2,"Zoho");
		list.set(1,"Imarticus");
        list.forEach(System.out::println);
        list.remove(2);
        System.out.println(list.indexOf("Imarticus"));
        System.out.println(list.get(3));
        System.out.println(list.size());
        System.out.println(list.contains("Hello"));
        for (String str:list)
        	System.out.println(str);
	list.clear();
	System.out.println();
	}

}
