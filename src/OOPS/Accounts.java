package OOPS;

import java.util.Scanner;
import java.io.*;

public class Accounts {
	static int acc_id;
	static String acc_name;
	static String address;
	static long contact;
	static int depositeamount;
	static void display(int id,String name,String address,long contact,int depositeamount) {
		System.out.println("Account details");
		System.out.println("Account Id: " +acc_id);
		System.out.println("Account Name: " +acc_name);
		System.out.println("Address: \n"+address);
		System.out.println("Contact: "+contact);
		System.out.println("Deposite Amount: "+depositeamount);
	}
	public static void main(String[] args) throws IOException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Account Id: ");
		acc_id=s.nextInt();
		System.out.println("Enter the Account Name: ");
		acc_name=s.next();
		System.out.println("Enter the Address: ");
		//address=s.next();
		DataInputStream object=new DataInputStream(System.in);
		String address=object.readLine();
		s.nextLine();
		System.out.println("Enter the Contact number: ");
		contact=s.nextLong();
		System.out.println("Enter the Deposite Amount: ");
		depositeamount=s.nextInt();
        display(acc_id,acc_name,address,contact,depositeamount);
	    s.close();

	}

}
