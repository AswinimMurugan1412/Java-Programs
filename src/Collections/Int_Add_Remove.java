package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;	
@SuppressWarnings("unused")
public class Int_Add_Remove {
	public static void main(String[] args) {
		List<String> n =new ArrayList<String>();
	    n.add("78");
		n.add("57");
		n.add("90");
		n.add("5");
		n.add("10");
		System.out.println(n);
		System.out.println("Number of elements in ArrayList: "+n.size());
		n.add(2,"8");
		n.remove("57");
		n.remove("90");
		n.remove(3);
		System.out.println(n);
		System.out.println("Number of elements in ArrayList: "+n.size());

	}

}
