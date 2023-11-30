package Matrix;
import java.util.Scanner;

public class Declaration {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row=3,col=3;
		int a[][]={{1,2,3},
				{4,5,6},
				{7,8,9}};
		int b[][]=new int[row][col];
		
		System.out.print("Enter the  Matrix B: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				b[i][j]=s.nextInt();
			}
			}
		System.out.print("2D Matrix b: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
		}
		System.out.print("2D Matrix A: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
