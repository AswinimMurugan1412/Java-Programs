package Array_Programs;

import java.util.Scanner;

public class Buble_Srot {
	static void BubbleSort(int n,int ar[]) {
		int temp;
		for(int step=0;step<n-1;step++) { 
			for(int i=0;i<n-step-1;i++) {
				if(ar[i]>ar[i+1]){
					temp=ar[i];
					ar[i]=ar[i+1];
					ar[i+1]=temp; 
				
				}
			}
		}
	}
	static void printArray(int n,int ar[]) {
        System.out.print("After Sorting: ");
        for(int i=0;i<n;i++) {
       	 System.out.print(ar[i]+" ");
        }
}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
    	System.out.print("Enter the number of array element: ");
        int n=s.nextInt();
        int ar[]=new int[n];
        System.out.print("Enter the  array element: ");
        for(int i=0;i<n;i++) {
        	 ar[i]=s.nextInt();	
	}
        BubbleSort(n,ar);
        printArray(n,ar);
        s.close();
	}

}

