package Array_Programs;

import java.util.Scanner;

public class Assending_Array {

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
             for(int i=0;i<n;i++)
            	 System.out.print(arr[i]+" ");
	}

}
