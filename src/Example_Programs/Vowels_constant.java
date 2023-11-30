package Example_Programs;

import java.util.Scanner;

public class Vowels_constant {

	public static void main(String[] args) {
		char ch;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number: ");
		ch=s.next().charAt(0);
        switch(ch){
        case 'a' | 'A':
        case 'e' | 'E':
        case 'i' | 'I':
        case 'o' | 'O':
        case 'u' | 'U':
        	System.out.print("Vowel");
        	break;
        	default:
        		System.out.print("Constant");	
        }

	}

}
