package Practice_Sestion_prog;

import java.util.Scanner;

class encapsulation_prog{
private String Name;
private int Age; 
private String Country;
public String getname() {
   return Name;
}
  public int getage() {
	  return Age;
  }
  public String getcountry() {
	  return Country;
  }
  public void setname( String newValue) {
	 Name=newValue;
  }
  public void setage(int newValue) {
	  Age=newValue;
  }
  public void setcountry(String newValue) {
	  Country=newValue;
  }
}

public class Encap_prog {
	

	public static void main(String[] args) {
		encapsulation_prog obj=new encapsulation_prog();
		Scanner s=new Scanner(System.in);
		String name=s.next();
		obj.setname(name);
		int age=s.nextInt();
		obj.setage(age);
		String country=s.next();
		obj.setcountry(country);
		System.out.println("Name:" + obj.getname());
		System.out.println("Age:" + obj.getage());
		System.out.println("Country:" + obj.getcountry());

	}

}
