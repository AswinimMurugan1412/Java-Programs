package Example_Programs;

import java.util.Scanner;

public class Exp1 {

	public static void main(String[] args) {
		int n,r,reverse=0,sum,s1,result;
		Scanner s=new Scanner(System.in);
		//System.out.print("Enter the number:");
		n=s.nextInt();
		while(n>0) {
			r=n%10;
			reverse=reverse*10+(++r);
			n=n/10;
		}
		
		while(reverse!=0) {
				r=reverse%10;
				System.out.print(r);
				 reverse=reverse/10;
				
				
			
	}
}
}


	


