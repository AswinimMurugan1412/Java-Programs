package Example2;

import java.util.Scanner;

public class Zeros_1s_prg {
	 public static void segregateZerosAndOnes(int[] arr) {
	        int left = 0; 
	        int right = arr.length - 1; 

	        while (left < right) {
	           
	            while (arr[left] == 0 && left < right) {
	                left++;
	            }
	            while (arr[right] == 1 && left < right) {
	                right--;
	            }
	            if (left < right) {
	                arr[left] = 0;
	                arr[right] = 1;
	                left++;
	                right--;
	            }
	        }
	    }

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.print("enter the number:");
		 int n=s.nextInt();
		 int arr[]=new int[n];
		 System.out.println("enter all the  elements:");
	     for(int i=0;i<n;i++)  
       	 arr[i]=s.nextInt();
        segregateZerosAndOnes(arr);
        
        System.out.println("After segregating :");
        for (int num : arr) {
            System.out.print(num + " ");

	}

}
}
