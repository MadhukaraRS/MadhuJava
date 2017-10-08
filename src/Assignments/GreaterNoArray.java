package Assignments;

public class GreaterNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {2, 14, 16, 45, 32, 43};
		 System.out.println("Array Entered:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        int b = arr[0];
	        for(int i = 0; i < arr.length; i++)
	        {
	            if(b < arr[i])
	            {
	                b = arr[i];
	            }
	        }
	        System.out.println("\nMaximum value:"+b);
	    }    
}


