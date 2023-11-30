package Array_Programs;

import java.util.Scanner;

public class Find_The_Element {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.print("enter the number:");
		 int n=s.nextInt();
		 int arr[]=new int[n];
		 System.out.println("enter all the  elements:");
	     for(int i=0;i<n;i++)  
       	 arr[i]=s.nextInt();
	     System.out.println("enter the  elements you want to find:");
	     int e=s.nextInt();
	     for(int i=0;i<n;i++)
	    	 if(arr[i]==e) 
	    		 System.out.print("Element found at position:"+i+1);
	    	 else
	    			 System.out.println("Element not found");
}
}

