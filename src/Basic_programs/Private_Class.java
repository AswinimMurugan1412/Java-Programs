package Basic_programs;
class base{
	int stud_no=12;  //private int stud_no=12;              //stud_no,stud_name=state
	protected String stud_name="Nisha";   //private String stud_name="Nisha";
     void display()                          //display =behaviour
     {
    	 System.out.println("Student ID:" +stud_no);
    	 System.out.println("Student Name:" +stud_name);
     }
}

public class Private_Class {
	// private int stud_no=12;              //stud_no,stud_name=state
     //private String stud_name="Nisha";
     //void display()                          //display =behaviour
     //{
    	 //System.out.println("Student ID:" +stud_no);
    	 //System.out.println("Student Name:" +stud_name);   
                 
	public static void main(String[] args) {
		     base obj=new base();                 //Private_Class obj=new Private_Class();
		       System.out.println("Calling the method");
		       obj.display();
		       System.out.println("Calling the state");
		       System.out.println(obj.stud_name);

	}

}
