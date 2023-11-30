package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Basic_collection {

	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		list.add("HCL");
		list.add("DELL");
		Collections.sort(list);
		//list.forEach(System.out.println);
        for (String str:list)
        	System.out.println(str);
	}

}
