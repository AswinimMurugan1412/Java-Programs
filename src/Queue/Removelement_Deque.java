package Queue;
import java.util.Deque;
import java.util.ArrayDeque;

public class Removelement_Deque {

	public static void main(String[] args) {
		ArrayDeque<String> animals=new ArrayDeque<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		animals.add("Horse");
		animals.add("Hen");
		animals.add("Tiger");
		animals.add("Lion");
		System.out.println("ArrayDeque:"+animals);
		String element=animals.remove();
		System.out.println("Removed element:"+element);
        animals.remove("Cow");
       // System.out.println("Removed specific element:"+specificelement);
        System.out.println("New ArrayDeque:"+animals);
        String firstElement=animals.removeFirst();
        System.out.println("Removed first element:"+firstElement);
        String lastElement=animals.removeLast();
        System.out.println("Removed last element:"+lastElement);
        
        System.out.println("New ArrayDeque:"+animals);
        animals.clear();
        System.out.println("New ArrayDeque:"+animals);
		

	}

}
