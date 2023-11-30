package OOPS;

import java.util.Scanner;

public class Recursion_Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//System.out.print("Enter the number: ");
       // boolean n=s.nextBoolean();
        boolean flag=palindromeCheck("madam");
        System.out.println(flag);
        flag=palindromeCheck("nine");
        System.out.println(flag);
        flag=palindromeCheck("malayalam");
        System.out.println(flag);
	}
  public static boolean palindromeCheck(String s) {
	  if(s.length()==0 || s.length()==1) {
		  return true;
	  }
	  if (s.charAt(0)==s.charAt(s.length()-1)) {
		  return palindromeCheck(s.substring(1,s.length()-1));
	  }
	  return false;
  }
}
