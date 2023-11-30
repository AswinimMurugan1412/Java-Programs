package Example_Programs;

import java.util.Scanner;

public class Neon_Number {

	public static void main(String[] args) {
		int n,sum=0,r,temp,sq;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number:");
        n= s.nextInt();
    	temp=n;
    	sq=n*n;
        while(sq!=0) {
        	r=sq%10;
        	sum=sum+r;
            sq=sq/10;
	}
       System.out.println("Sum=" +sum);
       System.out.println("n=" +n);
       s.close();
	if(n==sum) 
		System.out.println(temp + " is a neon number");
		else
			System.out.println(temp + " is not a neon number");

	}

}
