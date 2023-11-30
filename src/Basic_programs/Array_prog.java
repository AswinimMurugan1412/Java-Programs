package Basic_programs;

import java.util.Scanner;

public class Array_prog {

	public static void main(String[] args) {
		//int arr[]= {10,20,30,40,50}
		int n;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number of element: ");
        n=s.nextInt();
        //int arr[]=new int[n];  //memory space 
        String arr1[]=new String[n];
        System.out.println("Enter the array element: ");
        for (int i=0;i<n;i++) {                                     //for (int i=0;i<n;i++) {
        	arr1[i]=s.next();                                     //arr[i]=s.nextInt();
        	 }                                       //}
        System.out.println("Output: ");                                         //System.out.println("Output: ");
        for (int i=0;i<n;i++) {                                             //for (int i=0;i<n;i++) {
        	System.out.print(arr1[i] +"\n");                                        //System.out.print(arr[i] +"\n");   
}
}
}
