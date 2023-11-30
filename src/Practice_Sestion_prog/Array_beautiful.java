package Practice_Sestion_prog;

import java.util.Scanner;

public class Array_beautiful {

	public static void main(String[] args) {
		int sum=0;
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		 s.useDelimiter("[\\s]+");
		 int arr[]=new int[n];
	       // System.out.print("Enter the  array element: ");
	        for(int i=0;i<=n;i++) {
	        	 arr[i]=s.nextInt();
	        }
	        for(int i=0;i<=n;i++)
	        	sum=sum+i;
	        if(sum%2==0 && sum%3==0&& sum%5==0)
	        System.out.println("1");
	        

	}

}
