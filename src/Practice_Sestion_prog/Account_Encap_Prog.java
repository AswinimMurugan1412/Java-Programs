package Practice_Sestion_prog;

import java.util.Scanner;

class bank_details{
	private String acc_no;
	private float balance;
	public String getaccno() {
		return acc_no;
	}
	public float getbal() {
		return balance;
	}
	 public void setaccno( String newValue) {
		 acc_no=newValue;
}
	 public void setbal( float newValue) {
		 balance=newValue;
	 }
}

public class Account_Encap_Prog {

	public static void main(String[] args) {
		bank_details b=new bank_details();
		Scanner s=new Scanner(System.in);
		String account=s.next();
		b.setaccno(account);
	    float balance=s.nextFloat();
        b.setbal(balance);
        System.out.println("Account No:" + b.getaccno());
		System.out.println("Balance:" + b.getbal());
	}

}
