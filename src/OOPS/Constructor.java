package OOPS;

import java.util.Scanner;

public class Constructor {
	int emp_id,salary;
	String emp_name;
	Constructor(){ //no paramaters Constructor
		emp_id=1;
		emp_name="Hema";
		salary=20000;
	}
	Constructor(int id,String name,int sal){
		//paramaters Constructor
		emp_id=id;
		emp_name=name;
		salary=sal;
	}
	void display() {
		System.out.println("Employee detailse: ");
		System.out.println("Emp_id: "+emp_id);
		System.out.println("Emp_name: "+emp_name);
		System.out.println("Salary: "+salary);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int id,salary;
		String name;
		System.out.println("Enter the Employee Id: ");
		 id=s.nextInt();
		System.out.println("Enter the employee Name: ");
		 name=s.next();
		System.out.println("Salary: ");
	    salary=s.nextInt();
		Constructor obj=new Constructor();
		obj.display(); 
		Constructor obj1=new Constructor(2,"Ash",25000);
		obj1.display();
		Constructor obj2=new Constructor(id,name,salary);
		obj2.display();
		}

	}

