package Example_Programs;

import java.util.Scanner;

public class XOR_prog {

	public static void main(String[] args) {
		int n,x;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number : ");
        n = s.nextInt();
        x=n%4;
        if (x==0) 
        	System.out.println(n);
        else if (x==1)
        System.out.println("1");
        else if (x==2)
        System.out.println(n+1);
        else if (x==3)
        System.out.println("0");
        
	}

}
