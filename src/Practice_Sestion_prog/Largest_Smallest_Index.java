package Practice_Sestion_prog;

import java.util.Scanner;

public class Largest_Smallest_Index {

	public static void main(String[] args) {
		int min_idx=0,max_idx=0;
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		 s.useDelimiter("[\\s]+");
		 int arr[]=new int[n];
	       // System.out.print("Enter the  array element: ");
	        for(int i=0;i<=n;i++) {
	        	 arr[i]=s.nextInt();
	        }
	        for(int i=1;i<n;i++) {
	            	if(arr[i]<arr[min_idx]) 
	            		min_idx=i;
	            	else if(arr[i]>arr[max_idx])
	            		max_idx=i;
	        }
	            	 System.out.println(min_idx+1);
	            	 System.out.println(max_idx+1);
	}
}
