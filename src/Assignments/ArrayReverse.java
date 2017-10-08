package Assignments;

public class ArrayReverse {

	public static void main(String[] args) {
        int[] arr = { 21, 32, 43, 54, 65, 76, 87, 98, 109, 120 }; //entering the elements into the array
        System.out.println("Array Entered:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) { //comparing the array 
            int a = arr[i];
            arr[i] = arr[j];
            arr[j] = a;
        }
        System.out.println("\nReverse Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
