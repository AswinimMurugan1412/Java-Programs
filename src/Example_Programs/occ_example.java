package Example_Programs;

import java.util.Scanner;

public class occ_example {

	public static void main(String[] args) {
		 int n,element1,flag=0,count=0;
		 Scanner s=new Scanner(System.in);
		 System.out.print("enter the number:");
		 n=s.nextInt();
		 int arr[]=new int[n];
		 System.out.print("enter the elements:");
	     for(int i=0;i<n;i++)  
       	 arr[i]=s.nextInt();
	     System.out.print("enter the elements of which you want to count"+"count of occurrence: "); 
	     element1=s.nextInt();
       	for(int i=0;i<n;i++) {
	    	    if(arr[i]==element1) {
	    	    	flag=1;
	    	    	count++;
	    	    }
       	}
       	if(flag==0) 
       	 System.out.print("elements not present: ");
       	 else
       		 System.out.print("number of occurrence of the elements:"+count);
   
	    	    	
	    	   
	     }
	}
             
