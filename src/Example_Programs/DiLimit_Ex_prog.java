package Example_Programs;

import java.util.Scanner;

public class DiLimit_Ex_prog {

	public static void main(String[] args) {
		int count=0;
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
        s.useDelimiter("[\\s]+");
        int l= s.nextInt();
		int r= s.nextInt();
		if(l<=n && r>=n) 
			System.out.println("yes");
			else
				System.out.println("no");	
		}
}
