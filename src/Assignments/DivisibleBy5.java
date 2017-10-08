package Assignments;

public class DivisibleBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 int a ;
			 System.out.println("the numbers between 1 to 100 are");
			 for (a=1;a<=100;a++) {
				if (a%5!=0)	
					System.out.println(+a );
				else 
					System.out.println("divisible by 5 - "+a);
			 }

	}
}
