package OOPS;
class Employee{
	int salary=40000;
}

public class Programmer_inheritance extends Employee {
	int bonus=10000;

	public static void main(String[] args) {
		Programmer_inheritance p=new Programmer_inheritance();
		System.out.println("Salary:"+p.salary);
		System.out.println("Bonus:"+p.bonus);
		
		

	}

}
