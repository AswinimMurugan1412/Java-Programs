package Array_Programs;

import java.util.Scanner;

public class Array_rotation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 System.out.print("enter the number:");
		 int n=s.nextInt();
		 int arr[]=new int[n];
		 System.out.println("enter all the  elements:");
	     for(int i=0;i<n;i++)  
     	 arr[i]=s.nextInt();
		int l=arr.length;
		for(int r=1;r<n;r++) {
		int x=arr[n-1];
        for(int i=n-2;i>=0;i--) {
        	arr[i+1]=arr[i];
        }
        arr[0]=x;
        System.out.print("rotated array:");
        for(int array:arr) {
        	System.out.print(array+" ");
        	s.close();
        	
        }
	}

}
}
	
	
	
	
	
	
	
	
	
	