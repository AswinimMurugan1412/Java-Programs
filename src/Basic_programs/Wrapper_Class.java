package Basic_programs;

public class Wrapper_Class {

	public static void main(String[] args) {
		/*Integer x=10;
		Float f=x.floatValue();
		System.out.println(x.floatValue());
		System.out.println("f= "+f);
		String str="10";
		Integer y=Integer.parseInt(str);
		Double d=y.doubleValue();
		System.out.println("y= "+y);
		System.out.println("d= "+d);
		System.out.println(d.toString());
		System.out.println(String.valueOf(str));
		Integer num1=10;
		Integer num2=10;
		System.out.println(num1.compareTo(num2));
		System.out.println(num1.equals(num2));
		String a="hello";
		String b="hello";
		if(a.equals(b))
			System.out.println("Both the strings are equals");
		if (a.compareTo(b)==0)
			System.out.println("Both the String are equals");
		
		Double f1=20.54;
		System.out.println("abs =" +Math.abs(4-7));
		System.out.println("Ceil =" +Math.ceil(f1));
		System.out.println("Round =" +Math.round(f1));
		System.out.println("Floor =" +Math.floor(f1));
		System.out.println("Minimum value: " +Math.min(12, 24));
		System.out.println("Maximum Value: " +Math.max(12, 24));
		System.out.println("Power Value: " +Math.pow(2, 3));
		System.out.println("Escape Sequence =\r");
		System.out.println("Escape Sequence =\n");
		System.out.println("This is \"Java\" Program");
		
		//Character methods
		System.out.println(Character.isLetter('5'));
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isLowerCase('B'));
		System.out.println(Character.isLowerCase('\n'));
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isUpperCase('c'));
		System.out.println(Character.isUpperCase('\t'));
		System.out.println(Character.toUpperCase('h'));
		System.out.println(Character.toLowerCase('V'));
		*/
		String str2="Welcome";
		String str3="welcome";
		System.out.println(str2.charAt(5));
		//System.out.println(str2.charAt(6));
		System.out.println(str2.compareTo(str3));
		System.out.println(str2.compareToIgnoreCase(str3));
		
		System.out.println(str2.concat(str3));
		System.out.println(str2.length());
		System.out.println(str2.substring(4));
		System.out.println(str2.substring(2,7));
		System.out.println(str2.replace('e','a')); 
		
		
	}

}
