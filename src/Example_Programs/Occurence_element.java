package Example_Programs;

import java.util.Scanner;

public class Occurence_element {

	public static void main(String[] args) {
		 int n,count=0,flag= 0;
		 Scanner s=new Scanner(System.in);
		 System.out.print("enter the number:");
		 n=s.nextInt();
		 int arr[]=new int[n];
		 System.out.print("enter the elements:");
	     for(int i=0;i<n;i++)  
       	 arr[i]=s.nextInt();
       	//dublicate=arr[0];
	    // }
	     //System.out.print("enter the elements to check:");
	     //int elements=s.nextInt();
       	for(int i=0;i<n-1;i++) {
	    for(int j=1;j<n;j++) {
	    	    if(arr[i]==arr[j]) {                                                   //if(arr[i]==elements)	
	    	    System.out.print("Duplicate="+arr[i]);
	    	    flag=1;//count++;
	     }
	}
       	}

             if(flag==0)
            	 System.out.println("No Duplicates");
             s.close();
             }
             }
