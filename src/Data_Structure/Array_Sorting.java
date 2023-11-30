package Data_Structure;
import java.util.Scanner;

public class Array_Sorting {
	static void bubble(int n,int ar[]) {
	int t;
	for(int step=0;step<n-1;step++) {
		for(int i=0;i<n-1;i++) {
			if(ar[i]>ar[i+1]) {
				t=ar[i];
				ar[i]=ar[i+1];
				ar[i+1]=t;
			}
		}
	}
}
static void printArray(int n,int ar[]) {
             System.out.println("After Sorting: ");
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
        bubble(n,ar);
        printArray(n,ar);
        s.close();

}
}