package Example_Programs;

import java.util.Scanner;

public class PositiveNegative_program {

	public static void main(String[] args) {
		int num;
		//String str;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the value: ");
		num=s.nextInt();       //str=s.next();    //n=Integer.parseInt(str); // type conversion=string into integer                     
        if(num>0) {
        	System.out.println("Positive Number");
        	
        }
        else if(num==0)
    		System.out.println("Zero");	
    		
        else if(num<0)
        		System.out.println("Negative Number");
        	else 
        		System.out.println("Invalid");
        		
        	}
        	
        

	}


