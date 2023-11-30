package Assisement1;

import java.util.Scanner;

public class Test_Prog6 {

	public static void main(String[] args) {
		int n,temp = 0;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number: ");
        n=s.nextInt();
        for(int i=1;i<=n;i++) {
        	
        	for(int space=n;space>=i;space--) {
        	System.out.print(" ");
        }
        for(int j=1;j<=n;j++) { 
        	System.out.print("* ");
        	
        	}
           System.out.println();

	}

}
}
