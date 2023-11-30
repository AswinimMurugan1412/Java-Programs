package Array_Programs;

import java.util.Scanner;

public class Second_LargestSmallest_Number {

	public static void main(String[] args) {
		 int n,temp;
		 Scanner s=new Scanner(System.in);
		 System.out.print("enter the number:");
		 n=s.nextInt();
		 int arr[]=new int[n];
		 System.out.println("enter the elements:");
	     for(int i=0;i<n;i++)  
       	 arr[i]=s.nextInt();
	     for(int i=0;i<n;i++) {
	    	 for(int j=i+1;j<n;j++) {
	    		 if(arr[i]>arr[j]) {
	    			 temp=arr[i];
	    			 arr[i]=arr[j];
	    			 arr[j]=temp;
	    		 }
	    	 }
	     }
             System.out.println("After sorting array elements are: ");
             System.out.println("Descending order: ");
             for(int i=n-1;i>=0;i--)
            	 System.out.print(arr[i]+" ");
            	 System.out.println("second smallest number:"+arr[1]);
             System.out.println("second largest number:"+arr[n-2]);
             
             
             

	}
}


