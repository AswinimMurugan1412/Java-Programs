package Practice_Sestion_prog;

public class LCM_prog {
	public static void main(String[] args) {
		int n1=72,n2=120,gcd=1;
		for(int i=1;i<=n1 && i<=n2;++i) {
		if(n1%i==0 &&n2%i==0)
			gcd=i;
		}
		int lcm=(n1*n2)/gcd;
        System.out.println("THE LCM of "+ n1+" " +n2 + "is "+lcm);
	}

}


