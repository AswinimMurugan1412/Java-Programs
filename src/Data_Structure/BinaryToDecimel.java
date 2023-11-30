package Data_Structure;

public class BinaryToDecimel {
	static public boolean isPowerOfTwo(int x) {
		return(x!=0) &&((x& (x-1))==0);
	}

	public static void main(String[] args) {
		int number=0b1010;
		System.out.println(number);

	}

}
