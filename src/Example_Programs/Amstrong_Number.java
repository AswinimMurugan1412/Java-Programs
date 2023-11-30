package Example_Programs;

import java.util.Scanner;

public class Amstrong_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number:");   //153,370,371,407,1634,1,2,3
        int n=s.nextInt();
        int temp=n,sum=0,r;
        String str1=String.valueOf(n);
        int len=str1.length();
        
        while(n>0) {
        	r=n%10;
        	sum=(int)(sum+Math.pow(r, len));                                                                  // sum=sum+(r*r*r);
        	n=n/10;
        }
        if(temp==sum) 
        	System.out.println("It is an amstrong Number");
        	else {
        		System.out.println("not an amstrong number");
        		
        	}
        	
        }

	}


