package sessionDay09;

public abstract class SampleProgramDay9Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		loginToAmazon();
		placeOrderAmazon();
		
	}
	
	public static void loginToAmazon() {
		System.out.println("Amazon logged in successful");
	}
	
	public static void placeOrderAmazon() {
		System.out.println("Place order successful");
	}
	
	public abstract void amazonBoxOrder();
	public abstract void flipkartBoxOrder();
	public abstract void snapDealBoxOrder();
	

}
