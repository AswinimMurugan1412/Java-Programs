package Example_Programs;

import java.util.Scanner;

public class Stud_info_switchstatement {

	public static void main(String[] args) {
		int stud_id,mark1,mark2,mark3;
		String stud_name;
		float total,avg;
		 Scanner s=new Scanner(System.in);
		 System.out.print("Enter the Student ID:");
		 stud_id=s.nextInt();
		 System.out.print("Enter the Student name:");
         stud_name=s.next();
         System.out.print("Enter the Mark1:");
         mark1=s.nextInt();
         System.out.print("Enter the Mark2:");
         mark2=s.nextInt();
         System.out.print("Enter the Mark3:");
         mark3=s.nextInt();
         total=mark1+mark2+mark3;
         avg=total/3;
         if(avg>=90) 
        	 System.out.print("Excellent"); 
         else if(avg>=80) 
            	 System.out.print("very good");
         else if(avg>=70) 
                	 System.out.print("Good"); 
         else if(avg>=60) 
                	 System.out.print("improve");
         else if(avg>=50) 
                	 System.out.print("Work Hard");
         else if(avg>=40) 
                	 System.out.print("Fail");
         }
                  
	}  


