package Assignments;

public class ProductArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 4, 5, 6, 7, 8} ;
		 int a = 30;
		 
		 System.out.println("Array Entered:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
		// Two for loop example
		/*for (int i = 0; i < arr.length; i++) {
		 for (int j = i + 1; j < arr.length; j++) {
		  	int product = arr[i]*arr[j]; 
		 
	     if (product == a) {
	     System.out.println("\nThe two numbers whose product is 30 are:");	 
		 System.out.println(+arr[i]);
		 System.out.println(+arr[j]);*/
		 
		 
		 for (int i = 0; i < arr.length; i++) {
		 	 
		 		 int num = a/arr[i];
		 		 if (num * arr[i]== a) {
			     System.out.println("\nThe two numbers whose product is 30 are:");	 
				 System.out.println(+arr[i] );
				 System.out.println(+num);
		 		 }
		 }
	}
}

		 
		 
	     
