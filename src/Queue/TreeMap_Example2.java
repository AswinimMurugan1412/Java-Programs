package Queue;
import java.util.*;

public class TreeMap_Example2 {

	public static void main(String[] args) {
		TreeMap<String,Integer> t=new TreeMap<String,Integer>();
		t.put("Roy",new Integer(90));
		t.put("Shelly",new Integer(80));
		t.put("Keats",new Integer(95));
		t.put("Charles",new Integer(38));
		Set s=t.entrySet();
		Iterator i=s.iterator();
		System.out.println("The following are the marks :");
		System.out.println("Names\t\tMarks");
		while(i.hasNext()) {
			Map.Entry e=(Map.Entry)i.next();
			System.out.println(e.getKey() +"\t\t" +e.getValue());
		}
		if(t.containsKey("roy"))
			System.out.println("Map Containd the entry 'roy'");
		else
			System.out.println("Map dosent Containd the entry 'roy'");
		t.put("Macbeth", new Integer (58));
		i=s.iterator();
		System.out.println("The tree map after modification is: ");
		System.out.println("Name\t\tMarks");
		while(i.hasNext()) {
			Map.Entry e=(Map.Entry)i.next();
			System.out.println(e.getKey() +"\t\t"+e.getValue());
		}
		

	}

}
