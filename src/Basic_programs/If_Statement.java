package Basic_programs;

import java.util.Scanner;

public class If_Statement {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the value a:");
		a=s.nextInt();
		System.out.print("Enter the value b:");
		b=s.nextInt();
        if(a>b) {
        	c=a;
        	System.out.print("C="+c);
        System.out.println("a is Greater than b ="+c);
        }
            else {
            	c=b;
            	System.out.print("C="+c);
        	 System.out.println("b is Greater than a:"+c);
        //System.out.print("C="+c);
        s.close();
        }
	}

	}


