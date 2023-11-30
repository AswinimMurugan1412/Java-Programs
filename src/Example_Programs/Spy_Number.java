package Example_Programs;

import java.util.Scanner;

public class Spy_Number {

	public static void main(String[] args) {
		int n,sum=0,product=1,r,temp;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number:");
        n= s.nextInt();
    	temp=n;
        while(n>0) {
        	r=n%10;
        	sum=sum+r;
        	product=product*r;
        	n=n/10;

	}
        System.out.println("Sum=" +sum);
        System.out.println("Product=" +product);
        s.close();
	if(sum==product) 
		System.out.println(temp + " is a spy number");
		else
			System.out.println(temp + " is not a spy number");
			
	}
}
	
