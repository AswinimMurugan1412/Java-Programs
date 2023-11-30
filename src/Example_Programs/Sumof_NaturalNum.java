package Example_Programs;

import java.util.Scanner;

public class Sumof_NaturalNum {

	public static void main(String[] args) {
		int n,sum=0,i;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number: ");
        n=s.nextInt();
        for (i=1;i<=n;i++){
        
        	sum=sum+i;
        	
        }
        System.out.print(sum);

	}

}
