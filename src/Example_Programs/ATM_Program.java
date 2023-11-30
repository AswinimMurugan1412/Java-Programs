package Example_Programs;

import java.util.Scanner;

public class ATM_Program {

	public static void main(String[] args) {
		int num1=1000,balance,withdraw,deposite;
		Scanner s=new Scanner(System.in);
		while(true) {
		System.out.println("WELCOME");
		System.out.println("Select The Options:");
        System.out.println("1 To Withdraw");
        System.out.println("2 To deposite");
        System.out.println("3 To Check balance");
        System.out.println("4 To Exit");
        int n= s.nextInt();
        switch(n) {
	
		case 1:
			int w2;
			System.out.print("Enter the amount to withdraw: ");
			w2=s.nextInt();
			withdraw=w2;
			balance=num1-w2;
			System.out.println("Balance="+balance);
			break;
		case 2:
			int d2;
			System.out.print("Enter the amount to deposite: ");
			d2=s.nextInt();
			deposite=d2;
			balance=num1+d2;
			System.out.println("Balance="+balance);
			break;
		case 3:
			balance=num1;
			System.out.println("Balance="+balance);
			break;
		case 4:
			System.out.println("Exit");
	}

}
}
}