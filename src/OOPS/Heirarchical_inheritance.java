package OOPS;
class parents{
	void show() {
		System.out.println("We are parents");
	}
}
 class son extends parents{
	void disp() {
		System.out.println("i am son class");
	}
}
 class daughter extends parents{
		void disp() {
			System.out.println("i am daughter class");
		}
	}


public class Heirarchical_inheritance {

	public static void main(String[] args) {
		son s=new son();
		daughter d=new daughter();
		s.show();
		d.disp();
		s.disp();
		d.disp();
	}

}
