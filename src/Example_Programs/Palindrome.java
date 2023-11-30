package Example_Programs;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		int n,r,reverse=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
		n=s.nextInt();
		while(n>0) {
			r=n%10;
			reverse=reverse*10+r;
			n=n/10;
			
		}
		System.out.println("Reverse=" +reverse);
        if(reverse==n) {
        	System.out.print("It is a palindrome");
        }
        else
        	System.out.print("It is not a palindrome");
        	
        }
	}


