package Example_Programs;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		int n, n1,n2;
		Scanner s=new Scanner(System.in);
		while(true) {
         System.out.print("enter the first number:");
         n1=s.nextInt();
         System.out.print("enter the second number:");
         n2=s.nextInt();
         System.out.println("Choose the operator you want to perfoerm");
			System.out.println("Choose 1 for Addition");
			System.out.println("Choose 2 for subtraction");
			System.out.println("Choose 3 for Multiplication");
			System.out.println("Choose 4 for division");
			System.out.println("Choose 5 for exit");
			n=s.nextInt();
			switch(n) {
			
			case 1:
				int add;
				add=n1+n2;
				System.out.println("result:"+add);
				break;
			case 2:
				int sub;
				sub=n1-n2;
				System.out.println("result:"+sub);
				break;
			case 3:
				int mul;
				mul=n1*n2;
				System.out.println("result:"+mul);
				break;
			case 4:
				float div;
				div=(float) n1/n2;
				System.out.println("result:"+div);
				break;
			case 5:
				int exit;
				System.out.println("exit");
				break;	
		}
       break;
	} 
		}
		}
