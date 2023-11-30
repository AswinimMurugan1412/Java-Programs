package Practice_Sestion_prog;
import java.util.Scanner;
class emp_details{
	private int ID;
	private String Name;
	private double Salary;
	public int getid() {
		return ID;
	}
	public String getname() {
		return Name;
	}
	public double getsalary() {
		return Salary;
	}
	 public void setid( int newValue) {
		 ID=newValue;
    }
	 public void setname( String newValue) {
		 Name=newValue;
    }
	 public void setsalary( double newValue) {
		 Salary=newValue;
    }
		
	}


public class Employee_encap_prog {

	public static void main(String[] args) {
		emp_details e=new emp_details();
		Scanner s=new Scanner(System.in); 
		int Id=s.nextInt();
		e.setid(Id);
		String name=s.next();
		e.setname(name);
		double salary=s.nextDouble();
		e.setsalary(salary);
		//salary.setMaximumFractionDigits(2);
		System.out.println("Employee Id="+e.getid());
		System.out.println("Employee Name="+e.getname());
		System.out.printf("Employee Salary="+"%.2f"+" $ "+e.getsalary());
	}

}
