
package sessionDay05;

public class SampleProgramDay5Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayFunctions();
		twoDimensionalArray();
	}
	
	public static void arrayFunctions()
	{
		int a [] = new int [5];   //one type of declaring an One dimensional array
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		int b[] = {1 ,2, 3, 4, 5};    //another type of declaring an One dimensional array
		
		System.out.println(a[4]);
		System.out.println(b[3]);
		
		
		
		
		String courses [] = {"Java" , "Selenium", "API testing", "Performance Testing", "Dotnet"};
		System.out.println("The length of this array is "+ courses.length);
		for (int i=0; i<courses.length;i++) {
			System.out.println("Now i am doing "+courses[i]+"");
		}
		
	}
	
	public static void twoDimensionalArray() {
		
		int a[][] = new int [2][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		
		System.out.println(a[1][2]);
		
		
		
	}
}
