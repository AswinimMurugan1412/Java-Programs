package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;	
public class Add_RemoveElements_UsingCollection {

	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		list.add("HCL");
		list.add("DELL");
		list.add("CTS");
		list.add("TCS");
		list.add("Tech mehindra");
		list.add(2,"Zoho");
		//list.remove(3);
		list.set(1,"Imarticus");
		//Collections.sort(list);
		//list.forEach(System.out.println);
        for (String str:list)
        	System.out.println(str);
	}
	}


