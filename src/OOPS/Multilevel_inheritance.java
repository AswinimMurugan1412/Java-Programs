package OOPS;
class grand_father{
	void show1() {
		System.out.println("I am show function in grand_father class");
	
	}
}
class father extends grand_father {
	void show2() {
		System.out.println("I am show function in father class");
	}
}
class son1 extends father {
	void show3() {
		System.out.println("I am show function in son class");
	}
}
class grand_son extends son1 {
	void show4() {
		System.out.println("I am show function in grand_son class");
	}
}
public class Multilevel_inheritance {

	public static void main(String[] args) {
	grand_son gs=new grand_son();
	gs.show4();
	gs.show3();
	gs.show2();
	gs.show1();

	}

}
