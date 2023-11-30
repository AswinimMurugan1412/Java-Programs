package Example_Programs;

import java.util.Scanner;

public class Perfect_Square {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.useDelimiter("[\\s]+");
		int n= s.nextInt();
		int m= s.nextInt();
		if(n==m)
			System.out.println("Yes");
		else
			System.out.println("No");
		 

	}

}
