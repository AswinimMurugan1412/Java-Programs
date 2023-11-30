package Example_Programs;

import java.util.Scanner;

public class Pattern_invertPramid {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the number: ");
        n=s.nextInt();
        for(int i=1;i<=n;i++) {
        	for(int space=1;space<i;space++) {
            	System.out.print(" ");
        	}
        	for(int j=n;j>=i;j--) {
        	System.out.print("* ");
        	}
        System.out.println();

	}

}
}

