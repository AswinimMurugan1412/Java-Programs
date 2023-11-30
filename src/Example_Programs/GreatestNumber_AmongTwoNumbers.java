package Example_Programs;
import java.util.Scanner;

public class GreatestNumber_AmongTwoNumbers {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the value a:");
		a=s.nextInt();
		System.out.print("Enter the value b:");
		b=s.nextInt();
		System.out.print("Enter the value c:");
		c=s.nextInt();
        if(a>b && a>c) {
        System.out.print("a is Greater ="+a);
        }
        else if(b>a && b>c) {
            System.out.print("b is Greater ="+b);
        }
            else {
        	 System.out.print("c is Greater:"+c);
        //System.out.print("C="+c);
        s.close();
        }
	}

}
