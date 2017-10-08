package sessionDay03;

import sessionDay02.SampleProgramDay2;

public class SampleProgramDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Creating a Reference Data type
		
		 final int a;
		int b = 5;
		
		SampleProgramDay2 day3Class = new SampleProgramDay2();
		
		String result = day3Class.newStatement("Parrot", "Lion", 34);
		
		a = b+15;
		
		System.out.println(a);
		
		System.out.println(result);
		System.out.println(result);
		System.out.println(result);
		System.out.println(result);
		
		//arithmeticOperation();
		relationalOperation();
	}
	
	public static void arithmeticOperation() {
		
		int a = 15; 
		int b= 20; 
		
		
		
		int add= a+b;
		int subtract = b-a;
		int multiply = a*b;
		int divide = a/b;
		int remainder = a%b;
		a = a+1;
		int increment = a++;
		int decrement = b--;
		
		System.out.println(add);
		System.out.println(subtract);
		System.out.println(multiply);
		System.out.println(divide);
		System.out.println(remainder);
		System.out.println(a++);
		System.out.println(b--);
		
	}
	
	
public static void relationalOperation() {
		
		int a = 20;
		int b= 20; 
		
		
		
		/*boolean equals = (a==b);
		boolean notEquals = (a!=b);*/
		boolean greater = a>b;
		boolean lesser = a<b;
		boolean greaterEqual = a>=b;
		boolean lesserEqual = a<=b;
		
		boolean logicalAnd = !(lesserEqual && greaterEqual);
		boolean logicalOr = greater || greaterEqual;
		
		String m ="Java";  
		String n = "Java";
		
		boolean logicalNot = (!m.equals(n));
		System.out.println(logicalNot);
		
		a+=b; //   equal to a=a+b;
		
		
		
		
		
		
		
		//System.out.println("*********"+logicalAnd);
		//System.out.println("*********"+logicalOr);
		
		/*System.out.println(equals);
		System.out.println(notEquals);*/
		/*System.out.println(greater);
		System.out.println(lesser);
		System.out.println(greaterEqual);
		System.out.println(lesserEqual);*/
		
	}
	
	

}


