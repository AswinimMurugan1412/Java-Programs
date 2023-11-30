package Example2;

import java.util.Scanner;

public class PairOfKvalue {

	public static void main(String[] args) {
		int temp=0,count=0;
		Scanner s=new Scanner(System.in);
		 System.out.print("enter the number:");
		 int n=s.nextInt();
		 int arr[]=new int[n];
		 System.out.println("enter all the  elements:");
	     for(int i=0;i<n;i++)  
      	 arr[i]=s.nextInt();
	     System.out.println("enter all the K elements:");
	     int k=s.nextInt();
	     for(int i=0;i<=1;i++) { 
	    	 for (int j=i;j<k;j++) { 
	    	temp = arr[0];
			if(temp<=arr[i] || temp>=arr[i]);
			count++;
	  
            if (count==4)
            	System.out.println(j);
	  
	     }
	}
	}
	}

