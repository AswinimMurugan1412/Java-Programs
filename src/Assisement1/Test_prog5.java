package Assisement1;

import java.util.Scanner;

public class Test_prog5 {

	public static void main(String[] args) {
		int n,ascii;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number: ");
        n=s.nextInt();
        for(int i=1;i<=n;i++) {
        for(int space=n;space<=i+3;space++) {
            	System.out.print(" ");
        }
            	ascii=97;
        
        	for(int j=n;j>=i;j--) {
        		System.out.printf("%c ",ascii );
        		ascii++;
        	}
        	System.out.println();
        	
        }

	}

}

