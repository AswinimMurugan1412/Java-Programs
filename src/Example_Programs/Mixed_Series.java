package Example_Programs;

import java.util.Scanner;

public class Mixed_Series { //even number and factorial

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number:");
        int n= s.nextInt();
        int fact,number=1;
        for(int i=0;i<n;i++) {
        	fact=1;
        	if(i%2==0)
        		System.out.print(i+" ");
        	else {
        		for(int j=1;j<=number;j++) {
        			fact=fact*j;
        		}
        		System.out.print(fact+" ");
        		number++;
        	}
        }
        s.close();
	}

}
