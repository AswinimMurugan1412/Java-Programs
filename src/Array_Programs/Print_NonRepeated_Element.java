package Array_Programs;

import java.util.Scanner;

public class Print_NonRepeated_Element {

	public static void main(String[] args) {
		int count=0,flag=0;
		 Scanner s=new Scanner(System.in);
		 System.out.print("enter the number:");
		 int n=s.nextInt();
		 int arr[]=new int[n];
		 System.out.println("enter the array elements:");
	     for(int i=0;i<n;i++)  
       	 arr[i]=s.nextInt();
	     System.out.print("The elements non Repetated are: ");
	        for(int i=0;i<n;i++) {
	         count=0;
	        	for(int j=0;j<n;j++) {
	        		if(arr[i]==arr[j]&& i!=j)
	        			count++;
	        	}
	        	if(count==0) {
	        		System.out.print(arr[i]+" ");
	        	    flag=1;
	        	}
	        }
	        if(flag==0)
	        	System.out.println("All elements are repeated");
	       s.close();

	}

}
