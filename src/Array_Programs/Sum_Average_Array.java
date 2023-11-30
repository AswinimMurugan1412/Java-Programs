package Array_Programs;

import java.util.Scanner;

public class Sum_Average_Array {

	public static void main(String[] args) {
		int sum=0;
		double average=0,t=0;
		Scanner s = new Scanner (System.in);
    	System.out.print("Enter the number of array element: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the  array element: ");
        for(int i=0;i<n;i++) {
        	 arr[i]=s.nextInt();
        		sum=sum+arr[i];
        		 }
        		System.out.println("Sum:"+sum);	 
        		average =(double)sum / n;
                System.out.println("Average:"+average);
        		 
        	 }

	}


