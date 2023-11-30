package Queue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperation {

	public static void main(String[] args) {
		Integer [] a= {1,2,3,4,5};
		Integer [] b= {5,3,6,7,9};
		Set<Integer>set1=new HashSet<Integer>();
		set1.addAll(Arrays.asList(a));
		Set<Integer>set2=new HashSet<Integer>();
		set2.addAll(Arrays.asList(b));
		
		Set<Integer> union=new HashSet<Integer>(set1);
		union.addAll(set2);
		System.out.print("The union of the set is: ");
		System.out.println(union);
		
		Set<Integer> intersect=new HashSet<Integer>(set1);
		intersect.retainAll(set2);
		System.out.print("The intersection of set is:");
		System.out.println(intersect);

		Set<Integer> difference=new HashSet<Integer>(set1);
		difference.removeAll(set2);
		System.out.print("The difference of set is:");
		System.out.println(difference);
		
	}

}
