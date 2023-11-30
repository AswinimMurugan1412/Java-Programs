package Example_Programs;

import java.util.Scanner;

public class PrimeNumber_toNvalue {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the min number:");
        int min= s.nextInt();
        System.out.print("enter the max number:");
        int max= s.nextInt();
        for(int n=min;n<=max;n++) {
        	int count=0;
        for(int i=2;i<=n/2;i++) {
        	if(n%i==0 ) {
         	count++;
        		break;
        	}
        }
        if (count==0 && n!=1) {
        	System.out.print(n+" ");
        	
        }

	}
}
}



