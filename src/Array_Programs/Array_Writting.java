package Array_Programs;

public class Array_Writting {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};             //integer array
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			}
		//for each loop
		System.out.println("For Each Loop:");
		for(int a:arr) {
			System.out.println(a);
		}
		System.out.println(arr);  //object referance
	}
}
