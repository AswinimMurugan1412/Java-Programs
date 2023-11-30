package Practice_Sestion_prog;

import java.util.Scanner;

public class GCD2_prog {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.useDelimiter("[\\s]+");
		int n= s.nextInt();
		int m= s.nextInt();
		int gcd=1;
		for(int i=1;i<=m && i<=n;++i) {
		if(m%i==0 &&n%i==0) {
			gcd=i;
        //System.out.println("GCD of" + m+","+ n+ " is "+ gcd);
		}
		}
	if(gcd==1)
		System.out.println("-1");
	else
		System.out.println(gcd);
	}
}


	
