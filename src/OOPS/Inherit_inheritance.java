package OOPS;
class Simple{
	private int pri;
	int def;
	protected int pro;
	public int pub;
	Simple(){
	   pri=10;
	   def=20;
	   pro=30;
	   pub=40;
	}
}
 class Inherit_inheritance extends Simple {
	 Inherit_inheritance(){
		 //pri=100 cant access private
		 def=200;
		 pro=300;
		 pub=400;	 
	 }

	public static void main(String[] args) {
		Inherit_inheritance i=new Inherit_inheritance();
		//cant access private
		//System.out.println(i.pri);
		System.out.println(i.def);
		System.out.println(i.pro);
		System.out.println(i.pub);

	}

}
 