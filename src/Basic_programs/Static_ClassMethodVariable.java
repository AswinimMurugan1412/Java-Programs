package Basic_programs;

public class Static_ClassMethodVariable {
	private static char grade='A';
	static void test() {
		System.out.println("Grade:Inside static method " +grade);
	}
	static class Nested{
		public void fun() {
			System.out.println("Grade:Inside Nested class: " +grade);
			
		}
		
	}
	public class check{
		void display() {
			System.out.println("Check class grade: " +grade);
		}
	}

	public static void main(String[] args) {
		Static_ClassMethodVariable.Nested obj= new Static_ClassMethodVariable.Nested();
		obj.fun();
		System.out.println("static variable: " +grade);
		test();
		Static_ClassMethodVariable.check ck= new Static_ClassMethodVariable().new check();
		ck.display();
		

	}

}
