package Example_Programs;

import java.util.Scanner;

public class Excersise_prog {

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
	        int k=s.nextInt();
	        for(int i=arr[i]; i>k; i++) {
				if(arr[i]%k==0) {
					count++;
					System.out.println("Yes");
					break;
					//count++;
				}
	        }
	       if(count==0)
	        		System.out.print("0");
	        }
}
}



