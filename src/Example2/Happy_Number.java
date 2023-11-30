package Example2;

import java.util.Scanner;

public class Happy_Number {
	public static int isHappyNumber(int num){  
        int rem = 0, sum = 0;  
          
        //Calculates the sum of squares of digits  
        while(num > 0){  
            rem = num%10;  
            sum = sum + (rem*rem);  
            num = num/10;  
        }  
        return sum;  
    }  
      

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 System.out.print("enter the number:");
		 int num=s.nextInt();
		 int result = num;  
         
	        while(result != 1 && result != 4){  
	            result = isHappyNumber(result);  
	        }   
	        if(result == 1)  
	            System.out.println(" is a happy number");   
	        else if(result == 4)  
	            System.out.println(" is not a happy number");     
	    }  


}
