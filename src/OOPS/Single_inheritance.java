package OOPS;
class Person{
	String name;
	int age;
	void getperinfo (String nam,int ag) {
		name=nam;
		age=ag;
	}
	void putperinfo () {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		
	}
}
    class Student extends Person{
    	int total;
    	char grade;
    	void getstuinfo (String nam,int ag,int tot,char gar) {
    		getperinfo(nam,ag);
    		total=tot;
    		grade=gar;
    	}
    	void putstuinfo() {
    		putperinfo();
    		System.out.println("Total:"+total);
    		System.out.println("Grade: "+grade);
    	}
    }

public class Single_inheritance {

	public static void main(String[] args) {
		Student s=new Student();
		s.getstuinfo("Honey", 22, 98, 'A');
         s.putstuinfo();
	}

}
