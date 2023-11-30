package Example_Programs;

import java.util.Scanner;

public class SumofTheDigits {

	public static void main(String[] args) {
		int n,r,sum=0;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number: ");
        n=s.nextInt();
        while(n>0) {
        	r=n%10;
        	sum=sum+r;
        	n=n/10;

	}
        System.out.println("Sum=" +sum);
        s.close();

}
}

