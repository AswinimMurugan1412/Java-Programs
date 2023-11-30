package Example_Programs;

import java.util.Scanner;

public class Swap_Array {

	public static void main(String[] args) {
		int count=0;
	Scanner s = new Scanner(System.in);
	int n= s.nextInt();
	 s.useDelimiter("[\\s]+");
	 int arr[]=new int[n];
        System.out.print("Enter the  array element: ");
        for(int i=0;i<n;i++) {
        	 arr[i]=s.nextInt();
        }
        if(n%2==0) {
        for(int i=0;i<n;i+=2) {
        		System.out.print(arr[i+1]+" "+arr[i]+" ");
        	}
         }
        	else {
        	for(int i=0;i<n-1;i+=2) {
        	System.out.print(arr[i+1]+" "+arr[i]+" ");
	}
        	System.out.print(arr[n-1]);
}
	}
}
