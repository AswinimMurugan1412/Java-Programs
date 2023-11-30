package Basic_programs;
import java.util.Scanner;
public class Scanner_class {

	public static void main(String[] args) {
		int num1 = 0;int num2;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value of num1= ");
		num1=s.nextInt();
		System.out.print("Enter the value of num2= ");
		num2=s.nextInt();
		System.out.println(num1+num2);
		

	}

}
