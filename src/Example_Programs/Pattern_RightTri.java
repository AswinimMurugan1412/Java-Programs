package Example_Programs;

import java.util.Scanner;

public class Pattern_RightTri {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number: ");
        n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print("*");	
        	}
        	System.out.println(" ");	
        }
        
              s.close();
	}

}
