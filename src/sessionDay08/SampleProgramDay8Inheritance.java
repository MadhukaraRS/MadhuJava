
package sessionDay08;

public class SampleProgramDay8Inheritance extends IphoneOrder{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String [] arr = new String [2];
		
		
		IphoneOrder.main(arr);
		checkOrderHistory();
		checkOrderStatus();
		checkOrderDelievery();
		
	}
	
	//Overriding method
	public void newLogin() {
		System.out.println("This will override existing new login method");
	}
	
	public static void checkOrderHistory() {
		System.out.println("order History Checked");
	}
	
	public static void checkOrderStatus() {
		System.out.println("order status Checked");
	}
	
	public static void checkOrderDelievery() {
		System.out.println("order Delievered");
	}

	
}
