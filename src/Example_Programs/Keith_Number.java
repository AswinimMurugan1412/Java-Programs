package Example_Programs;

import java.util.Scanner;

public class Keith_Number {

	public static void main(String[] args) {
		int f1,f2,f3,f4;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number:");
        int n= s.nextInt();
        String str1=String.valueOf(n);
        if(str1.length()==3) {
        	f3=n%10;;
        	n=n/10;;
        	f2=n%10;;
        	n=n/10;;
        	f1=n%10;;
        	n=n/10;;
        	System.out.print(f1+" "+f2+" "+f3+" ");
        	for(int i=3;i<=10;i++) {
        		f4=f1+f2+f3;
        		System.out.print(f4+" ");
        		f1=f2;
        		f2=f3;
        		f3=f4;
        	}
        }
	}

}
