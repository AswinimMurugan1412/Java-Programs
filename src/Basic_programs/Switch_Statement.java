package Basic_programs;

import java.util.Scanner;

public class Switch_Statement {

	public static void main(String[] args) {
		char ch;
		 Scanner s=new Scanner(System.in);
		 System.out.print("Enter the gread :");
		 ch=s.next().charAt(0);
		 switch(ch) {
		 case 'A':
			 System.out.println("Excellent!");
			 break;
		 case 'B':
		 case 'C':
			 System.out.println("Well done");
			 break;
		 case 'D':
			 System.out.println("you passed");
		 case 'F':
			 System.out.println("Better try again");
			 break;
		 
		 default:
			 System.out.println("Invalid");
		 }
		 System.out.println("Your grade is "+ch);
		 
	}

}
