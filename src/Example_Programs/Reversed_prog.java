package Example_Programs;

import java.util.Scanner;

public class Reversed_prog {

	public static void main(String[] args) {
		int n,r;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number: ");
        n=s.nextInt();
        while(n>0) {
        	r=n%10;
        	System.out.println(r);
        	n=n/10;
        }

	}

}
