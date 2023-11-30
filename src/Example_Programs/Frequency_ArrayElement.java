package Example_Programs;

import java.sql.Array;
import java.util.Scanner;

public class Frequency_ArrayElement {

	public static void main(String[] args) {
		 int n,temp,count=0,visit;
		 Scanner s=new Scanner(System.in);
		 System.out.print("enter the number:");
		 n=s.nextInt();
		 int arr[]=new int[n];
		 int fr[]=new int[n];
		 System.out.println("enter the elements:");
	     for(int i=0;i<n;i++) {
       	 arr[i]=s.nextInt();
	     count=1;
           for(int j=i+1;j<n;j++)
        	   if (arr[i]==arr[j]) {
        		   count++;
        		   fr[i]=visit;
         
           if (fr[i]!=visit) 
        	   fr[i]=count;
           System.out.println("Element    |   Frequency");
	     for(i=0;i<n;j++) 
	    	 if(fr[i]!=visit)
	    		 
	    	 }
        	   }
	     
           }
	}

