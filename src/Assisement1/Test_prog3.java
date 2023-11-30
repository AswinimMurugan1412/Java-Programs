package Assisement1;

import java.util.Scanner;

public class Test_prog3 {

	public static void main(String[] args) {
		int n,temp = 0;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number: ");
        n=s.nextInt();
        for(int i=1;i<=n;i++) {
        	
        	for(int space=1;space<=i;space++) {
        	System.out.print(" ");
        }
        for(int j=1;j<=n;j++) {
        	if(i==1 ||i==n ||j==1 ||j==n) 
        	System.out.print("*");
        	else 
        		System.out.print(" ");
        	}
           System.out.println();
        
	}
}
}



	

