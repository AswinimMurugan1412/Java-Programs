package Example_Programs;

import java.util.Scanner;

public class RightAngleTriangle_Formula {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		s.useDelimiter("\\s");
    	System.out.print("Enter the numbers: ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
       // System.out.print(a);
       // System.out.print(b);
       // System.out.print(c);
        int A=a*a;
       int B=b*b;
        int C=c*c;
        int result=A+B;
        if(C==result)
        	 System.out.print("yes");
        else
        	 System.out.print("no");
	}

}
