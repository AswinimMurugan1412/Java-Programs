package Assisement1;

import java.util.Scanner;

public class Test_Prog7 {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number: ");
        n=s.nextInt();
       for(int i=1;i<=n;i++) {
    	   for(int space=n;space>i;space--) {
    	   System.out.print(" ");
       }
       for(int k=i+0;k>1;k--) {
       System.out.print(k);
       }
       for(int j=1;j<=i;j++) {
    	   System.out.print(j);
       }
           System.out.println();

	}
        s.close();

}
	}



