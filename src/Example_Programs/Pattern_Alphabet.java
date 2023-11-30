package Example_Programs;

import java.util.Scanner;

public class Pattern_Alphabet {

	public static void main(String[] args) {
		int n,ascii;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number: ");
        n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
        	ascii=65;
        	for(int j=1;j<=i;j++) {
        		System.out.printf("%c",ascii);
        		ascii++;
        	}
        		System.out.println();
        	}
 
        }

	}


