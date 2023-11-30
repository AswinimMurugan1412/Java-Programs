package Example_Programs;

import java.util.Scanner;

public class Prime_1ToN {

	public static void main(String[] args) {
		int count=0,number=2;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number:");
        int n= s.nextInt();
        for(int i=2; i<=n; i++) {
       if (number==2) { 
    	   System.out.print(2+" ");
    	   number++;
       }
       else {
    	   Task:
    	   for(int j=2;j<=number/2;j++) {
    		   if(number%j==0) {
    			   number++;
    			   continue Task;
    		   }
    	   }
       }
      System.out.print(number++ +" ");
        }
	}
}
