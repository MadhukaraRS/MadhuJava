package sessionDay08;

public class SampleProgramDay8Inheritance3 extends IphoneOrder{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String [] arr = new String [2];
		
		
		IphoneOrder.main(arr);
		checkPaymentPass();
		checkPaymentFail();
		checkPaymentHold();
		
	}
	

	
	public static void checkPaymentPass() {
		System.out.println("Payment PASS");
	}
	
	public static void checkPaymentFail() {
		System.out.println("Payment FAIL");
	}
	
	public static void checkPaymentHold() {
		System.out.println("Payment HOLD");
	}

	
}
