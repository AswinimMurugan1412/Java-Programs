package OOPS;

import java.util.Scanner;

public class Recursion_Fibonacci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
        long n=s.nextLong();  //   9
        for(long i=1;i<=n;i++) {
        	System.out.print(fibonacci(i)+" ");
        }
        System.out.println();

	}
   public static long fibonacci(long n) {
	   if (n==1 || n==2) {
		   return 1;
	   }
	   return fibonacci(n-1)+fibonacci(n-2);
		   
		   
	   }
   }

