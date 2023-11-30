package Example_Programs;

import java.util.Scanner;

public class Pattern_LeftTri {

	public static void main(String[] args) {
		int n,space;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number: ");
        n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
        	for(int j=n;j>=i;j--) {
        		System.out.print("*");
        	}
        	System.out.println();
        }

	}

}
