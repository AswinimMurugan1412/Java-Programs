package Basic_programs;

import java.util.Scanner;

public class Array_Declaration_UsingMethod {
	void printarry(int n,int arr[]) {
		 System.out.println("Array elements :")	;
		 for (int i=0;i<n;i++)
			 System.out.println(arr[i]);
	}
	public static void main(String[] args) {
		Array_Declaration_UsingMethod obj=new Array_Declaration_UsingMethod();
		
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("enter the number of elements:");   
        n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the number of elements one by one: ");
        for(int i=0;i<n;i++)
        	arr[i]=s.nextInt();
        	obj.printarry(n,arr);
}
}


