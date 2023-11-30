package Data_Structure;

public class Bitwise_Swap {

	public static void main(String[] args) {
		int a=5;
		int b=7;
		System.out.print("Before Swaping,a= ");
		System.out.print(a);
		System.out.print(" ");
		System.out.print("b= ");
		System.out.println(b);
        a^=b;
        b^=a;
        a^=b;
        System.out.print("after Swaping,a= ");
        System.out.print(a);
		System.out.print(" ");
		System.out.print("b= ");
		System.out.print(b);
	}

}
