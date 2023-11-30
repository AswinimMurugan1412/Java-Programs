package Basic_programs;

public class String_Buffer {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer("20");
		StringBuffer s3=new StringBuffer("welcome");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		s1.append("sd f f a aFA fasdfasdg8034ty8035 rg sg asdg as g asdg asdgoasdgasdgasdg");
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		s1.setLength(5);
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		System.out.println(s1);
		System.out.println(s1.reverse());
	}

}
