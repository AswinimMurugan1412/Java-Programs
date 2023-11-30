package Example_Programs;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number: ");
        n=s.nextInt();
        if(n%2==0) {
        	System.out.print("Even number ");	
        }
        else
        	System.out.print("Odd number ");
	}

}
