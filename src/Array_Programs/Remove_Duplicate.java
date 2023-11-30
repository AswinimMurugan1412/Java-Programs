package Array_Programs;
import java.util.Scanner;

public class Remove_Duplicate {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n,count,flag=0;
		System.out.print("Enter the size array: ");
        n=s.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the array elements: ");                                              //int temp[]=new int[n];//store unique elements
        for(int i=0;i<n;i++)                                                                           //System.out.println("Read Array Elemnts From user : ");
        	arr[i]=s.nextInt();
        	System.out.print("the elements are: ");
        	for(int i=0;i<n;i++) {
        		count=0;
        		for(int j=0;j<n;j++) {
        			if(arr[i]==arr[j] && i!=j)
        				count++;
        		}
        		if (count==0) {
        			System.out.println(arr[i]+" ");
        		flag=1;
        	}
	}
        	if(flag==0)
        		System.out.println("All the Elements are repeated");
        	s.close();
   
        
	}
}



