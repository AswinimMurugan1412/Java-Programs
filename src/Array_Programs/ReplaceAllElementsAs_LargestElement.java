package Array_Programs;

import java.util.Scanner;

public class ReplaceAllElementsAs_LargestElement {
	static void replaceElement(int arr[],int n) {
		int max,temp;
		max=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			temp=arr[i];
			if(temp>max)
				max=temp;
			}
		arr[n-1]=0;
	}
	static void printArray(int arr[],int n) {
		for(int i=0;i<n;i++)
			System.out.println(arr[i]+" ");
	}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 System.out.print("enter the number:");
		 int n=s.nextInt();
		 int arr[]=new int[n];
		 System.out.println("enter all the  elements:");
	     for(int i=0;i<n;i++)  
      	 arr[i]=s.nextInt();
	     replaceElement(arr,n);
	     printArray(arr,n);
	     s.close();
	}

}
