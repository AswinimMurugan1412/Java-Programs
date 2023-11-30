package Assisement1;

import java.util.Scanner;

public class Test_Prog1 {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number: ");
        n=s.nextInt();
        for(int i=1;i<=n;i++) {
        	for(int j=n;j+i>n;j--) {
        	System.out.print(j +" ");
        }
        
        System.out.println();
	}

}
}
