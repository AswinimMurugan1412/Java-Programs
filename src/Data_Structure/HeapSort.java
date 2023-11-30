package Data_Structure;
import java.util.*;
import java.util.Scanner;

public class HeapSort {
	static void heapsorting(int arr[],int n) {
		int max_dx,t;
        for(int step=n-1;step>0;step--) {
        	max_dx=step;
        	for(int i=step-1;i>=0;i--) {
        		if(arr[i]>arr[max_dx]) {
        		max_dx=i;
        	}
        }
        t=arr[step];
        arr[step]=arr[max_dx];
        arr[max_dx]=t;
	}
	}
	static void printArray(int arr[],int n) {
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of element: ");
        int n = s.nextInt();
        int arr[]=new int[n];
        int max_dx,t;
        System.out.print("Enter the array element: ");
	for(int i=0;i<n;i++)
		arr[i]=s.nextInt();
	heapsorting(arr,n);
		System.out.print("Sorten array:");
		printArray(arr,n);
		s.close();
	

}
}
