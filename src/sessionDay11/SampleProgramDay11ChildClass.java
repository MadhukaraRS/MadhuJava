package sessionDay11;

public class SampleProgramDay11ChildClass implements SampleProgramDay11Interface2{
	
	public static void checkTransactions() {
		System.out.println("Transactions list displayed successfully");
	}
	
	public static void checkOrderStatus() {
		System.out.println("Order status delievered successfully");
	}
	
	public static void checkPaymentStatus() {
		System.out.println("Payment Completed successfully");
	}

	@Override
	public void addProfilePhoto() {
		// TODO Auto-generated method stub
		System.out.println("Photo added");
	}

	@Override
	public void addPhoneNumber() {
		// TODO Auto-generated method stub
		System.out.println("Phone number added");
	}

}
