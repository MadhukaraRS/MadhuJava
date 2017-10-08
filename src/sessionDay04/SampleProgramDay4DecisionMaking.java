package sessionDay04;

public class SampleProgramDay4DecisionMaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//ifElseConditionExample();
		//nestedIfConditionExample();
		for(int a=0; a<5;a++) {
		switchCaseConditionExample("allOperations");
	
	}
	}
	
	/*public static void ifConditionExample() {
		
		int a =50;
		int b=40;
		
		if(a<b) {
			System.out.println("The boolean expression is true and this line is executed");
		}
		
		System.out.println("The boolean expression is false and this line is not executed");
		
	}*/
	
/*public static void ifElseConditionExample() {
		
		int a =10;
		int b=40;
		
		if(a<b) {
			System.out.println("The boolean expression is true and this line is executed");
		}
		else {
		System.out.println("The boolean expression is false and this line is not executed");
		}
		
		System.out.println("Conditional Staements are executed completely");
		
	}*/

/*public static void nestedIfConditionExample() {
	
	int a =60;
	int b=40;
	
	if(a<b || b==40) {
		System.out.println("The boolean expression is true and this line is executed");
		
		System.out.println("The inner boolean expression is true and this line is executed");
	
	}
	
	if(a<b) {
		System.out.println("The boolean expression is true and this line is executed");
		if(b==40) {
		System.out.println("The inner boolean expression is true and this line is executed");
		}
	}
	
	
}
*/
public static void switchCaseConditionExample(String operation) {
	int result;
	int result1;
	int result2;
	int result3;

	int a =50;
	int b=35;
	//String operation = "fraction";
	
	switch(operation) {
	
	case "allOperations":

	case "add":
		result = a+b;
		System.out.println(result);
		//break;
		
	case "subtract":
		result = a-b;
		System.out.println(result);
		//break;
		
	case "multiply":
		result = a*b;
		System.out.println(result);
		//break;
		
	case "division":
		result = a/b;
		System.out.println(result);
		break;
		
	
		
	default: 
		System.out.println("Operation not allowed");
			
	}
	
	System.out.println("Operation executed for: " +operation);
	
}


/*public static void switchCasePseudoCode(String operation) {
	int result;
	int result1;
	int result2;
	int result3;

	int a =50;
	int b=35;
	//String operation = "fraction";
	
	switch(operation) {
	
	case "Mobile":
		purchaseMobileItem();
		break;

	case "Clothes":
		purchaseClothesItem();
		break;
		
	case "Television":
		purchaseTelevisonItem();
		break;
		
	case "Shoes":
		purchaseShoesItem();
		break;
		

	default: 
		System.out.println("Product not allowed");
			
	}
	
	System.out.println("Operation executed for: " +operation);
	
}*/

}

