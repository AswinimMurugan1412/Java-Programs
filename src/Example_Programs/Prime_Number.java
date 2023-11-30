package Example_Programs;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number:");
        int n= s.nextInt();
        for(int i=2;i<=n/2;i++) {
        	if(n%i==0) {
        		System.out.println(n+ "It is not a prime number");
        		count++;
        		break;
        	}
        }
        if (count==0 && n!=1) {
        	System.out.println(n+ "It is a prime number");
        }

	}

}
