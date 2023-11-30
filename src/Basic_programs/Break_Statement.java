package Basic_programs;
import java.util.Scanner;

public class Break_Statement {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
		if(i==6)     // if(i==6 || i==8)  
			//break;
			continue;
			else
				System.out.println("i=" +i);
		}
		System.out.println("completed");
	}

}
