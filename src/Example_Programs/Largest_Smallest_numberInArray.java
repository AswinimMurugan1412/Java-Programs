package Example_Programs;

import java.util.Scanner;

public class Largest_Smallest_numberInArray {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("enter the number of elements:");   
        n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) 
       	 arr[i]=s.nextInt();
        int large=arr[0];int small=arr[0];
        for(int i=0;i<n;i++) {
        	if (arr[i]>large) 
        	large=arr[i];
        }
        	 System.out.println("Largest ="+large);

        for(int i=0;i<n;i++) {
	    if (arr[i]<small) 
	    small=arr[i];
}
	      System.out.println("Snmallest ="+small);
	      
	}
}

        