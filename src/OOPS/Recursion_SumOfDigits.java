package OOPS;

import java.util.Scanner;

public class Recursion_SumOfDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
        long n=s.nextLong();
        long sumOfAllNumbers= sumOfAllNumbers(n);
        System.out.println(sumOfAllNumbers);
	}
	public static long sumOfAllNumbers (long number) {
		if(number!=0)
		{
			return number+sumOfAllNumbers(number-1);
		}
		else {
			return number;
		}
		}

}
