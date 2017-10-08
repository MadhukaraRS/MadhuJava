package Assignments;

public class AllDataTypes {
	public static void main(String[] args) {
		//Write a program which has all different types of data types (mainly int, string, boolean) used and perform any operation.
	
		int a = 1987;
		int b = 1211;
		
		boolean equals = (a==b);
		boolean notEquals = (a!=b);
		boolean greater = a>b;
		boolean lesser = a<b;
		boolean greaterEqual = a>=b;
		boolean lesserEqual = a<=b;
		boolean logicalAnd = (lesserEqual && greaterEqual);
		boolean logicalOr = greater || greaterEqual;
		
		String m ="Madhu";  
		String n = "Vinod";
		
		boolean logicalNot = (m==n);
		
		
		 
		System.out.println("equals -" +equals);
		System.out.println("notequals - " +notEquals);
		System.out.println("greater -" +greater);
		System.out.println("lesser -" +lesser);
		System.out.println("greaterEqual -" +greaterEqual);
		System.out.println("lesserEqual -" +lesserEqual);
		System.out.println("logicalAnd -"+logicalAnd);
		System.out.println("logicalOr -"+logicalOr);
		System.out.println(logicalNot);
	}

}
